package HomeWork_Week3.Task3_13;

/**
 * Created by volodymyrkorniienko on 21.03.17.
 */
public class TestContact {
    public static void main(String[] args) {

        ContactBook contactBook = ContactBook.init(10);
        Contact contact1 = Contact.init("VovaK", "0938541731");
        Contact contact2 = Contact.init("Vova02", "0978541732");
        Contact contact3 = Contact.init("Vova03", "0938541733");
        Contact contact4 = Contact.init("Vova04", "0958541736");
        Contact contact5 = Contact.init("Vova05", "0958541735");
        Contact contact6 = Contact.init("Vova06", "0938541736");
        Contact contact7 = Contact.init("Vova07", "0958541737");
        Contact contact8 = Contact.init("Vova08", "0978541738");
        Contact contact9 = Contact.init("Vova09", "0958541739");
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

        //contactBook.firstFiveContacts();
        //contactBook.lastFiveContacts();
        //contactBook.removeLast();
        //contactBook.showAllContacts();
        //contactBook.updateContactInfo(Contact.init("Vova10", "0958541731"), "Vova11", "0958541741");
        //contactBook.showLifeContact();
        contactBook.showKyivstareContact();
        //contactBook.showAllContacts();
    }
}
