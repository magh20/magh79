package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClientRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public ClientRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit (false);
    }
    public List<ClientEnti> select(ClientEnti personEnti) throws Exception {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select * from client where username = ? and pass=? ");
        preparedStatement1.setString(1, personEnti.getUsername());
        preparedStatement1.setString(2, personEnti.getPass());
        ResultSet resultSet = preparedStatement1.executeQuery();
        List<ClientEnti> personEntiList=new ArrayList<>();
        if (resultSet.next()) {
            System.out.println("user & pass is correct.\nwelcome : " + resultSet.getString("username"));
            selecting();
        }else {
                System.out.println("this user isn't exist!");
                System.exit(0);
            }
        return personEntiList;
    }
    public void update(ClientEnti clientEnti)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("update client set id=?,internet_size=?,price=? where username=? and pass=?");
        preparedStatement.setInt(1,clientEnti.getId());
        preparedStatement.setInt(2,clientEnti.getInternet_size());
        preparedStatement.setInt(3,clientEnti.getPrice());
        preparedStatement.setString(4,clientEnti.getUsername());
        preparedStatement.setString(5,clientEnti.getPass());
        preparedStatement.executeUpdate();
        System.out.println("saved.");
        selecting();
    }
    private List<ClientEnti> selecting() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM client");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<ClientEnti> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            ClientEnti personEnti=new ClientEnti (); // call by reference
            personEnti.setUsername (resultSet.getString ("username"));
            personEnti.setPass(resultSet.getString("pass"));
            personEnti.setId(resultSet.getInt("id"));
            personEnti.setPrice(resultSet.getInt("price"));
            personEnti.setInternet_size(resultSet.getInt("internet_size"));
            personEntiList.add (personEnti);
        }
        return personEntiList;
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
