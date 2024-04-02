package Sprint1.Tasca8.Nivel2.Ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 8, 9, 12, 5, 3, 4, 142);

        numbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .forEach(System.out::println);
    }
}
