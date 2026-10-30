
package addressbook;

public class Contact {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String city;

    public Contact(int id, String name, String phone,
                   String email, String city) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }
}
