import java.rmi.Remote;

public interface Service extends Remote {
    void save(Entity entity) throws Exception;
    void edit(Entity entity) throws Exception;
}