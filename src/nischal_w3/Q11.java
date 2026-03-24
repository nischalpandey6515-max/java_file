package nischal_w3;

public class Q11 {

    private String street;
    private String city;
    private String zipCode;
    
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }

   
    public static void main(String[] args) {
        Q11 addr = new Q11();

        addr.setStreet("Main Road");
        addr.setCity("Biratnagar");
        addr.setZipCode("56613");

        addr.displayAddress();
    }
}
