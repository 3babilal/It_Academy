package Sprint1.Tasca1.Nivel1.Ejercicio1;

import Sprint1.Tasca1.Nivel1.Ejercicio1.Instrument;

public class Vent extends Instrument {

    public Vent(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");

    }

}