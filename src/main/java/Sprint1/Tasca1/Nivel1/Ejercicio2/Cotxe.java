package Sprint1.Tasca1.Nivel1.Ejercicio2;

public class Cotxe {

    private static final String Brand = "bmw";

    private static String model = "320";

    private final int Power;
    public Cotxe(String model,int power){
        this.model = model;
        this.Power = power;
    }
    static void stop() {
        System.out.println("\nEl vehicle està frenant");
    }
    public void accelerate() {
        System.out.println("\nEl vehicle està accelerant");
    }
    @Override
    public String toString() {
        return "Cotxe potencia=" + Power + " " + "marca=" + Brand + " " + " model =" + model;
    }


}