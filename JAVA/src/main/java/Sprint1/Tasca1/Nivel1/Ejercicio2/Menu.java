package Sprint1.Tasca1.Nivel1.Ejercicio2;

public class Menu {
    public static void main(String[] args) {
        System.out.println("\nEl unico atributo que se puede inicializar en el constructor es potencia ya no es estatico");

        System.out.println("\nLa potencia al no ser static nos obliga a crear un objeto para acceder a su valor");
        Cotxe ferrari = new Cotxe(50);
        Cotxe bmw = new Cotxe(150);
        System.out.println(ferrari);
        System.out.println(bmw);

        Cotxe.stop();
        ferrari.accelerate();
    }

}
