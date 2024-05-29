package Sprint1.Tasca3.Nivel2.Ejercicio2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
    private String name;
    private int score;
    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
    @Override
    public String toString() {
        return "Restaurant " +
                name + '\'' +
                ", puntuacion " + score +
                '\n';
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        int compareByName = this.getName().compareTo(restaurant.getName());
        int compareByScore = restaurant.getScore() - this.getScore();
        if(compareByName != 0){
            return compareByName;
        }else {
            return compareByScore;
        }
    }
}

