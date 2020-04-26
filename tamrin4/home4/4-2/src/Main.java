import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        User user1=new User();
        User user2=null;
        User user3=null;
        User user4=null;
        System.out.println("pls enter user's name :");
        user1.setName(input.nextLine());
        System.out.println("pls enter user's username :");
        user1.setUser(input.nextLine());
        System.out.println("pls enter user's pass :");
        user1.setPass(input.nextInt());
        System.out.println("user's one name is :" + user1.getName());
        System.out.println("user's one username is :" + user1.getUser());
        System.out.println("user's one pass is :" + user1.getPass());
        try {
            user2 = (User) user1.clone();
            user3 = (User) user1.clone();
            user4 = (User) user1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println ("Clone not supported");
        }
        System.out.println("user's two name is :" + user2.getName());
        System.out.println("user's two username is :" + user2.getUser());
        System.out.println("user's two pass is :" + user2.getPass());
        System.out.println("user's three name is :" + user3.getName());
        System.out.println("user's three username is :" + user3.getUser());
        System.out.println("user's three pass is :" + user3.getPass());
        System.out.println("user's four name is :" + user4.getName());
        System.out.println("user's four username is :" + user4.getUser());
        System.out.println("user's four pass is :" + user4.getPass());
    }
}
