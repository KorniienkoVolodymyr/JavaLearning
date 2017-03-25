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
}