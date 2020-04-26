public class Student<NAME,USER,FATHERNAME> {
    private NAME name;
    private USER user;
    private FATHERNAME fathername;

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

    public FATHERNAME getFathername() {
        return fathername;
    }

    public void setFathername(FATHERNAME fathername) {
        this.fathername = fathername;
    }
}
