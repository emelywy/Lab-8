package zalik.task5;

public class Trolleybus extends Traffic{

    public Trolleybus() {
        super();
    }

    public Trolleybus(String route, int interval, int capacity, String driverName,
                      String fuelType, String startTime) {
        super(route, interval, capacity, driverName, fuelType, startTime);
    }
}
