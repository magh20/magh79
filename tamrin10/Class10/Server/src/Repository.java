import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (id, username, password, balance) values (?,?,?,?)");
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getUser());
        preparedStatement.setString(3, entity.getPass());
        preparedStatement.setInt(4, entity.getBalance());
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update users set username=?, password=?, balance=? where id=?");
        preparedStatement.setString(1, entity.getUser());
        preparedStatement.setString(2, entity.getPass());
        preparedStatement.setInt(3, entity.getBalance());
        preparedStatement.setInt(4, entity.getId());
        preparedStatement.executeUpdate();
    }
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}