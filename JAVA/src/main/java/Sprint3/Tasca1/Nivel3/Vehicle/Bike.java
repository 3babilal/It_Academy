package Sprint3.Tasca1.Nivel3.Vehicle;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("BICI ARRANCANDO");
    }

    @Override
    public void accelerate() {
        System.out.println("BICI ACELERANDO");
    }

    @Override
    public void stop() {
        System.out.println("BICI FRENANDO");
    }
}
