import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Piade_sazi piadeSazi = new Piade_sazi();
        System.out.println("pls enter a number : ");
        String tmp=input.nextLine();
        piadeSazi.x=Integer.parseInt (tmp);
        System.out.println("x = " + piadeSazi.x);
        piadeSazi.isEven();
        piadeSazi.isOdd();
        piadeSazi.isPositive();
        piadeSazi.isNegative();
        piadeSazi.isZero();
        System.out.println("pls enter a number : ");
        tmp=input.nextLine();
        piadeSazi.x=Integer.parseInt (tmp);
        System.out.println("n = " + piadeSazi.x);
        piadeSazi.isEven();
        piadeSazi.isOdd();
        piadeSazi.isPositive();
        piadeSazi.isNegative();
        piadeSazi.isZero();
        System.out.println("pls enter a number : ");
        tmp=input.nextLine();
        piadeSazi.x=Integer.parseInt (tmp);
        System.out.println("n = " + piadeSazi.x);
        piadeSazi.isEven();
        piadeSazi.isOdd();
        piadeSazi.isPositive();
        piadeSazi.isNegative();
        piadeSazi.isZero();
    }
}
