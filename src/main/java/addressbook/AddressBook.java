
package addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }
    public boolean editContact(int id, String name, String phone,String email, String city) 
    {
        for (Contact contact : contacts) 
            {
            if (contact.getId() == id) 
                {
                contact.setName(name);
                contact.setPhone(phone);
                contact.setEmail(email);
                contact.setCity(city);

                System.out.println("Contact updated successfully!");
                return true;
            }
        }

        System.out.println("Contact not found!");
        return false;
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println("ID: " + contact.getId());
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone: " + contact.getPhone());
            System.out.println("Email: " + contact.getEmail());
            System.out.println("City: " + contact.getCity());
            System.out.println("----------------------");
        }
    }
}
