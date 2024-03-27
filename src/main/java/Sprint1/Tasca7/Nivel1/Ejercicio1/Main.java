package Sprint1.Tasca7.Nivel1.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        TreballadorOnline bilal = new TreballadorOnline("Bilal","layache",11);
        TreballadorPresencial Pepito = new TreballadorPresencial("Pepito", "Fernandez",14);
        bilal.calculateSalary(8);
        Pepito.calculateSalary(12);

    }
}
