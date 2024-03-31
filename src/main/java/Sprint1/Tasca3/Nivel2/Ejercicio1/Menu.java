package Sprint1.Tasca3.Nivel2.Ejercicio1;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();
        Restaurant r1 = new Restaurant("Dolce Vita", 7);
        Restaurant r2 = new Restaurant("Dolce Vita", 7);
        Restaurant r3 = new Restaurant("La italiana", 7);
        Restaurant r4 = new Restaurant("La italiana", 2);
        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

        System.out.println(restaurants);
    }
}
