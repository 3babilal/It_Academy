package Sprint1.Examen;

public class Trauma extends Doctor{
    public Trauma(int numberFloor, String name, String speciality) {
        super(numberFloor, name, speciality);
    }
    private void examenClinic(){
        System.out.println("Examen traumatologia");
    }
}
