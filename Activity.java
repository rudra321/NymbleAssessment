import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> signedUpPassengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.signedUpPassengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public List<Passenger> getSignedUpPassengers() {
        return signedUpPassengers;
    }

    public void addPassenger(Passenger passenger) {
        if (signedUpPassengers.size() < capacity) {
            signedUpPassengers.add(passenger);
            if (passenger.getType() == PassengerType.STANDARD) {
                double activityCost = cost;
                if (passenger.getBalance() >= activityCost) {
                    passenger.setBalance(passenger.getBalance() - activityCost);
                } else {
                    System.out.println("Insufficient balance to sign up for the activity.");
                    signedUpPassengers.remove(passenger);
                }
            } else if (passenger.getType() == PassengerType.GOLD) {
                double activityCost = cost * 0.9; // 10% discount
                if (passenger.getBalance() >= activityCost) {
                    passenger.setBalance(passenger.getBalance() - activityCost);
                } else {
                    System.out.println("Insufficient balance to sign up for the activity.");
                    signedUpPassengers.remove(passenger);
                }
            }
        } else {
            System.out.println("Activity has reached its capacity. Cannot sign up more passengers.");
        }
    }
}
