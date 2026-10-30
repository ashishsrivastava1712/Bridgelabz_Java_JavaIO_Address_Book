
package addressbook;

public class Main {
    public static void main(String[] args) {

        AddressBookManager manager = new AddressBookManager();

        manager.addAddressBook("Personal");
        manager.addAddressBook("Work");

        AddressBook personal = manager.getAddressBook("Personal");
        AddressBook work = manager.getAddressBook("Work");

        personal.addContact(new Contact(
            1, "Ashish", "9876543210",
            "ashish@example.com", "Chennai"
        ));

        work.addContact(new Contact(
            2, "Rahul", "9123456780",
            "rahul@company.com", "Delhi"
        ));

        System.out.println("\nPersonal Address Book:");
        personal.displayContacts();

        System.out.println("\nWork Address Book:");
        work.displayContacts();

        System.out.println();
        manager.displayAddressBooks();
    }
}
