package classwork.oop;

public class Company {
    private String name = "Sport shoes";
    private String country;
    private String balance;
    private int age;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void getInfoAboutCompany(){
        System.out.println("Sport shoes one of the best.");
    }

    public void getContactInfo(){
        System.out.println("Email: sport@gmailio.com");
        System.out.println("Phone: +77 787 5423 17");
    }

    public void getAddressInfo(){
        System.out.println("Address: New York");
    }
}
//1
// class Film
// title

//2
// class Comics
// filmName

//3
// getAdditionalInfo() -- parent


