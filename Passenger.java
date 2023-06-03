public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType type;
    private double balance;

    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = 0.0;
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public PassengerType getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
