package OOPHomeWorkWeek1.ContactList;

/**
 * Created by volodymyrkorniienko on 03.04.17.
 */
public class ContactList {

    private Contact[] contacts;

    public ContactList(Contact[] contacts) {
        this.contacts = contacts;
    }

    public boolean addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                    contacts[i] = contact;
                    return true;
                }

                if (contacts[i].getName().equals(contact.getName())) {
                    contacts[i] = null;
                    System.out.println("This conctact appear!!!");
                }

//                if (contacts[i].getName().matches("^[a-zA-Z]*$")) {
//                    System.out.println("Verify name");
//                }
//
//                if (!contacts[i].getSurname().matches("[a-zA-Z]")) {
//                System.out.println("Verify surname");
//                }
//
//                if (!contacts[i].getName().matches("[0-9]")) {
//                System.out.println("Verify phone" + contacts[i].asString());
//                }
            }
        return false;
    }

    public boolean removeContactBySurname(String surname) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getSurname().contains(surname)) {
                    contacts[i].setSurname(null);
                }
            }
        }
        return false;
    }

    public boolean removeContactByName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().contains(name)) {
                    contacts[i].setName(null);
                }
            }
        }
        return false;
    }

    public boolean removeContactByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getPhoneNumber().contains(phoneNumber)) {
                    contacts[i].setPhoneNumber(null);
                }
            }
        }
        return false;
    }

    public boolean findContactBySurname(String surname) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getSurname().contains(surname)) {
                    System.out.println(contacts[i].asString());
                }
            }
        }
        return false;
    }

    public boolean findContactByName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().contains(name)) {
                    System.out.println(contacts[i].asString());
                }
            }
        }
        return false;
    }

    public boolean findContactByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getPhoneNumber().contains(phoneNumber)) {
                    System.out.println(contacts[i].asString());
                }
            }
        }
        return false;
    }

    public boolean removeLastContact() {
        for (int i = contacts.length; i > 0; i--) {
            if (contacts[i] != null) {
                contacts[i].setSurname(null);
                contacts[i].setName(null);
                contacts[i].setPhoneNumber(null);
            }
        }
        return false;
    }

    public boolean showAllContacts() {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(contacts[i].asString());
            }
        }
        return false;
    }

    public boolean findFirstFiveContacts() {
        int index = 0;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (index < 5) {
                    System.out.println(contacts[i].asString());
                    index++;
                }
            }
        }
        return false;
    }

    public boolean findLastFiveContacts() {
        int lastIndex = contacts.length;
        for (int i = contacts.length - 1; i > lastIndex - 6; i--) {
            if (contacts[i] != null) {
                //if (lastIndex > contacts.length - 5) {
                System.out.println(contacts[i].asString());
                //lastIndex--;
            }
        }
        //}
        return false;
    }

    public boolean showLifeContacts() {
        String[] life = {"093", "073"};
        for (int i = 0; i < contacts.length; i++) {
            for (int j = 0; j < life.length; j++) {
                if (contacts[i].getPhoneNumber().contains(life[j])) {
                    System.out.println(contacts[i].asString());
                }
            }
        }
        return false;
    }

    public boolean showKyivstarContacts() {
        String[] kyivstar = {"097", "067", "098"};
        for (int i = 0; i < contacts.length; i++) {
            for (int j = 0; j < kyivstar.length; j++) {
                if (contacts[i].getPhoneNumber().contains(kyivstar[j])) {
                    System.out.println(contacts[i].asString());
                }
            }
        }
        return false;
    }
}
