package model;
import view.Form;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonRepo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public static List<String> users = new ArrayList<>();
    public static List<String> passes = new ArrayList<>();

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit (false);
    }
    private void insert(PersonEnti personEnti) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into person3 (name,username,pass,email) values (?,?,?,?)");
        preparedStatement.setString(1, personEnti.getName());
        preparedStatement.setString(2, personEnti.getUser());
        preparedStatement.setString(3, personEnti.getPass());
        preparedStatement.setString(4, personEnti.getEmail());
        System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
        System.out.println("user create.");
        selecting();
    }
    public List<PersonEnti> select(PersonEnti personEnti) throws Exception {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select * from person3 where username = ? and pass=? ");
        preparedStatement1.setString(1, personEnti.getUser());
        preparedStatement1.setString(2, personEnti.getPass());
        ResultSet resultSet = preparedStatement1.executeQuery();
        List<PersonEnti> personEntiList=new ArrayList<>();
        if (resultSet.next()) {
            System.out.println("user & pass is correct.\nwelcome : " + resultSet.getString("username"));
            Form form=new Form();
            form.success();
        } else {
            System.out.println("your user or pass is incorrect!");
            Form form=new Form();
            form.faild();
        }
        return personEntiList;
    }
    public void check(PersonEnti personEnti) throws Exception{
        PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person3 where username = ? and pass=? ");
        preparedStatement2.setString(1, personEnti.getUser());
        preparedStatement2.setString(2, personEnti.getPass());
        ResultSet resultSet = preparedStatement2.executeQuery();
        if (resultSet.next()) {
            System.out.println("this user is created already!");
        }else {
            insert(personEnti);
        }
    }
    public List<PersonEnti> selecting() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM person3");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<PersonEnti> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            PersonEnti personEnti=new PersonEnti (); // call by reference
            personEnti.setName (resultSet.getString ("name"));
            personEnti.setUser (resultSet.getString ("username"));
            personEnti.setPass(resultSet.getString("pass"));
            personEnti.setEmail(resultSet.getString("email"));
            personEntiList.add (personEnti);
            users.add(resultSet.getString("username"));
            passes.add(resultSet.getString("password"));
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
