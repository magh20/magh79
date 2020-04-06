import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Miveforushi miveAval=new Miveforushi();
        miveAval.name="sib";
        miveAval.price=5000;
        Miveforushi miveDovom=new Miveforushi();
        miveDovom.name="porteghal";
        miveDovom.price=5500;
        Miveforushi miveSevom=new Miveforushi();
        miveSevom.name="holoo";
        miveSevom.price=6000;
        Miveforushi miveChaharom=new Miveforushi();
        miveChaharom.name="khiar";
        miveChaharom.price=2500;
        Miveforushi mivePanjom=new Miveforushi();
        mivePanjom.name="albaloo";
        mivePanjom.price=4500;

        System.out.println(miveAval.name + " = kiluee " + miveAval.price + " tomans");
        System.out.println(miveDovom.name + " = kiluee " + miveDovom.price + " tomans");
        System.out.println(miveSevom.name + " = kiluee " + miveSevom.price + " tomans");
        System.out.println(miveChaharom.name + " = kiluee "  + miveChaharom.price + " tomans");
        System.out.println(mivePanjom.name+ " = kiluee " + mivePanjom.price + " tomans");
        System.out.println("lotfan vazn har mive ra vared konid!");
        System.out.println("vazn sib = ");
        miveAval.weight=input.nextInt();
        System.out.println("vazn porteghal = ");
        miveDovom.weight=input.nextInt();
        System.out.println("vazn holoo = ");
        miveSevom.weight=input.nextInt();
        System.out.println("vazn khiar = ");
        miveChaharom.weight=input.nextInt();
        System.out.println("vazn albaloo = ");
        mivePanjom.weight=input.nextInt();

        System.out.println("gheimat sib = ");
        System.out.println(miveAval.gheimat = miveAval.factor(miveAval.weight,miveAval.price));
        System.out.println("gheimat porteghal = ");
        System.out.println(miveDovom.gheimat = miveDovom.factor(miveDovom.weight,miveDovom.price));
        System.out.println("gheimat holoo = ");
        System.out.println(miveSevom.gheimat = miveSevom.factor(miveSevom.weight,miveSevom.price));
        System.out.println("gheimat khiar = ");
        System.out.println(miveChaharom.gheimat = miveChaharom.factor(miveChaharom.weight,miveChaharom.price));
        System.out.println("gheimat albaloo = ");
        System.out.println(mivePanjom.gheimat = mivePanjom.factor(mivePanjom.weight,mivePanjom.price));

        int gheimatkol=miveAval.gheimat + miveDovom.gheimat + miveSevom.gheimat + miveChaharom.gheimat + mivePanjom.gheimat;
        System.out.println("gheimat pardakhti kol = " + gheimatkol);

    }
}
