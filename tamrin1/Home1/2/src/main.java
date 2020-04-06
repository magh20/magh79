import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Course barnamenevisi = new Course();
        Course kargahbarname = new Course();
        Course math1 = new Course();
        Course physics1 = new Course();
        Course persian = new Course();
        Course andishe = new Course();

        System.out.print("Enter Programming Score: ");
        String temp = scan.nextLine();
        barnamenevisi.nomre = Float.parseFloat(temp);
        System.out.print("Enter Programming Units: ");
        temp = scan.nextLine();
        barnamenevisi.units = Integer.parseInt(temp);
        barnamenevisi.multiply();

        System.out.print("Enter Programming Workshop Score: ");
        temp = scan.nextLine();
        kargahbarname.nomre = Float.parseFloat(temp);
        System.out.print("Enter Programming Workshop Units: ");
        temp = scan.nextLine();
        kargahbarname.units = Integer.parseInt(temp);
        kargahbarname.multiply();

        System.out.print("Enter Math 1 Score: ");
        temp = scan.nextLine();
        math1.nomre = Float.parseFloat(temp);
        System.out.print("Enter Math 1 Units: ");
        temp = scan.nextLine();
        math1.units = Integer.parseInt(temp);
        math1.multiply();

        System.out.print("Enter Physics 1 Score: ");
        temp = scan.nextLine();
        physics1.nomre = Float.parseFloat(temp);
        System.out.print("Enter Physics 1 Units: ");
        temp = scan.nextLine();
        physics1.units = Integer.parseInt(temp);
        physics1.multiply();

        System.out.print("Enter Persian Score: ");
        temp = scan.nextLine();
        persian.nomre = Float.parseFloat(temp);
        System.out.print("Enter Persian Units: ");
        temp = scan.nextLine();
        persian.units = Integer.parseInt(temp);
        persian.multiply();

        System.out.print("Enter andishe Score: ");
        temp = scan.nextLine();
        andishe.nomre = Float.parseFloat(temp);
        System.out.print("Enter andishe Units: ");
        temp = scan.nextLine();
        andishe.units = Integer.parseInt(temp);
        andishe.multiply();

        float scoreSum = barnamenevisi.miangin + kargahbarname.miangin + math1.miangin + physics1.miangin + persian.miangin + andishe.miangin;
        float unitSum = barnamenevisi.units + kargahbarname.units + math1.units + physics1.units + persian.units + andishe.units;
        float avg = scoreSum/unitSum;
        if (avg<=12)
            System.out.println("daneshjo mashroot shode!");
        else
            System.out.println("daneshjo mashroot nashode.");
        System.out.println("Term Average: " + avg );
    }
}
