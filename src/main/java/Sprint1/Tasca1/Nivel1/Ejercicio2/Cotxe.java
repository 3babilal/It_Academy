package Sprint1.Tasca1.Nivel1.Ejercicio2;

public class Cotxe {
    //no se puede cambiar el valor que tiene y nos permite acceder a la variable marca desde el main al ser static
    private static final String Brand = "bmw";
    //nos permite acceder a la variable model desde el main al ser static
    private static String model;
    //se debe inicializar el objeto para acceder a la variable, no se puede cambiar el valor al ser final
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