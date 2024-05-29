package Sprint1.Tasca6.Nivel2.Ejercicio2;

import java.util.ArrayList;

public class IndefiniteVariableMethod {
    public static <T> void generic(ArrayList<T> list){
        for (T element : list){
            System.out.println(element);
        }
    }
}