package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit(false);
    }
    public void insert(Enti enti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into form(name,family,melicode,phonenumber,address,skill,age,exprience) values (?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,enti.getName());
        preparedStatement.setString(2,enti.getFamily());
        preparedStatement.setString(3,enti.getMelicode());
        preparedStatement.setString(4,enti.getPhonenumber());
        preparedStatement.setString(5,enti.getAddress());
        preparedStatement.setString(6,enti.getSkill());
        preparedStatement.setString(7,enti.getAge());
        preparedStatement.setString(8,enti.getExperience());
        System.out.println("saved. " + preparedStatement.executeUpdate());
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
