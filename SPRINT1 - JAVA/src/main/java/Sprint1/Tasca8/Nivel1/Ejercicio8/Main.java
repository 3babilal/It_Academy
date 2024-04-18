package Sprint1.Tasca8.Nivel1.Ejercicio8;

public class Main {
    public static void main(String[] args) {

        FunctionalInterface reverseOrder = data ->(new StringBuilder(data)).reverse().toString();
        System.out.println(reverseOrder.reverse("Hola mundo"));
    }
}
