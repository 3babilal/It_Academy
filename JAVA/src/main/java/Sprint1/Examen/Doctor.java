package Sprint1.Examen;

public abstract class Doctor {

    protected int numberFloor;
    protected String name;
    protected String speciality;

    public Doctor(int numberFloor, String name, String speciality) {
        this.numberFloor = numberFloor;
        this.name = name;
        this.speciality = speciality;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
