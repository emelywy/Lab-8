package zalik.task5;

public class WiFiDecorator extends Decorator {

    public WiFiDecorator(MethodOfMovement decoratedTransport) {
        super(decoratedTransport);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("  + Має Wi-Fi для пасажирів");
    }
}
