import java.sql.*;

public class Person {
    private String name,user,pass,email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void insert(String name,String username,String pass,String email){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from person where  username =? and pass =? ");
            preparedStatement1.setString(1,username);
            preparedStatement1.setString(2,pass);
            ResultSet resultSet2 = preparedStatement1.executeQuery();
            if (resultSet2.next()) {
                System.out.println("this user is created already!");
            }else {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into person (name,username,pass,email) values (?,?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, username);
                preparedStatement.setString(3, pass);
                preparedStatement.setString(4, email);
                System.out.println("Insert into DB: " + preparedStatement.executeUpdate());
                System.out.println("user create.");
                resultSet2.close();
                preparedStatement.close();
                preparedStatement1.close();
                connection.close();
            }
        }catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public void select(String username,String pass){
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "magh", "magh1379")) {
            Class.forName("oracle.jdbc.OracleDriver");
            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from person where username = ? and pass=? ");
            preparedStatement2.setString(1,username);
            preparedStatement2.setString(2,pass);
            ResultSet resultSet = preparedStatement2.executeQuery();
            if (resultSet.next()) {
                System.out.println("user & pass is correct.\nwelcome : "+resultSet.getString("username"));
            }else {
                    System.out.println("your user or pass is incorrect!");
            }
            resultSet.close();
            preparedStatement2.close();
            connection.close();
        } catch (ClassNotFoundException e)// if no lib files are added
        {
            System.out.println("DB Driver Not Exist!!");
        }
        catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }catch (Exception e){
            System.out.println("operation is faild!!!");
        }

    }
}
