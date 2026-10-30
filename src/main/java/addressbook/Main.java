
package addressbook;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Contact contact1 = new Contact(
            1, "Ashish", "9876543210",
            "ashish@example.com", "Chennai"
        );

        addressBook.addContact(contact1);

        System.out.println("\nBefore editing:");
        addressBook.displayContacts();

        addressBook.editContact(
            1, "Ashish Srivastava", "9123456780",
            "mustafa@example.com", "Lucknow"
        );

        System.out.println("\nAfter editing:");
        addressBook.displayContacts();

        System.out.println("\nBefore deleting contact with ID 1:");
        addressBook.displayContacts();

        System.out.println("\nAfter deleting contact with ID 1:");
        addressBook.deleteContact(1);
        addressBook.displayContacts();

    }
}
