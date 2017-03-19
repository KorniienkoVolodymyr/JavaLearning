package HomeWork_Week3.Task3_11;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class TestBike {
    public static void main(String[] args) {

        Bike bike = Bike.init("Suzuki", "Motorbike", "777777", "New", 2500);
        Bike bike1 = Bike.init("Suzuki", "Motorbike", "777777", "New", 2500);
        Bike bike2 = Bike.init("Suzuki", "Motorbike", "777777", "New", 2500);

        Parking parking = Parking.init(Address.init("Kyiv", "Shevchenko", 10), 5, "Open");
        System.out.println(parking.address.city + " " + parking.address.street + " "
                + parking.address.houseNumber + " " + parking.bikePlaces.length + " "
                + parking.parkingStatus);

        parking.changeAddress(Address.init("Kharkiv", "Mira", 15), 20, "Close");
        System.out.println(parking.address.city + " " + parking.address.street + " "
                + parking.address.houseNumber + " " + parking.bikePlaces.length + " "
                + parking.parkingStatus);

        parking.open();

        parking.addMotoOnLastFreePlace(bike);
        parking.addMotoOnLastFreePlace(bike1);
        parking.addMotoOnLastFreePlace(bike2);

        parking.takeLastMoto();

        parking.addMotoByPlaceNumber(bike2, 17);

        parking.showAllInGarage();
    }
}
