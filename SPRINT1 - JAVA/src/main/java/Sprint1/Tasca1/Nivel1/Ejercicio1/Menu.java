package Sprint1.Tasca1.Nivel1.Ejercicio1;

public class Menu {
    public static void main(String[] args) {
        System.out.println(Instrument.location);
        Vent flauta = new Vent("flauta",30);
        flauta.play();

        Corda guitarra = new Corda("guitarra", 50);
        guitarra.play();

        Percussio bateria = new Percussio("bateria", 250);
        bateria.play();

        bateria.toString();

    }
}
