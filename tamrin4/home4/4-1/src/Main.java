import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Student std=new Student();
        Map student=new TreeMap();
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter student name :");
        std.setName(input.nextLine());
        student.put("name",std.getName());
        System.out.println("pls enter student user :");
        std.setUser(input.nextLine());
        student.put("user",std.getUser());
        System.out.println("pls enter student grade :");
        std.setGrade(input.nextInt());
        student.put("grade",std.getGrade());
        System.out.println("student's name is : " + student.get("name"));
        System.out.println("student's user is : " + student.get("user"));
        System.out.println("student's average grade is : "+ student.get("grade"));
    }
}
