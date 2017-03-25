package HomeWork_Week3.Task3_13;

/**
 * Created by volodymyrkorniienko on 25.03.17.
 */
public class Contact {

    public String contactName;
    public String contactNumber;

    public static Contact init(String contactName, String contactNumber) {
        Contact contact = new Contact();
        contact.contactName = contactName;
        contact.contactNumber = contactNumber;
        return contact;
    }
}
