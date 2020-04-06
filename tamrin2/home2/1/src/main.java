import java.util.Scanner;
import java.util.concurrent.Callable;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Calc calc=new Calc();
        System.out.println("pls enter two numbers : ");
        String temp=input.nextLine();
        calc.num1=Float.parseFloat(temp);
        temp=input.nextLine();
        calc.num2=Float.parseFloat(temp);
        System.out.println("summation : ");
        calc.jam();
        System.out.println("subtraction : ");
        calc.tafrigh();
        System.out.println("multiplication : ");
        calc.zarb();
        System.out.println("division : ");
        calc.taghsim();
    }
}
