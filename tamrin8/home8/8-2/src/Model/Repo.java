package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Repo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static List<String> users = new ArrayList<>();
    public static List<String> passes = new ArrayList<>();
    public Repo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit(false);
    }
    public void insert(Enti enti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into userz (name,username,pass,email) values (?,?,?,?)");
        preparedStatement.setString(1,enti.getName());
        preparedStatement.setString(2,enti.getUsername());
        preparedStatement.setString(3,enti.getPass());
        preparedStatement.setString(4,enti.getEmail());
        preparedStatement.executeUpdate();
    }
    public void update(String Username,String Pass,Enti enti)throws Exception{
        preparedStatement=connection.prepareStatement("update userz set(name=?,username=?,pass=?,email=?) where username=? and pass=?");
        preparedStatement.setString(1,enti.getName());
        preparedStatement.setString(2,enti.getUsername());
        preparedStatement.setString(3,enti.getPass());
        preparedStatement.setString(4,enti.getEmail());
        preparedStatement.setString(5,Username);
        preparedStatement.setString(6,Pass);
        System.out.println("updated. " +preparedStatement.executeUpdate());
    }
    public List<Enti> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from userz");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Enti> entityList = new ArrayList<>();
        while (resultSet.next()){
            Enti entity = new Enti();
            entity.setName(resultSet.getString("name"));
            entity.setUsername(resultSet.getString("username"));
            entity.setPass(resultSet.getString("password"));
            entity.setEmail(resultSet.getString("email"));
            entityList.add(entity);
            users.add(resultSet.getString("username"));
            passes.add(resultSet.getString("password"));
        }
        return entityList;
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
