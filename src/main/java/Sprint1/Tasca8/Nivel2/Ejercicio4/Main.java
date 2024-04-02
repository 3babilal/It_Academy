package Sprint1.Tasca8.Nivel2.Ejercicio4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hola","Mundo","Hoy","a","fecha","2024","Hace","Muy","Buen","Tiempo",".","Estoy","en", "el","Trabajo");
        list.stream()
                .filter(object -> Character.isDigit(object.charAt(0)))
                .sorted((a,b)->{

                }
    }
}
