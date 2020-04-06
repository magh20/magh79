import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter two name to compare: ");
        Str str1 = new Str();
        System.out.println("str1 : ");
        str1.name = input.nextLine();
        Str str2 = new Str();
        System.out.println("str2 : ");
        str2.name = input.nextLine();
        System.out.println("if see positive number str1 is greater than str2. elseif see negative number str2 is greater than str1. else see zero str1 & str2 are equals.");
        System.out.println(str1.name.compareTo(str2.name));
        }
    }

