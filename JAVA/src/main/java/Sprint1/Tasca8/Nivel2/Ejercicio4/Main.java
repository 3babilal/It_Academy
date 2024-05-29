package Sprint1.Tasca8.Nivel2.Ejercicio4;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hola","Mundo","Hoy","a","fecha","z","Lunes","1","del","09","del","2024","Hace","Muy","Buen","Tiempo",".","Estoy","en", "el","Trabajo");

        order(list);
        startsWithE(list);
        changeToNumber(list);
        numbers(list);
    }
    public static void order(List<String> list){
        System.out.println("ordenado");
        System.out.println(list.stream()
                .map(String::toLowerCase)
                .sorted((a, b) -> Character.compare(a.charAt(0), b.charAt(0)))
                .collect(Collectors.toList()));
    }
    public static void startsWithE(List<String> list){
        System.out.println("\nempieza e");
        list.stream()
                .filter(data -> data.startsWith("e"))
                .forEach(System.out::println);
        list.stream()
                .filter(data -> !data.startsWith("e"))
                .forEach(System.out::println);
    }
    public static void changeToNumber(List<String> list){
        System.out.println("\nchange 4");
        list.stream()
                .map(data -> data.replace('a','4'))
                .forEach(System.out::println);
    }
    public static void numbers(List<String> list){
        System.out.println("\nnumeros");
        list.stream()
                .filter(object -> Character.isDigit(object.charAt(0)))
                .forEach(System.out::println);
    }
}
