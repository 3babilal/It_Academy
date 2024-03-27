package Sprint1.Tasca6.Nivel1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Bulding Ritzz = new Bulding("Ritzz",1500,1995);
        Bulding Vela = new Bulding("Vela", 885, 2007);
        Bulding Carlemany = new Bulding("Carlemany", 450, 1982);

        NoGenericMethods ng1 = new NoGenericMethods(Ritzz,Vela,Carlemany);
        NoGenericMethods ng2 = new NoGenericMethods(Carlemany,Ritzz,Vela);
        System.out.println(ng1);
        System.out.println(ng2);
    }
}
