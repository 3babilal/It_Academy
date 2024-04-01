package Sprint1.Tasca3.Nivel2.Ejercicio2;

import Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant;

import java.util.HashSet;

public class Menu {
    public static void main(String[] args) {
        HashSet<Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant> restaurants = new HashSet<>();
        Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant r1 = new Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant("Dolce Vita", 7);
        Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant r2 = new Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant("Dolce Vita", 7);
        Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant r3 = new Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant("La italiana", 7);
        Sprint1.Tasca3.Nivel2.Ejercicio1.Restaurant r4 = new Restaurant("La italiana", 2);
        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);

        System.out.println(restaurants);
    }
}
