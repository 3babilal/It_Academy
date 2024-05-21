package Sprint1.Tasca1.Nivel1.Ejercicio1;



public class Corda extends Instrument {

    public Corda(String name, int price) {
        super(name, price);
    }
    {
        System.out.println("Inicializacion dentro clase Corda");
    }
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

}
