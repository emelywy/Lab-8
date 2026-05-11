package zalik.task5;

abstract class Decorator implements MethodOfMovement {

    protected MethodOfMovement decoratedTransport;

    public Decorator(MethodOfMovement decoratedTransport) {
        this.decoratedTransport = decoratedTransport;
    }

    @Override
    public void move() {
        decoratedTransport.move(); // викликаємо оригінальний рух
    }
}
