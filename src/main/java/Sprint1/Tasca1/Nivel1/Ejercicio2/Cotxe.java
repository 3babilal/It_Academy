package Sprint1.Tasca1.Nivel1.Ejercicio2;

public class Cotxe {
    //no se puede cambiar el valor que tiene y nos permite acceder a la variable marca desde el main al ser static
    private static final String Marca = "bmw";
    //nos permite acceder a la variable model desde el main al ser static
    private static String model;
    //se debe inicializar el objeto para acceder a la variable, no se puede cambiar el valor al ser final
    private final int Potencia;
    public Cotxe(String modelo,int potencia){
        this.model = modelo;
        this.Potencia = potencia;
    }

    static void frenar() {
        System.out.println("\nEl vehicle està frenant");
    }
    public void accelerar() {
        System.out.println("\nEl vehicle està accelerant");
    }
    @Override
    public String toString() {
        return "Cotxe potencia=" + Potencia + " " + "marca=" + Marca + " " + " model =" + model;
    }


}