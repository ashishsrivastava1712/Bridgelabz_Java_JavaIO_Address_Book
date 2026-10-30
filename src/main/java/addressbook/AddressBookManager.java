
package addressbook;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddressBookManager {

    private Map<String, AddressBook> addressBooks;

    public AddressBookManager() {
        addressBooks = new LinkedHashMap<>();
    }

    public boolean addAddressBook(String name) {
        if (addressBooks.containsKey(name)) {
            System.out.println("Address book already exists!");
            return false;
        }

        addressBooks.put(name, new AddressBook());
        System.out.println("Address book created: " + name);
        return true;
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public void displayAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No address books available.");
            return;
        }

        System.out.println("Available Address Books:");

        for (String name : addressBooks.keySet()) {
            System.out.println("- " + name);
        }
    }
}
