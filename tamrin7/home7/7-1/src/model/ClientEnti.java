package model;

public class ClientEnti {
    private String username;
    private String pass;
    private int id,internet_size,price;


    public int getId() {
        return id;
    }

    public int getInternet_size() {
        return internet_size;
    }

    public ClientEnti setInternet_size(int internet_size) {
        this.internet_size = internet_size;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ClientEnti setPrice(int price) {
        this.price = price;
        return this;
    }

    public ClientEnti setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public ClientEnti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public ClientEnti setPass(String pass) {
        this.pass = pass;
        return this;
    }
}
