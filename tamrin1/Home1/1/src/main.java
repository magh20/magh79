import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle mostatil = new Rectangle();
        System.out.print("Enter Rectangle Lenght: ");
        String temp = input.nextLine();
        mostatil.length = Integer.parseInt(temp);
        System.out.print("Enter Rectangle Width: ");
        temp = input.nextLine();
        mostatil.width = Integer.parseInt(temp);
        mostatil.perimeter();
        mostatil.area();
        System.out.println();
        Square moraba = new Square();
        System.out.print("Enter Square Side: ");
        temp = input.nextLine();
        moraba.side = Integer.parseInt(temp);
        moraba.perimeter();
        moraba.area();
    }
}
