public class Flight {

    int departureTime;
    int arrivalTime;
    Plane plane;

    public Flight(int departureTime, int arrivalTime, Plane plane) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.plane = plane;
    }

    public void display() {
        System.out.print("Departure time: " + departureTime);
        System.out.println();
        System.out.print("Arrival time: " + arrivalTime);
        System.out.println();

        plane.display();
    }
}
