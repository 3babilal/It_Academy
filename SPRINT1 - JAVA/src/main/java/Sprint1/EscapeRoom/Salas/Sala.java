package Sprint1.EscapeRoom.Salas;

import Sprint1.EscapeRoom.Elementos.Decoration;
import Sprint1.EscapeRoom.Elementos.Pistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sala {
    private int id;
    private String name;
    private int level;
    private double total;
    private List<Decoration> decorations = new ArrayList<>();
    private List<Pistas> pistas = new ArrayList<>();
    //public Sala(){};

    public Sala( String name, int level, List<Decoration> decorations, List<Pistas> pistas) {
        this.id = id++;
        this.name = name;
        this.level = level;
        total = totalSala();
        this.decorations = decorations;
        this.pistas = pistas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public List<Pistas> getPistas() {
        return pistas;
    }

    public void setPistas(List<Pistas> pistas) {
        this.pistas = pistas;
    }
    private double totalSala(){
        double total = 0;
        for (Decoration decoration: decorations){
            total += decoration.getTotalPrice();
        }
        for (Pistas pistas: pistas){
            total += pistas.getTotalPrice();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return id == sala.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Sala{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", total=" + total +
                '}';
    }
}
