import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Service service = (Service) Naming.lookup("//localhost/Service");
            Entity entity = new Entity().setId(1).setUser("qwe").setPass("123").setBalance(1000);
            service.save(entity);
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter Username: ");
            if (scanner.next().equals("qwe")) {
                System.out.printf("Enter Password: ");
                if (scanner.next().equals("123")) {
                    System.out.printf("Login Successful\n1 Deposit\n2 Withdraw\n");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.printf("Enter deposit amount: ");
                            entity = new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(1000+scanner.nextInt());
                            service.edit(entity);
                            break;
                        case 2:
                            System.out.printf("Enter withdraw amount: ");
                            entity = new Entity().setId(entity.getId()).setUser(entity.getUser()).setPass(entity.getPass()).setBalance(1000-scanner.nextInt());
                            service.edit(entity);
                            break;
                    }
                } else {
                    System.out.println("Wrong Password");
                    System.exit(0);
                }
            } else {
                System.out.println("User doesn't exist");
                System.exit(0);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}