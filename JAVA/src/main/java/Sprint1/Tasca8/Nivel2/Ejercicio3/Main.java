package Sprint1.Tasca8.Nivel2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface add = Float::sum;
        FunctionalInterface multiply = (number, number2) -> number * number2;
        FunctionalInterface divide =(number, number2) -> number/number2;
        FunctionalInterface substract = (number, number2) -> number - number2;

        System.out.println(add.operation(1,2));
        System.out.println(multiply.operation(1,2));
        System.out.println(divide.operation(1,2));
        System.out.println(substract.operation(1,2));

    }
}
