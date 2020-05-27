package model.repository;

import model.entity.PersonEnti;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName ("oracle.jdbc.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit (false);
    }
    private void insert(PersonEnti personEnti) throws Exception {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into person2 (name,username,pass,email) values (?,?,?,?)");
        preparedStatement.setString(1, personEnti.getName());
        preparedStatement.setString(2, personEnti.getUser());
        preparedStatement.setString(3, personEnti.getPass());
        preparedStatement.setString(4, personEnti.getEmail());
        System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
        System.out.println("user create.");
        selecting();
    }
    public List<PersonEnti> select(PersonEnti personEnti) throws Exception {
        PreparedStatement preparedStatement1 = connection.prepareStatement("select * from person2 where username = ? and pass=? ");
        preparedStatement1.setString(1, personEnti.getUser());
        preparedStatement1.setString(2, personEnti.getPass());
        ResultSet resultSet = preparedStatement1.executeQuery();
        List<PersonEnti> personEntiList=new ArrayList <> ();
        if (resultSet.next()) {
            System.out.println("user & pass is correct.\nwelcome : " + resultSet.getString("username"));
            selecting();

        } else {
            System.out.println("your user or pass is incorrect!");
        }
        return personEntiList;
    }
    public void check(PersonEnti personEnti) throws Exception{
        PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person2 where username = ? and pass=? ");
        preparedStatement2.setString(1, personEnti.getUser());
        preparedStatement2.setString(2, personEnti.getPass());
        ResultSet resultSet = preparedStatement2.executeQuery();
        if (resultSet.next()) {
            System.out.println("this user is created already!");
        }else {
            insert(personEnti);
        }
    }
    private List<PersonEnti> selecting() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM person2");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<PersonEnti> personEntiList=new ArrayList <> ();
        while (resultSet.next ()){
            PersonEnti personEnti=new PersonEnti (); // call by reference
            personEnti.setName (resultSet.getString ("name"));
            personEnti.setUser (resultSet.getString ("username"));
            personEnti.setPass(resultSet.getString("pass"));
            personEnti.setEmail(resultSet.getString("email"));
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
