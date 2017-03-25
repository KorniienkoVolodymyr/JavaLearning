package HomeWork_Week3.Task3_13;

/**
 * Created by volodymyrkorniienko on 21.03.17.
 */
public class ContactBook {

    public Contact[] contacts;

    public static ContactBook init(int countOfContatcs) {
        ContactBook contactBook = new ContactBook();
        contactBook.contacts = new Contact[countOfContatcs];

        return contactBook;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public void removeLast() {
        for (int i = contacts.length - 1; i >= contacts.length - 1; i--) {
            if (contacts[i] != null) {
                contacts[i] = null;
                break;
            } else {
                continue;
            }
        }
    }

    public void findContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].contactName.equals(contact.contactName) || contacts[i].contactNumber.equals(contact.contactNumber)) {
                System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
            }
        }
    }

    public void removeContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].contactName.equals(contact.contactName) || contacts[i].contactNumber.equals(contact.contactNumber)) {
                contacts[i].contactName = null;
                contacts[i].contactNumber = null;
            }
        }
    }

    public void updateContactInfo(Contact contact, String name, String number) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].contactName.equals(contact.contactName) || contacts[i].contactNumber.equals(contact.contactNumber)) {
                contacts[i].contactName = name;
                contacts[i].contactNumber = number;
            }
        }
    }

    public void showAllContacts() {
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
        }
    }

    public void firstFiveContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (i <= 4) {
                System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
            } else {
                break;
            }
        }
    }

    public void lastFiveContacts() {
        for (int i = contacts.length - 1; i > contacts.length - 6; i--) {
            System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
        }
    }

    public void showLifeContact() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].contactNumber.substring(0, 3).equals("093")) {
                System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
            }
        }
    }

    public void showKyivstareContact() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].contactNumber.substring(0, 3).equals("097")) {
                System.out.println(contacts[i].contactName + " " + contacts[i].contactNumber);
            }
        }
    }
}