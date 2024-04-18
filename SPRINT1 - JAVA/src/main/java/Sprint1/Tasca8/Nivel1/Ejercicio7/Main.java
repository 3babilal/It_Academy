package Sprint1.Tasca8.Nivel1.Ejercicio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list =  Arrays.asList("aaaa",234,"aa",3,"aaaaaa",5687489);

        list.stream()
                .map(String::valueOf)
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
