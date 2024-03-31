package Sprint1.Tasca1.Nivel1.Ejercicio1;



public class Corda extends Instrument {

    public Corda(String nom, int preu) {
        super(nom, preu);
    }
    {
        System.out.println("Inicializacion dentro clase Corda");
    }
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }

}
