package classwork.oop;

public class LittleCompany extends Company{
    private String name;
    private String country;
    private String balance;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void getAddressInfo() {
        System.out.println("Address: New Jersey");
    }

    @Override
    public String toString() {
        return "LittleCompany{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", balance='" + balance + '\'' +
                ", age=" + age +
                '}';
    }
}
