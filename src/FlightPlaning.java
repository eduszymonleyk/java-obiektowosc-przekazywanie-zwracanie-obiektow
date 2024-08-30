public class FlightPlaning {

    public static void main(String[] args) {
        FlightRepo repo = new FlightRepo(10);

        // Nr samolotu
        Plane plane1 = new Plane(1111);

        Flight flight1 = new Flight(12, 15, plane1);
        Flight flight2 = new Flight(19, 21, plane1);

        repo.addFlight(flight1);
        repo.addFlight(flight2);
        repo.displayAll();
    }
}
