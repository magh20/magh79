import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("pls enter your userName : ");
        Site.getInstance().setUser(input.nextLine());
        System.out.println("pls enter your passport : ");
        Site.getInstance().setPass(input.nextLine());
        System.out.println("the information saved!");
        System.out.println("your userName is : " + Site.getInstance().getUser());
        System.out.println("your passport is : " + Site.getInstance().getPass());
    }
}
