package homeWork.PhoneBook;

public class Address {
    
    private int aptHouseNumber;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;

    
    public Address() {
    }

    public Address(int aptHouseNumber, String streetName, String city, String state, String zipCode) {
        this.aptHouseNumber = aptHouseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public int getAptHouseNumber() {
        return aptHouseNumber;
    }
    public void setAptHouseNumber(int aptHouseNumber) {
        this.aptHouseNumber = aptHouseNumber;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address [aptHouseNumber=" + aptHouseNumber + ", streetName=" + streetName + ", city=" + city
                + ", state=" + state + ", zipCode=" + zipCode + "]";
    }


}
