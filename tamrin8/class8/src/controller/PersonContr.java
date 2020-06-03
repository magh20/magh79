package controller;
import model.PersonServ;
import model.PersonEnti;
import java.util.List;
import java.util.Scanner;

public class PersonContr {
    public String name,username,pass,email;
    Scanner input=new Scanner(System.in);
    public void save() {
        try {
            PersonServ.getInstance().save(new PersonEnti().setName(name).setUser(username).setPass(pass).setEmail(email));
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
    }
    public void report(){
        try {
            List<PersonEnti> personList = PersonServ.getInstance().report (new PersonEnti().setUser(username).setPass(pass));
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }
    }
    public void show(){
        try {
            List<PersonEnti> personEntis=PersonServ.getInstance().report();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
