package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SalesDepartmentRepo implements AutoCloseable {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public SalesDepartmentRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379");
        connection.setAutoCommit(false);
    }
    public void insert(SalesDepartmentEnti sell)throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("insert into selling (personname,melicode,carmodel,price,remainingmoney) values (?,?,?,?,?)");
        preparedStatement.setString(1,sell.getPersonname());
        preparedStatement.setString(2,sell.getMelicode());
        preparedStatement.setString(3,sell.getCarmodel());
        preparedStatement.setInt(4,sell.getPrice());
        preparedStatement.executeUpdate();
        selecting(sell);
    }

    public void select(SalesDepartmentEnti sell) throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("select * from selling where melicode=?");
        preparedStatement.setString(1,sell.getMelicode());
        ResultSet resultSet= preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("person with this melli code buying a car already !");
            System.exit(0);
        }else {
            System.out.println("welcome :" + resultSet.getString("personname"));
        }
    }
    private void selecting(SalesDepartmentEnti sell) throws Exception{
        PreparedStatement preparedStatement=connection.prepareStatement("select * from selling");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<SalesDepartmentEnti> personEntiList=new ArrayList<>();
        while (resultSet.next ()){
            SalesDepartmentEnti personEnti=new SalesDepartmentEnti (); // call by reference
            personEnti.setPersonname (resultSet.getString ("personname"));
            personEnti.setCarmodel (resultSet.getString ("carmodel"));
            personEnti.setMelicode (resultSet.getString ("melicode"));
            personEnti.setPrice (resultSet.getInt ("price"));
            personEntiList.add (personEnti);
        }
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    @Override
    public void close () throws Exception {
        preparedStatement.close ();
        connection.close ();
    }
}
