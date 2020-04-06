import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Main {
   public static Moadele zarib = new Moadele();
   public static int delta;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter a :");
        String str = input.nextLine();
        zarib.a = Integer.parseInt(str);
        System.out.println("pls enter b :");
        str = input.nextLine();
        zarib.b = Integer.parseInt(str);
        System.out.println("pls enter c :");
        str = input.nextLine();
        zarib.c = Integer.parseInt(str);
        delta = ((zarib.b * zarib.b) - (4 * zarib.a * zarib.c));
        condition();

    }
    public static void condition() throws Exception
    {
        if(delta < 0){
            throw new Exception("delta < 0 !!!");
        }else{
            double x1=(-zarib.b + (Math.sqrt(delta))) / (2 * zarib.a);
            System.out.println("x1 :" + x1);
            double x2=(-zarib.b + (Math.sqrt(delta))) / (2 * zarib.a);
            System.out.println("x2 :" + x2);
        }
    }
}

