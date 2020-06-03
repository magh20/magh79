package Controller;

import Model.Enti;
import Model.Serv;

import java.util.ArrayList;
import java.util.List;

public class Contr {
    public String name,username,pass,email;
    public void save(){
        try {
            Serv.getInstance().save(new Enti().setName("mohammad").setUsername("mmd").setPass("magh").setEmail("qwer"));
            Serv.getInstance().save(new Enti().setName("ali").setUsername("alif").setPass("1234").setEmail("asdf"));
            Serv.getInstance().save(new Enti().setName("mahdi").setUsername("md").setPass("1234").setEmail("zxcv"));
        }
        catch (Exception e){
            System.out.println("faild to save ! " + e.getMessage());
        }
    }
    public String Username,Pass;
    public void edit(){
        try {
            Serv.getInstance().edit(Username,Pass,new Enti().setName(name).setUsername(username).setPass(pass).setEmail(email));
        }
        catch (Exception e){
            System.out.println("faild to edit! " +e.getMessage());
        }
    }
    public List<Enti> report(){
        List<Enti> entis=new ArrayList<>();
        try {
            entis=Serv.getInstance().report();
        }
        catch (Exception e){
            e.getMessage();
        }
        return entis;
    }
}
