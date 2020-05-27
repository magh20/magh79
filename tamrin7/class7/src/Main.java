import controller.PersonContr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        PersonContr personContr=new PersonContr();
        while(true) {
            System.out.println("1-create a new account :\n2-enter to your account :\n3-exit.");
            int i=input.nextInt();
            switch (i) {
                case 1:
                    personContr.save();
                    break;
                case 2:
                    personContr.report();
                    break;
            }break;
        }
    }
}
