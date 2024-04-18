package Sprint1.Tasca8.Nivel2.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arnau","Berta","Ana","Carlos","Daniel", "Ave");
        names.stream()
                .filter(name -> name.startsWith("A")&& name.length()==3)
                .forEach(System.out::println);
    }
}
