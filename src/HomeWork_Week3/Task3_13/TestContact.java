package HomeWork_Week3.Task3_13;

/**
 * Created by volodymyrkorniienko on 21.03.17.
 */
public class TestContact {
    public static void main(String[] args) {

        ContactBook contactBook = ContactBook.init(10);
        Contact contact1 = Contact.init("Vova1", "0958541731");
        Contact contact2 = Contact.init("Vova2", "0958541732");
        Contact contact3 = Contact.init("Vova3", "0958541733");
        Contact contact4 = Contact.init("Vova4", "09585417364");
        Contact contact5 = Contact.init("Vova5", "0958541735");
        Contact contact6 = Contact.init("Vova6", "0958541736");
        Contact contact7 = Contact.init("Vova7", "0958541737");
        Contact contact8 = Contact.init("Vova8", "0958541738");
        Contact contact9 = Contact.init("Vova9", "0958541739");
        Contact contact10 = Contact.init("Vova10", "0958541740");

        contactBook.addContact(contact1);
        contactBook.addContact(contact2);
        contactBook.addContact(contact3);
        contactBook.addContact(contact4);
        contactBook.addContact(contact5);
        contactBook.addContact(contact6);
        contactBook.addContact(contact7);
        contactBook.addContact(contact8);
        contactBook.addContact(contact9);
        contactBook.addContact(contact10);

        contactBook.lastFiveContacts();
    }
}
