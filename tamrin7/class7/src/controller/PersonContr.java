package controller;

import model.entity.PersonEnti;
import model.service.PersonServ;

import java.util.List;
import java.util.Scanner;

public class PersonContr {
    Scanner input=new Scanner(System.in);
    public void save() {
        System.out.println("pls enter your name : ");
        String name=(input.next());
        System.out.println("pls enter your username : ");
        String username=(input.next());
        System.out.println("pls enter your pass : ");
        String pass=(input.next());
        System.out.println("pls enter your email address : ");
        String email=(input.next());
        try {
            PersonServ.getInstance().save(new PersonEnti().setName(name).setUser(username).setPass(pass).setEmail(email));
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
    }
    public void report(){
        try {
            System.out.println("pls enter your username : ");
            String username=(input.next());
            System.out.println("pls enter your pass : ");
            String pass=input.next();
            List<PersonEnti> personList = PersonServ.getInstance().report (new PersonEnti().setUser(username).setPass(pass));
        }
        catch (Exception e){
            System.out.println ("Fail to report!"+e.getMessage ());
        }
    }
}
