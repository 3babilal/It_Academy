package Sprint1.Tasca1.Nivel1.Ejercicio1;

public class Menu {
    public static void main(String[] args) {
        System.out.println(Instrument.ubicacion);
        Vent flauta = new Vent("flauta",30);
        flauta.tocar();

        Corda guitarra = new Corda("guitarra", 50);
        guitarra.tocar();

        Percussio bateria = new Percussio("bateria", 250);
        bateria.tocar();

        bateria.toString();

    }
}
