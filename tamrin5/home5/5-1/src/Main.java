import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your age : ");
        int a=input.nextInt();
        System.out.println("pls enter your homeAddress : ");
        String h=input.next();
        System.out.println("pls enter your EducationQualifiction : ");
        String d=input.next();
        System.out.println("pls enter your name : ");
        String n=input.next();
        System.out.println("pls enter your pass : ");
        String p=input.next();
        System.out.println("pls enter your phoneNumber : ");
        String f=input.next();
        System.out.println("pls enter your userName : ");
        String u=input.next();
        Person person=new Person().setAge(a).setEducationQualifiction(d).setHomeaddress(h).setName(n).setPass(p).setPhonenumber(f).setUser(u);
        System.out.println("person's name : " + person.getName());
        System.out.println("person's userName : " + person.getUser());
        System.out.println("person's age : " + person.getAge());
        System.out.println("person's passport : " + person.getPass());
        System.out.println("person's EducationQualifiction : " + person.getEducationQualifiction());
        System.out.println("person's homeAddress : " + person.getHomeaddress());
        System.out.println("person's phoneNumber : " + person.getPhonenumber());
    }
}
