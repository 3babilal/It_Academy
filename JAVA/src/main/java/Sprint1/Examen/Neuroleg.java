package Sprint1.Examen;

public class Neuroleg extends Doctor{
    public Neuroleg(int numberFloor, String name, String speciality) {
        super(numberFloor, name, speciality);
    }
    private void tomografia() {
        System.out.println("Examen neurologia");
    }
}
