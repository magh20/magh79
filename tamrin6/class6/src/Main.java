import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Person person=new Person();
        while(true) {
            System.out.println("1-create a new account :\n2-enter to your account :\n3-exit.");
            int i=input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("pls enter your name : ");
                    person.setName(input.next());
                    System.out.println("pls enter your username : ");
                    person.setUser(input.next());
                    System.out.println("pls enter your pass : ");
                    person.setPass(input.next());
                    System.out.println("pls enter your email address : ");
                    person.setEmail(input.next());
                    person.insert(person.getName(),person.getUser(),person.getPass(),person.getEmail());
                    break;
                case 2:
                    System.out.println("pls enter your username : ");
                    String username = input.next();
                    System.out.println("pls enter your pass : ");
                    String pass = input.next();
                    person.select(username,pass);
                    break;
            }break;
        }
    }
}
