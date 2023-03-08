package homeWork.PhoneBook;

public class People {

    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private Long phoneNumber;

    



    public People() {
    }

    

    public People(String firstName, String middleName, String lastName, Address address, Long phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @Override
    public String toString() {
        return "People [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
                + address + ", phoneNumber=" + phoneNumber + "]";
    }

}
