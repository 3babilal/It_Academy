package Sprint1.Tasca8.Nivel1.Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("UNO", "DOS", "TRES", "CUATRO");

        List<String> charO = names.stream().filter(s->s.contains("O")).toList();
        charO.forEach(System.out::println);

    }
}
