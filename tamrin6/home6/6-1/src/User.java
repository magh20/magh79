import java.sql.*;
import java.util.Scanner;


public class User {
    private String usercode,username,email,pass,education;
    private int age;
    Scanner input=new Scanner(System.in);
    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void insert(String usercode,String username,String email,String pass,String education,int age){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1= connection.prepareStatement("select * from users where username =? and pass=?");
            preparedStatement1.setString(1,username);
            preparedStatement1.setString(2,pass);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this user is created already!");
            }else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username,usercode,pass,email,education,age) values (?,?,?,?,?,?)");
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, usercode);
                preparedStatement.setString(3, pass);
                preparedStatement.setString(4, email);
                preparedStatement.setString(5, education);
                preparedStatement.setLong(6, age);
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
    public void select(String username,String pass) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from users where username=? and pass =? ");
            preparedStatement1.setString(1, username);
            preparedStatement1.setString(2, pass);
            ResultSet resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                System.out.println("update user : ");
                System.out.println("pls enter user's username : ");
                String UserName = input.next();
                System.out.println("pls enter user's usercode : ");
                String UserCode = input.next();
                System.out.println("pls enter user's pass : ");
                String Pass = input.next();
                System.out.println("pls enter user's email : ");
                String Email = input.next();
                System.out.println("pls enter user's education : ");
                String Education = input.next();
                System.out.println("pls enter user's age : ");
                int Age = input.nextInt();
                update(username, pass, UserCode, UserName, Email, Pass, Education, Age);
            } else {
                System.out.println("your user or pass is wrong!!!");
            }
            resultSet.close();
            preparedStatement1.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("DB Driver Not Exist!!");
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void update(String UserName,String Pass,String usercode,String username,String email,String pass,String education,int age){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("update users set username=? , usercode=? , pass=? , email=? , education=? , age=? where username=? and pass=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, usercode);
            preparedStatement.setString(3, pass);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, education);
            preparedStatement.setLong(6, age);
            preparedStatement.setString(7, UserName);
            preparedStatement.setString(8, Pass);
            System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
            System.out.println("user update.");
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
}
