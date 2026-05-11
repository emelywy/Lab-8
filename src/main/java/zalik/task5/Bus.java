package zalik.task5;

public class Bus extends Traffic {

    public Bus() {
        super();
    }

    public Bus(String route, int interval, int capacity, String driverName, String fuelType, String startTime) {
        super(route, interval, capacity, driverName, fuelType, startTime);
    }
}
