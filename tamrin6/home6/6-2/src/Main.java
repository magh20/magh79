import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee employee=new Employee();

        while (true){
            System.out.println("1-insert employee's information :\n2-delete employee's information :");
            int i=input.nextInt();
            switch (i){
                case 1:
                    System.out.println("pls enter employee's code : ");
                    employee.setCode(input.next());
                    System.out.println("pls enter employee's name : ");
                    employee.setName(input.next());
                    System.out.println("pls enter employee's melicode : ");
                    employee.setMelicode(input.nextInt());
                    System.out.println("pls enter employee's fathername : ");
                    employee.setFathername(input.next());
                    System.out.println("pls enter employee's salary : ");
                    employee.setSalary(input.nextInt());
                    System.out.println("pls enter employee's background : ");
                    employee.setBackground(input.next());
                    System.out.println("pls enter employee's situation : ");
                    employee.setSituation(input.next());
                    employee.insert(employee.getCode(),employee.getName(),employee.getFathername(),employee.getSituation(),employee.getBackground(),employee.getMelicode(),employee.getSalary());
                    break;
                case 2:
                    System.out.println("pls enter your employee's code : ");
                    String code=input.next();
                    employee.remove(code);
                    break;
            }break;
        }
    }
}
