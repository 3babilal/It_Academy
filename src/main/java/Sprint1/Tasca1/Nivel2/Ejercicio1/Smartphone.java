package Sprint1.Tasca1.Nivel2.Ejercicio1;

public class Smartphone  extends Telefon implements Camera, Rellotge{

    public Smartphone(String marca, String model) {
        super(marca, model);
    }
    @Override
    public void fotografiar() {
        System.out.println("S’està fent una foto");
    }
    @Override
    public void alarma() {
        System.out.println("Està sonant l’alarma");
    }
}
