import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user=new User();

        while (true){
            System.out.println("1-create user :\n2-update user :");
            int i=input.nextInt();
            switch (i){
                case 1:
                    System.out.println("pls enter user's username : ");
                    user.setUsername(input.next());
                    System.out.println("pls enter user's usercode : ");
                    user.setUsercode(input.next());
                    System.out.println("pls enter user's pass : ");
                    user.setPass(input.next());
                    System.out.println("pls enter user's email : ");
                    user.setEmail(input.next());
                    System.out.println("pls enter user's education : ");
                    user.setEducation(input.next());
                    System.out.println("pls enter user's age : ");
                    user.setAge(input.nextInt());
                    user.insert(user.getUsercode(),user.getUsername(),user.getEmail(),user.getPass(),user.getEducation(),user.getAge());
                    break;
                case 2:
                    System.out.println("pls enter your username : ");
                    String username=input.next();
                    System.out.println("pls enter your pass : ");
                    String pass=input.next();
                    user.select(username,pass);
                    break;
            }break;
        }
    }
}
