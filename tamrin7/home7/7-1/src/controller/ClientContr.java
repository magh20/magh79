package controller;
import model.ClientEnti;
import model.ClientServ;

import java.util.List;

public class ClientContr {
    public void check(String username,String pass){
        try {
            ClientServ.getInstance().report(new ClientEnti().setUsername(username).setPass(pass));
        } catch (Exception e) {
            System.out.println("Fail to save! " + e.getMessage());
        }
    }
    public void buy(int id,String username,String pass){
        try {
            int internet_size ;
            int price;
            ClientServ.getInstance().save(new ClientEnti().setId(id).setUsername(username).setPass(pass).setInternet_size());
            /*if(id==1){
                internet_size=2;
                price=1000;
                ClientServ.getInstance().save(new ClientEnti().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==2){
                internet_size=4;
                price=2000;
                ClientServ.getInstance().save(new ClientEnti().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==3){
                internet_size=10;
                price=5000;
                ClientServ.getInstance().save(new ClientEnti().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==4){
                internet_size=25;
                price=10000;
                ClientServ.getInstance().save(new ClientEnti().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }*/
        }catch (Exception e){
            System.out.println("fail! " + e.getMessage());
        }
    }
    public void show(){
        System.out.println("pls choose a choice :\n1-2G:1000 tomans\n2-4G:2000 tomans\n3-10G:5000 tomans\n4-25G:10000 tomans");

    }
}
