import java.util.Scanner;

public class Main {
    public static Person person1 = new Person();
    public static Person person2 = new Person();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter person1 name:");
        person1.name = input.nextLine();
        System.out.println("pls enter person1 family:");
        person1.family = input.nextLine();
        System.out.println("pls enter person1 age:");
        person1.age = input.nextLine();
        System.out.println("pls enter person2 name:");
        person2.name = input.nextLine();
        System.out.println("pls enter person2 family:");
        person2.family = input.nextLine();
        System.out.println("pls enter person2 age:");
        person2.age = input.nextLine();
        System.out.println(person1.str = person1.name + person1.family + person1.age);
        System.out.println(person2.str = person2.name + person2.family + person2.age);

            try{
                condition();
            }
            catch (Exception e){
                e.printStackTrace();
            }

    }
    public static void condition() throws Exception
    {
        if (person1.str.equals(person2.str)) {
            throw new Exception("information of person2 is equal to person1 !!!");
        } else {
            System.out.println("persons information saved!");
        }
    }
}
