package Sprint1.Tasca1.Nivel2.Ejercicio1;

public class Smartphone  extends Telefon implements Camera, Rellotge{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void photograph() {
        System.out.println("S’està fent una foto");
    }
    @Override
    public void alarm() {
        System.out.println("Està sonant l’alarma");
    }
}
