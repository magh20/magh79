package model;

public class SalesDepartmentEnti {
    private String carmodel;
    private String personname;
    private String melicode;
    private int price;

    public String getMelicode() {
        return melicode;
    }

    public SalesDepartmentEnti setMelicode(String melicode) {
        this.melicode = melicode;
        return this;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public SalesDepartmentEnti setCarmodel(String carmodel) {
        this.carmodel = carmodel;
        return this;
    }

    public String getPersonname() {
        return personname;
    }

    public SalesDepartmentEnti setPersonname(String personname) {
        this.personname = personname;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SalesDepartmentEnti setPrice(int price) {
        this.price = price;
        return this;
    }
}
