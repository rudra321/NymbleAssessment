public class Main {
    public static void main(String[] args) {
        // Create destinations
        Destination destination1 = new Destination("Destination 1");
        Destination destination2 = new Destination("Destination 2");

        // Create activities
        Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 10, destination1);
        Activity activity2 = new Activity("Activity 2", "Description 2", 150.0, 5, destination1);
        Activity activity3 = new Activity("Activity 3", "Description 3", 200.0, 8, destination2);

        // Add activities to destinations
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination2.addActivity(activity3);

        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Travel Package 1", 2);

        // Add destinations to travel package
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Create passengers
        Passenger passenger1 = new Passenger("Passenger 1", 1, PassengerType.STANDARD);
        passenger1.setBalance(500.0);
        Passenger passenger2 = new Passenger("Passenger 2", 2, PassengerType.GOLD);
        passenger2.setBalance(1000.0);
        Passenger passenger3 = new Passenger("Passenger 3", 3, PassengerType.PREMIUM);
        passenger3.setBalance(0);

        // Add passengers to travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Sign up passengers for activities
        activity1.addPassenger(passenger1);
        activity1.addPassenger(passenger2);
        activity1.addPassenger(passenger3);
    }
}
