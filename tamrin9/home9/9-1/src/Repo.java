import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repo implements AutoCloseable{
        private Connection connection;
        private PreparedStatement preparedStatement;

    public Repo()throws Exception{
        Class.forName ("oracle.jdbc.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit (false);
    }

    public void insert(Enti enti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into myinfo (name,family,melicode) values (?,?,?)");
        preparedStatement.setString(1,enti.getName());
        preparedStatement.setString(2,enti.getFamily());
        preparedStatement.setString(3,enti.getMelicode());
        preparedStatement.executeUpdate();
        System.out.println("saved.");
    }

    public List<Enti> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from myinfo");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Enti> entis=new ArrayList<>();
        while (resultSet.next()){
            Enti enti=new Enti();
            enti.setName(resultSet.getString("name"));
            enti.setFamily(resultSet.getString("family"));
            enti.setMelicode(resultSet.getString("melicode"));
            entis.add(enti);
        }
        return entis;
    }
    public void commit() throws Exception{
        connection.commit ();
    }

    public void rollback() throws Exception{
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
