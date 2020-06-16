import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (id, username, password) values (?,?,?)");
        preparedStatement.setInt(1, entity.getId());
        preparedStatement.setString(2, entity.getUser());
        preparedStatement.setString(3, entity.getPass());
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update users set username=?, password=? where id=?");
        preparedStatement.setString(1, entity.getUser());
        preparedStatement.setString(2, entity.getPass());
        preparedStatement.setInt(3, entity.getId());
        preparedStatement.executeUpdate();
    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setUser(resultSet.getString("username"));
            entity.setPass(resultSet.getString("password"));
            entityList.add(entity);
        }
        return entityList;
    }
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}