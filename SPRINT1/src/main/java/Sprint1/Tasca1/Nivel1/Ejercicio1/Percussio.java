package Sprint1.Tasca1.Nivel1.Ejercicio1;

import Sprint1.Tasca1.Nivel1.Ejercicio1.Instrument;

public class Percussio extends Instrument {

    public Percussio(String name, int price) {
        super(name, price);
    }
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }

}
