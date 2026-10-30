
package addressbook;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Contact contact1 = new Contact(
            1, "Ashish", "9876543210",
            "ashish@example.com", "Chennai"
        );

        Contact contact2 = new Contact(
            2, "Aryan", "9876501234",
            "aryan@example.com", "Lucknow"
        );

        Contact contact3 = new Contact(
            3, "Rahul", "9123456780",
            "rahul@example.com", "Delhi"
        );
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);
        System.out.println("\nAfter editing:");
        addressBook.displayContacts();

        System.out.println("\nBefore deleting contact with ID 1:");
        addressBook.displayContacts();

        System.out.println("\nAfter deleting contact with ID 1:");
        addressBook.deleteContact(1);
        addressBook.displayContacts();

    }
}
