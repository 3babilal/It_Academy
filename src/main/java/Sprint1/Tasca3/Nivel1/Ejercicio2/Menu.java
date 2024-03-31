package Sprint1.Tasca3.Nivel1.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Menu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        list.add(num1);
        list.add(num2);
        list.add(num3);

        System.out.println(list);

        List<Integer> listInversa = new ArrayList<>();

        ListIterator<Integer> listIteator = list.listIterator(list.size());
        while(listIteator.hasPrevious()) {

            int numeroInverso = listIteator.previous();
            listInversa.add(numeroInverso);
        }

        System.out.println(listInversa);
    }

}
