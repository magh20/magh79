package model;

public class PersonEnti {
    private String name,user,pass,email;

    public String getName() {
        return  name;
    }

    public PersonEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getUser() {
        return user;
    }

    public PersonEnti setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public PersonEnti setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PersonEnti setEmail(String email) {
        this.email = email;
        return this;
    }
}
