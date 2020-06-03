package Model;

public class Enti {
    private String name,family,address,phonenumber,melicode,skill;
    private String age,experience;

    public String getSkill() {
        return skill;
    }

    public Enti setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public String getExperience() {
        return experience;
    }

    public String getMelicode() {
        return melicode;
    }

    public Enti setMelicode(String melicode) {
        this.melicode = melicode;
        return this;
    }

    public Enti setExperience(String experience) {
        this.experience = experience;
        return this;
    }

    public String getName() {
        return name;
    }

    public Enti setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Enti setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Enti setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Enti setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Enti setAge(String age) {
        this.age = age;
        return this;
    }
}
