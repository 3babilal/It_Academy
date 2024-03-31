package Sprint1.Tasca8.Nivel1.Ejercicio6;

import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        List<Object> list =  Arrays.asList("aaaa",234,"aa",3,"aaaaaa",5687489);

       list.stream()
               .map(String::valueOf)
               .sorted(Comparator.comparing(String::length))
               .forEach(System.out::println);
    }
}
