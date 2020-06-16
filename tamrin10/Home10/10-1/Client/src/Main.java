import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Service service = (Service) Naming.lookup("//localhost/Service");
            int i=0;
            while (true) {
                System.out.printf("1\tAdd User\n2\tLog In\n3\tExit\n");
                Scanner scanner = new Scanner(System.in);
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.printf("Enter Username: ");
                        String u = scanner.next();
                        System.out.printf("Enter Password: ");
                        String p = scanner.next();
                        i+=1;
                        try {
                            service.save(new Entity().setId(i).setUser(u).setPass(p));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        int t = 0;
                        String temp = null;
                        System.out.printf("Enter Username: ");
                        u = scanner.next();
                        try {
                            List<String> users = new ArrayList<>();
                            List<String> passes = new ArrayList<>();
                            for (Entity en : service.report()) {
                                users.add(en.getUser());
                                passes.add(en.getPass());
                            }
                            if (users.contains(u) == false)
                                System.out.println("User doesn't exist");
                            else {
                                t = users.indexOf(u);
                                temp = passes.get(t);
                            }
                            System.out.printf("Enter Password: ");
                            p = scanner.next();
                            if (p.equals(temp)) {
                                System.out.print("Login Successful\n1\tEdit Info\n2\tExit\n");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        System.out.printf("Enter New Username: ");
                                        u = scanner.next();
                                        System.out.printf("Enter New Password: ");
                                        p = scanner.next();
                                        service.edit(new Entity().setId(t+1).setUser(u).setPass(p));
                                        break;
                                    case 2:
                                        System.exit(0);
                                        break;
                                }
                            }
                            else
                                System.out.println("Wrong Password");
                        } catch (Exception e) {
                            System.out.println("failed to report " + e.getMessage());
                        }
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
