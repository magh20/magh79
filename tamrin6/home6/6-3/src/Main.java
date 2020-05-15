import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student student=new Student();

        while (true){
            System.out.println("1-insert student's information :\n2-update an information :\n3-remove an information :");
            int i=input.nextInt();
            switch (i){
                case 1:
                    System.out.println("pls enter your name : ");
                    student.setName(input.next());
                    System.out.println("pls enter your code : ");
                    student.setCode(input.next());
                    System.out.println("pls enter your entering year : ");
                    student.setEnteringyear(input.next());
                    System.out.println("pls enter your average grade : ");
                    student.setGrade(input.nextInt());
                    student.insert(student.getName(), student.getCode(), student.getEnteringyear(), student.getGrade());
                    break;
                case 2:
                    System.out.println("pls enter your student code : ");
                    String code=input.next();
                    student.select(code);
                    break;
                case 3:
                    System.out.println("pls enter your student code : ");
                    code=input.next();
                    student.remove(code);
                    break;
            }break;
        }
    }
}
