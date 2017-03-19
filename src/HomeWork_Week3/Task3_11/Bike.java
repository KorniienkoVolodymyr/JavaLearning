package HomeWork_Week3.Task3_11;

/**
 * Created by volodymyrkorniienko on 18.03.17.
 */
public class Bike {

    public String model;
    public String type;
    public String number;
    public String statusOrder;
    public int cost;
    public String owner;

    public static Bike init(String model, String type, String number, String statusOrder, int cost) {
        Bike newBike = new Bike();
        newBike.model = model;
        newBike.type = type;
        newBike.number = number;
        newBike.statusOrder = statusOrder;
        newBike.cost = cost;

        return newBike;
    }
}
