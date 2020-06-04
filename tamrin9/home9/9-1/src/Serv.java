import java.util.ArrayList;
import java.util.List;

public class Serv {
    private Serv () {
    }

    private static Serv Serv = new Serv ();

    public static Serv getInstance () {
        return Serv;
    }

    public void save(Enti enti)throws Exception{
        try (Repo repo=new Repo()){
            repo.insert(enti);
            repo.commit();
        }
    }
    public List<Enti> report()throws Exception{
        List<Enti> entiList=new ArrayList<>();
        try (Repo repo=new Repo()){
            entiList=repo.select();
            repo.commit();
        }
        return entiList;
    }
}
