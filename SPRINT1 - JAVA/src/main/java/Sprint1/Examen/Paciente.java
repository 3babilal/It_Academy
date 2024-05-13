package Sprint1.Examen;

import java.util.ArrayList;

public abstract class Paciente {

    private int id;
    private String name;
    private ArrayList<Diagnosis> appointment;
    private final String HOSPITAL = "0001";

    public Paciente(int id, String name, ArrayList<Diagnosis> appointment) {
        this.id = id;
        this.name = name;
        this.appointment = appointment;
    }
}
