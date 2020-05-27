package controller;

import model.SalesDepartmentEnti;
import model.SalesDepartmentServ;

import java.util.Scanner;

public class SalesDepartmentContr {
    Scanner input=new Scanner(System.in);
    public void buy(){
        try {
            System.out.println("pls enter your name : ");
            String name=input.next();
            System.out.println("pls enter your melicode : ");
            String melicode=input.next();
            SalesDepartmentServ.getInstance().report(new SalesDepartmentEnti().setMelicode(melicode));
            System.out.println("pls choose your car model :\n1-saipa 111 : 45 million\n2-saipa 132 : 50 million\n3-tiba : 55 million\n4-saina : 60 million");
            int carModel=input.nextInt();
            if(carModel==1){
                SalesDepartmentServ.getInstance().save(new SalesDepartmentEnti().setPersonname(name).setMelicode(melicode).setCarmodel("saipa 111").setPrice(45));
            }else if(carModel==2){
                SalesDepartmentServ.getInstance().save(new SalesDepartmentEnti().setPersonname(name).setMelicode(melicode).setCarmodel("saipa 132").setPrice(50));
            }else if (carModel==3){
                SalesDepartmentServ.getInstance().save(new SalesDepartmentEnti().setPersonname(name).setMelicode(melicode).setCarmodel("tiba").setPrice(55));
            }else if(carModel==4){
                SalesDepartmentServ.getInstance().save(new SalesDepartmentEnti().setPersonname(name).setMelicode(melicode).setCarmodel("saina").setPrice(60));
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
