package Sprint1.Tasca3.Nivel1.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Month> mesos = new ArrayList<Month>();

        Month enero = new Month("Enero");
        Month febrero = new Month("Febrero");
        Month marzo = new Month("Marzo");
        Month abril = new Month("Abril");
        Month mayo = new Month("Mayo");
        Month junio = new Month("Junio");
        Month julio = new Month("Julio");
        Month septiembre = new Month("Septiembre");
        Month octubre = new Month("Octubre");
        Month noviembre = new Month("Noviembre");
        Month diciembre = new Month("Diciembre");

        Collections.addAll(mesos,enero,febrero,marzo,abril,mayo,junio,julio,septiembre,octubre,noviembre,diciembre);

        Month agosto = new Month("Agosto");
        mesos.add(7, agosto);
        for(int i = 0; i<mesos.size(); i++) {
            System.out.println(mesos.get(i).getName());
        }

        HashSet<Month> months = new HashSet<>(mesos);
        months.add(agosto);


        System.out.println("----------Recorrer con Iterator----------");
        Iterator<Month> it = months.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }

}