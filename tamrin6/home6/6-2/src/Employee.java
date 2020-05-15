import java.sql.*;

public class Employee {
    private String code,name,fathername,situation,background;
    private int melicode,salary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMelicode() {
        return melicode;
    }

    public void setMelicode(int melicode) {
        this.melicode = melicode;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public void insert(String code,String name,String fathername,String situation,String background,int melicode,int salary){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1= connection.prepareStatement("select * from employee where code=?");
            preparedStatement1.setString(1,code);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this employee is there already!");
            }else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into employee (code,name,fathername,situation,background,melicode,salary) values (?,?,?,?,?,?,?)");
                preparedStatement.setString(1, code);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, fathername);
                preparedStatement.setString(4, situation);
                preparedStatement.setString(5, background);
                preparedStatement.setLong(6, melicode);
                preparedStatement.setLong(7, salary);
                System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
                preparedStatement.close();
            }preparedStatement1.close();
            connection.close();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void remove(String code) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from employee where code=? ");
            preparedStatement1.setString(1, code);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from employee where code=?");
                preparedStatement.setString(1, code);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
            }else {
                System.out.println("your employee's code is wrong!!!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
