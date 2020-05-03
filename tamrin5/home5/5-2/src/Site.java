
public class Site {
    private String pass;
    private String user;

    private static Site person=new Site();
    public static Site getInstance(){return person;}
    private Site(){}

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
