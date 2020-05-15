import java.sql.*;
import java.util.Scanner;


public class Student {
    private String name,code,enteringyear;
    private int grade;

    Scanner input=new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnteringyear() {
        return enteringyear;
    }

    public void setEnteringyear(String enteringyear) {
        this.enteringyear = enteringyear;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void insert(String name,String code,String enteringyear,int grade) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from student where code=?");
            preparedStatement1.setString(1, code);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this student is there already!");
            } else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into student (name,code,enteringyear,grade) values (?,?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, code);
                preparedStatement.setString(3, enteringyear);
                preparedStatement.setLong(4, grade);
                System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
                preparedStatement.close();
            }
            preparedStatement1.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void select(String code){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from student where code=? ");
            preparedStatement1.setString(1, code);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                System.out.println("update user : ");
                System.out.println("pls enter student's name : ");
                String Name=input.next();
                System.out.println("pls enter student's code : ");
                String Code=input.next();
                System.out.println("pls enter student's entering year : ");
                String Enteringyear=input.next();
                System.out.println("pls enter student's grade : ");
                int grade=input.nextInt();
                update(code,Name,Code,Enteringyear,grade);
            }else {
                System.out.println("your student code is wrong!!!");
            }
            resultSet.close();
            preparedStatement1.close();
            connection.close();
        }catch (ClassNotFoundException e)
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void update(String code,String name,String Code,String enteringyear,int grade){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("update student set name=? , Code=? , enteringyear=? , grade=? where code=?");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, Code);
            preparedStatement.setString(3, enteringyear);
            preparedStatement.setLong(4, grade);
            preparedStatement.setString(5, code);
            System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
            System.out.println("student information update.");
            preparedStatement.close();
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
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from student where code=? ");
            preparedStatement1.setString(1, code);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                PreparedStatement preparedStatement = connection.prepareStatement("delete from student where code=?");
                preparedStatement.setString(1, code);
                preparedStatement.executeUpdate();
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
            }else {
                System.out.println("your student's code is wrong!!!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
}
