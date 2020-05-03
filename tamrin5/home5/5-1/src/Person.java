public class Person {
    private String user;
    private String name;
    private String pass;
    private int age;
    private String homeaddress;
    private String phonenumber;
    private String educationQualifiction;
    public Person (String name, String user, String pass, String homeaddress, String phonenumber, String educationQualifiction, int age){
        this.age=age;
        this.name=name;
        this.educationQualifiction = educationQualifiction;
        this.homeaddress=homeaddress;
        this.phonenumber=phonenumber;
        this.pass=pass;
        this.user=user;
    }
    public Person(){}

    public int getAge(){
        return age;
    }
    public Person setAge(int age){
        this.age=age;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Person setUser(String user) {
        this.user = user;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Person setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public Person setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
        return this;
    }

    public String getEducationQualifiction() {
        return educationQualifiction;
    }

    public Person setEducationQualifiction(String educationQualifiction) {
        this.educationQualifiction = educationQualifiction;
        return this;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Person setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }
}
