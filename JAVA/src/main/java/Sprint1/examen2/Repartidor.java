package Sprint1.examen2;

public class Repartidor {
    //protected int id;
    protected String name;
    protected boolean disponibilidad;

    protected Transport type;
    public Repartidor(String name, boolean disponibilidad, Transport type) {
        this.name = name;
        this.disponibilidad = disponibilidad;
        this.type = type;
    }

    public Transport getType() {
        return type;
    }

    public void setType(Transport type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                ", name='" + name + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", type=" + type;
    }
}
