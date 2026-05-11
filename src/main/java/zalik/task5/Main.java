package zalik.task5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // cтворюємо транспорт з базовими параметрами
        MethodOfMovement bus1 = new Bus("12А", 10, 50, "Іван", "Дизель", "06:00");
        MethodOfMovement bus2 = new Bus("24Б", 15, 40, "Петро", "Газ", "06:30");
        MethodOfMovement tram1 = new Tramvay("5", 7, 120, "Марія", "Електро", "05:45");
        MethodOfMovement tram2 = new Tramvay("8", 10, 100, "Олексій", "Електро", "06:10");
        MethodOfMovement trolley1 = new Trolleybus("3", 12, 60, "Сергій", "Електро", "06:05");
        MethodOfMovement trolley2 = new Trolleybus("6", 8, 70, "Анна", "Електро", "06:20");

        // декорування транспортних засобів
        MethodOfMovement bus1WithWiFi = new WiFiDecorator(bus1);
        MethodOfMovement bus2WithAC = new AirConditioningDecorator(bus2);
        MethodOfMovement tram1WithAC = new AirConditioningDecorator(tram1);
        MethodOfMovement tram2WithWiFi = new WiFiDecorator(tram2);
        MethodOfMovement trolley1Full = new AirConditioningDecorator(new WiFiDecorator(trolley1));
        MethodOfMovement trolley2WithWiFi = new WiFiDecorator(trolley2);

        // динамічна колекція
        ArrayList<MethodOfMovement> transportList = new ArrayList<>();
        transportList.add(bus1WithWiFi);
        transportList.add(bus2WithAC);
        transportList.add(tram1WithAC);
        transportList.add(tram2WithWiFi);
        transportList.add(trolley1Full);
        transportList.add(trolley2WithWiFi);

        // вивід інформації
        System.out.println("Список транспорту з додатковими сервісами:");
        for (MethodOfMovement t : transportList) {
            t.move();
            System.out.println();
        }
    }
}
