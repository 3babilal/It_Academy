package Sprint1.Tasca6.Nivel1.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Persona individuo = new Persona("Pepe", "Fernandez",49);
        GenericMethods.generic(individuo,"Barcelona",81001);
        System.out.println(individuo);
    }
}
