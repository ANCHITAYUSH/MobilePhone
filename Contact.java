
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return number;
    }

    public static Contact createContact(String name, String number) {
        return new Contact(name, number);
    }
}
