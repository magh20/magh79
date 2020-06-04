import java.util.ArrayList;
import java.util.List;

public class Contr {
    public String name,family,melicode;
    public void save(){
        try {
            Serv.getInstance().save(new Enti().setName(name).setFamily(family).setMelicode(melicode));
        }catch (Exception e){
            e.getMessage();
        }
    }
    public List<Enti> show(){
        List<Enti> entis=new ArrayList<>();
        try {
            entis=Serv.getInstance().report();

        }catch (Exception e){
            e.getMessage();
        }
        return entis;
    }
}
