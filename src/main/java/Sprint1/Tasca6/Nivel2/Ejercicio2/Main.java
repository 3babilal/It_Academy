package Sprint1.Tasca6.Nivel2.Ejercicio2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Persona individuo = new Persona("Pepe", "Fernandez", 49);
        list.add(individuo);
        list.add("String");

        IndefiniteVariableMethod.generic(list);
        
    }
}
