package addressbook;

public class Main {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Contact contact1 = new Contact(
            1, "Ashish", "9876543210",
            "ashish@example.com", "Chennai"
        );

        addressBook.addContact(contact1);
        addressBook.displayContacts();
    }
}