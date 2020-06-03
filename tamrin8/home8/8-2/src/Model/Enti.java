package Model;

public class Enti {
    private String name,username,pass,email;

    public String getName() {
        return name;
    }

    public Enti setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Enti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Enti setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Enti setEmail(String email) {
        this.email = email;
        return this;
    }
}
