package OOPHomeWorkWeek1.ContactList;

/**
 * Created by volodymyrkorniienko on 03.04.17.
 */
public class Contact {

    private String surname;
    private String name;
    private String phoneNumber;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact contactInit(String surname, String name, String phoneNumber) {
        Contact contact = new Contact();
        contact.surname = surname;
        contact.name = name;
        contact.phoneNumber = phoneNumber;
        return contact;
    }

    public String asString() {
        String stringFormatContact = String.format("Surname: %s, Name: %s, Phone number: %s",
                surname, name, phoneNumber);
        return stringFormatContact;
    }
}
