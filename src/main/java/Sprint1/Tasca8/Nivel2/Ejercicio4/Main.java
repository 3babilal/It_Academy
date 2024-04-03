package Sprint1.Tasca8.Nivel2.Ejercicio4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //imprimir ordenado, primero los que empiezan por e(despues los otros),cambiar todas las a por un 4,mostrart solo los numericos

        List<String> list = Arrays.asList("Hola","Mundo","Hoy","A","fecha","z","Lunes","1","del","09","del","2024","Hace","Muy","Buen","Tiempo",".","Estoy","en", "el","Trabajo");

        System.out.println("ordenado");
        System.out.println(list.stream()
                .map(String::toLowerCase)
                .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .collect(Collectors.toList()));

        System.out.println("\nempieza e");
        list.stream()
                        .filter(data -> data.startsWith("e"))
                        .forEach(System.out::println);

        list.stream()
                        .filter(data -> !data.startsWith("e"))
                                .forEach(System.out::println);

        System.out.println("\n change 4");
        list.stream()
                .sorted()
                .map(data -> data.replace('a','4'))
                .forEach(System.out::println);

        System.out.println("\nnumeros");
        list.stream()
                .filter(object -> Character.isDigit(object.charAt(0)))
                .forEach(System.out::println);


    }
}
