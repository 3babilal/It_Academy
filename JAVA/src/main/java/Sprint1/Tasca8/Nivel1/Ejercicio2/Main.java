package Sprint1.Tasca8.Nivel1.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("UNO", "DOS", "TRES", "CUATRO", "VEINTI-CINCO");

        List<String> charO = names.stream().filter(s->s.contains("O") && s.length()>5).toList();
        charO.forEach(System.out::println);

    }
}

