import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Equation j = new Equation();

        System.out.print("Enter a: ");
        String temp = input.nextLine();
        j.a = Float.parseFloat(temp);

        System.out.print("Enter b: ");
        temp = input.nextLine();
        j.b = Float.parseFloat(temp);

        System.out.print("Enter c: ");
        temp = input.nextLine();
        j.c = Float.parseFloat(temp);

        System.out.print("Enter d: ");
        temp = input.nextLine();
        j.d = Float.parseFloat(temp);

        System.out.print("Enter e: ");
        temp = input.nextLine();
        j.e = Float.parseFloat(temp);

        System.out.print("Enter f: ");
        temp = input.nextLine();
        j.f = Float.parseFloat(temp);

        j.mohasebe_x();
        j.mohasebe_y();
    }
}
