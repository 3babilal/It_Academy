package Sprint1.Tasca1.Nivel1.Ejercicio1;

import Sprint1.Tasca1.Nivel1.Ejercicio1.Instrument;

public class Percussio extends Instrument {

    public Percussio(String nom, int preu) {
        super(nom, preu);
    }
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }

}
