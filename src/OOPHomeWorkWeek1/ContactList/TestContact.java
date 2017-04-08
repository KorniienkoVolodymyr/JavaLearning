package OOPHomeWorkWeek1.ContactList;

/**
 * Created by volodymyrkorniienko on 03.04.17.
 */
public class TestContact {

    public static void main(String[] args) {

        Contact[] contacts = new Contact[10];
        ContactList contactList = new ContactList(contacts);

        contactList.addContact(Contact.contactInit("Test1",  "Test1", "09dsdsa"));
        contactList.addContact(Contact.contactInit("Testq",  "Testi", "0678541737"));
        contactList.addContact(Contact.contactInit("Testw",  "Testu", "0988541738"));
        contactList.addContact(Contact.contactInit("Teste",  "Testy", "0958541739"));
        contactList.addContact(Contact.contactInit("Testr",  "Testt", "0958541740"));
        contactList.addContact(Contact.contactInit("Testt",  "Testr", "0958541741"));
        contactList.addContact(Contact.contactInit("Testy",  "Teste", "0738541742"));
        contactList.addContact(Contact.contactInit("Testu",  "Testw", "0958541743"));
        contactList.addContact(Contact.contactInit("Testi",  "Testq", "0938541744"));
        contactList.addContact(Contact.contactInit("Test",  "Test", "0958541745"));


        contactList.showAllContacts();

    }
}
