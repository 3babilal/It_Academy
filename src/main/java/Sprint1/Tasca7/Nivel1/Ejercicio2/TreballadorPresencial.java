package Sprint1.Tasca7.Nivel1.Ejercicio2;



public class TreballadorPresencial extends Treballador {

    private static int gasoline = 3;
    private int salary;

    public TreballadorPresencial(String name, String lastname, int priceHour) {
        super(name, lastname, priceHour);
    }
    @Deprecated
    public void sickLeave() {
        System.out.println("Estas de baja por enfermedad");
    }
    @Override
    public void calculateSalary(int hours) {
        salary = hours * getPriceHour()+gasoline;
        System.out.println("Horas trabajadas : "+ hours + "\n Precio horas : "+ getPriceHour() + "\n Coste internet :" +
                gasoline + " \n Salario Total :" + salary);
    }
}