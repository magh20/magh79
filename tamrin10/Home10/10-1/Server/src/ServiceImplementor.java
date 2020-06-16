import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServiceImplementor extends UnicastRemoteObject implements Service {
    protected ServiceImplementor() throws RemoteException {}
    @Override
    public void save(Entity entity) throws Exception {
        Repository repository = new Repository();
        repository.insert(entity);
        repository.close();
    }
    @Override
    public void edit(Entity entity) throws Exception {
        Repository repository = new Repository();
        repository.update(entity);
        repository.close();
    }
    @Override
    public List<Entity> report() throws Exception {
        Repository repository = new Repository();
        List<Entity> entityList = repository.select();
        repository.close();
        return entityList;
    }
}