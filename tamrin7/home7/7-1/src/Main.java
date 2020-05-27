import controller.ClientContr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClientContr clientContr=new ClientContr();
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your username : ");
        String username=input.next();
        System.out.println("pls enter your pass : ");
        String pass=input.next();
        clientContr.check(username,pass);
        clientContr.show();
        int i = input.nextInt();
        clientContr.buy(i,username,pass);
    }
}
//dar dakhel database aval bayad username va pass vared shode bashad.