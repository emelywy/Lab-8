package zalik.task5;

public class AirConditioningDecorator extends Decorator {

    public AirConditioningDecorator(MethodOfMovement decoratedTransport) {
        super(decoratedTransport);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("  + Має кондиціонер");
    }
}
