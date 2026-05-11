package zalik.task5;

public class Traffic implements MethodOfMovement {

    private String route;
    private int interval;
    private int capacity;
    private String driverName;
    private String fuelType;
    private String startTime;

    public Traffic() { //пустий конструктор

    }

    public Traffic(String route, int interval, int capacity, String driverName, String fuelType, String startTime) { // Конструктор з усіма параметрами
        this.route = route;
        this.interval = interval;
        this.capacity = capacity;
        this.driverName = driverName;
        this.fuelType = fuelType;
        this.startTime = startTime;
    }

    public String getRoute() {  // Гетери та сетери

        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public int getInterval() {
        return interval;
    }
    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public void move() {
        System.out.println(
                "Транспорт на маршруті " + route +
                        " рухається з інтервалом " + interval + " хв." +
                        ", місткість: " + capacity + " пас." +
                        ", водій: " + driverName +
                        ", паливо: " + fuelType +
                        ", старт: " + startTime
        );
    }
}
