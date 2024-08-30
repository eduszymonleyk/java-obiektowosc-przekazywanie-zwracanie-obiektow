public class FlightRepo {
    Flight[] cruises;
    int index = 0;

    public FlightRepo(int size) {
        this.cruises = new Flight[size];
    }

    void addFlight(Flight flight) {
        cruises[index] = flight;
        index++;
    }

    void displayAll() {
        System.out.println("-------- Wszystkie rejsy ---------");
        for (Flight cruise : cruises) {
            if (cruise != null) {
                cruise.display();
                System.out.println("------------------------------");
            }
        }
    }
}
