import java.util.Scanner;

public class Main {
    public static Student student1=new Student();
    public static String student_name="ali";
    public static String student_user="alif";
    public static String student_pass="123";
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter student name :");
        student1.name=input.nextLine();
        System.out.println("pls enter student user :");
        student1.user=input.nextLine();
        System.out.println("pls enter student pass :");
        student1.pass=input.nextLine();
        try{
            condition();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void condition() throws Exception
    {
        if(!student1.name.equals(student_name) || !student1.user.equals(student_user) || !student1.pass.equals(student_pass)){
            throw new Exception("there isn't student with this information!");
        }
        else if(student1.name.equals(student_name) && student1.user.equals(student_user) && student1.pass.equals(student_pass)){
            System.out.println(student1.name + " " + student1.user + " " + student1.pass);
        }
    }
}
