package HomeWork_Week3.Task3_12;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Address {

    public String city;
    public String street;
    public int houseNumber;

    public static Address init(String cityName, String streetName, int houseNumber) {
        Address address = new Address();
        address.city = cityName;
        address.street = streetName;
        address.houseNumber = houseNumber;

        return address;
    }
}