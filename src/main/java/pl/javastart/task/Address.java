package pl.javastart.task;

public class Address {
    private String street;
    private int number;
    private String postCode;
    private String city;

    public Address(String street, int number, String postCode, String city) {
        this.street = street;
        this.number = number;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }
}
