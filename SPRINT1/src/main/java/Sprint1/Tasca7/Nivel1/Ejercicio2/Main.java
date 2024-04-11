package Sprint1.Tasca7.Nivel1.Ejercicio2;


public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        TreballadorOnline bilal = new TreballadorOnline("Bilal","layache",11);
        TreballadorPresencial pepito = new TreballadorPresencial("Pepito", "Fernandez",14);
        bilal.methodDeprecated();
        pepito.methodObsolet();


    }
}
