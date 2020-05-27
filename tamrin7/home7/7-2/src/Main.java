import controller.SalesDepartmentContr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SalesDepartmentContr salesDepartmentContr=new SalesDepartmentContr();
        System.out.println("welcome to saipa's sales department :");
        salesDepartmentContr.buy();
    }
}
