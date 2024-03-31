package Sprint1.Tasca1.Nivel2.Ejercicio1;

public class Menu {
    public static void main(String[] args) {
        Telefon movil = new Telefon("Samsung","H20");
        System.out.println(movil.call("96511151"));

        Smartphone iphone = new Smartphone("Iphone", "14");
        iphone.alarma();
        iphone.fotografiar();
    }
}
