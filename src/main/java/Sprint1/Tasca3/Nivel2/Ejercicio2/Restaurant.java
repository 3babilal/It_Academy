package Sprint1.Tasca3.Nivel2.Ejercicio2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int puntuacion;
    public Restaurant(String nom, int puntuacion) {
        this.nom = nom;
        this.puntuacion = puntuacion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacion == that.puntuacion && Objects.equals(nom, that.nom);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacion);
    }
    @Override
    public String toString() {
        return "Restaurant " +
                nom + '\'' +
                ", puntuacion " + puntuacion +
                '\n';
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        int compareByName = this.getNom().compareTo(restaurant.getNom());
        int compareByScore = restaurant.getPuntuacion() - this.getPuntuacion();
        if(compareByName != 0){
            return compareByName;
        }else {
            return compareByScore;
        }
    }
}

