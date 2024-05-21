package Sprint3.Tasca1.Nivel3.Vehicle;

public class Plane implements Vehicle{

    @Override
    public void start() {
        System.out.println("ARRANCANDO EL AVION");
    }

    @Override
    public void accelerate() {
        System.out.println("ACELERANDO EL AVION");
    }

    @Override
    public void stop() {
        System.out.println("FRENANDO EL AVION");
    }
}
