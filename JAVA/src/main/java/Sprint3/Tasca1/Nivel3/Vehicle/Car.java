package Sprint3.Tasca1.Nivel3.Vehicle;
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("COCHE ARRANCANDO");
    }

    @Override
    public void accelerate() {
        System.out.println("COCHE ACELERANDO");
    }

    @Override
    public void stop() {
        System.out.println("COCHE FRENANDO");

    }
}
