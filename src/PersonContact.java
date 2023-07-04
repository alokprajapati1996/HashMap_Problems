public class PersonContact {
    String firstName;
    String lastName;
    String address;
    String city;
    long phoneNumber;
    String email;
int srNo;
    public PersonContact(int srNo,String firstName, String lastName, String address, String city, long phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.srNo=srNo;
    }

    @Override
    public String toString() {
        return "PersonContact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", srNo=" + srNo +
                '}';
    }
}
