import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("thelist of companys : ");
        System.out.println("1-BMW\n2-BENZ\n3-PEUGEOT\n4-BOGATI\n5-SAIPA");
        System.out.println("pls choose one company : ");
        int company = input.nextInt();
        Car car=CarFactory.getCar (company);
        car.country();
        car.carmodel();
    }
}
