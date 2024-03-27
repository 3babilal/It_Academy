package Sprint1.Tasca8.Nivel1.Ejercicio6;

import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        List<Object> list =  Arrays.asList("aaaa",234,"aa",3,"aaaaaa",5687489);

       list.stream()
               .filter(data -> data instanceof  String || data instanceof Integer)
               .map(data -> data instanceof Integer ? String.valueOf(data): (String) data)
               .sorted(Comparator.comparingInt((String dataS) ->dataS.length()))
               .forEach(System.out::println);
    }
}
