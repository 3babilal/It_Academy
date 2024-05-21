package Sprint3.Tasca1.Nivel3.Vehicle;

public class Ship implements Vehicle{
    @Override
    public void start() {
        System.out.println("ARRANCAR BARCO");
    }

    @Override
    public void accelerate() {
        System.out.println("ACELERANDO BARCO");
    }

    @Override
    public void stop() {
        System.out.println("FRENANDO BARCO");
    }
}
