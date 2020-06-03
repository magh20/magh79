package Model;

import java.util.List;

public class Serv {
    private Serv() {
    }

    private static Serv serv = new Serv();

    public static Serv getInstance() {
        return serv;
    }

    public void save(Enti enti)throws Exception{
        try (Repo repo=new Repo()){
            repo.insert(enti);
            repo.commit();
        }
    }
    public void edit(String Username,String Pass,Enti enti)throws Exception{
        try (Repo repo=new Repo()){
            repo.update(Username,Pass,enti);
            repo.commit();
        }
    }
    public List<Enti> report()throws Exception{
        List<Enti> entities;
        try (Repo repository = new Repo()) {
            entities = repository.select();
        }
        return entities;
    }
}
