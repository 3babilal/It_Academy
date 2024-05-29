package Sprint1.Tasca3.Nivel2.Ejercicio2;

import Sprint1.Tasca6.Nivel1.Ejercicio2.Persona;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Menu {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
        Restaurant r1 = new Restaurant("Dolce Vita", 7);
        Restaurant r2 = new Restaurant("Dolce Vita", 7);
        Restaurant r3 = new Restaurant("La italiana", 7);
        Restaurant r4 = new Restaurant("La italiana", 25);
        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

        System.out.println(restaurants);
        TreeSet listOrded = new TreeSet<Restaurant>(restaurants);
        for(Restaurant restaurant : restaurants){
            System.out.println(restaurant);
        }
    }
}
