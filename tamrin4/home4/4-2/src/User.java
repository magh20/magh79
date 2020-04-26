public class User<NAME,USER,PASS> implements Cloneable {
    private NAME name;
    private USER user;
    private PASS pass;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public USER getUser() {
        return user;
    }

    public void setUser(USER user) {
        this.user = user;
    }

    public PASS getPass() {
        return pass;
    }

    public void setPass(PASS pass) {
        this.pass = pass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
