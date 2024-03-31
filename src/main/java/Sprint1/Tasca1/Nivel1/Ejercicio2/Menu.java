package Sprint1.Tasca1.Nivel1.Ejercicio2;

public class Menu {
    public static void main(String[] args) {
        //System.out.println("Static nos permite acceder a la marca " +  Cotxe.marca +" y modelo " +Cotxe.model +" sin crear el objeto");
        //Cotxe.model = "X5";
        //System.out.println("El modelo no es final y por lo tanto podemos cambiarlo  " + Cotxe.model + " sin crear el objeto");
        System.out.println("\nEl unico atributo que se puede inicializar en el constructor es potencia ya no es estatico");



        System.out.println("\nLa potencia al no ser static nos obliga a crear un objeto para acceder a su valor");
        Cotxe ferrari = new Cotxe("Mercedez",50);
        Cotxe bmw = new Cotxe("hhhh", 150);
        System.out.println(ferrari);
        System.out.println(bmw);
        System.out.println("El metodo statico nos permite ");
        Cotxe.frenar();
        ferrari.accelerar();
    }

}
