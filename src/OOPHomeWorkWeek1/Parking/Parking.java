package OOPHomeWorkWeek1.Parking;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Parking {

    public Address address;
    public Bike[] bikePlaces;
    public String parkingStatus;

    public static Parking init(Address address, int size, String parkingStatus) {
        Parking parking = new Parking();
        parking.address = address;
        parking.bikePlaces = new Bike[size];
        parking.parkingStatus = parkingStatus;
        return parking;
    }

    public void changeAddress(Address address, int size, String parkingStatus) {
        this.address = address;
        this.bikePlaces = new Bike[size];
        this.parkingStatus = parkingStatus;
    }

    public void addMotoOnLastFreePlace(Bike bike) {
        if (parkingStatus == "Open") {
            for (int i = 0; i < this.bikePlaces.length; i++) {
                if (this.bikePlaces[i] == null) {
                    this.bikePlaces[i] = bike;
                    System.out.println("your bike was parking on last free place");
                    break;
                }
            }
        } else {
            System.out.println("Sorry parking close");
        }
    }

    public void takeLastMoto() {
        if (parkingStatus == "Open") {
            for (int i = this.bikePlaces.length - 1; i >= 0; i--) {
                if (this.bikePlaces[i] != null) {
                    this.bikePlaces[i] = null;
                    System.out.println("Last bike return");
                    break;
                }
            }
        }
    }

    public void addMotoByPlaceNumber(Bike bike, int bikePlaces) {
        if (parkingStatus == "Open") {
            if (this.bikePlaces[bikePlaces - 1] != null) {
            System.out.println("Sorry this park place isn't free");
        } else {
            System.out.println("Your bike parking");
            this.bikePlaces[bikePlaces - 1] = bike;
        }
    } else {
            System.out.println("Sorry parking close");
        }
    }

    public void clearGaragePlaces() {
        for (int i = 0; i < this.bikePlaces.length; i++) {
            this.bikePlaces[i] = null;
        }
        System.out.println("Parking was clear");
    }

    public void open() {
        this.parkingStatus = "Open";
        System.out.println("You can park your bike!");
    }

    public void close() {
        this.parkingStatus = "Close";
        System.out.println("Sorry. You can't park your bike");
    }

    public void showAllInGarage() {
        for (int i = 0; i < this.bikePlaces.length; i++) {
            if (this.bikePlaces[i] != null) {
                System.out.println("Place #" + (i + 1) +
                        ": " + this.bikePlaces[i].model);
            } else {
                System.out.println("Place #" + (i + 1) +
                        ": is free");
            }
        }
    }
}