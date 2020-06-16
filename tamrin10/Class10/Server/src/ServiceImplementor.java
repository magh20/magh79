import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
}
