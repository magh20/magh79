import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Student student=new Student();
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter student's name :");
        student.setName(input.nextLine());
        System.out.println("pls enter student's user :");
        student.setUser(input.nextLine());
        System.out.println("pls enter student's fatherName :");
        student.setFathername(input.nextLine());
        list.add("phisics = 12");
        list.add("math = 14");
        list.add("andishe = 16");
        list.add("programming = 18");
        list.add("programming workshop = 10");
        System.out.println("student's name is :" + student.getName());
        System.out.println("student's user is :" + student.getUser());
        System.out.println("student's fatherName is :" + student.getFathername());
        System.out.println(student.getName() + "'s grades are :");
        for(String s : list){
            System.out.println(s);
        }
    }
}
