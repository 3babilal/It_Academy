package Sprint1.Tasca6.Nivel1.Ejercicio1;

public class NoGenericMethods {
    Bulding Ritzz;
    Bulding Vela;
    Bulding Carlemany;

    public NoGenericMethods(Bulding Ritzz, Bulding Vela, Bulding Carlemany){
        this.Ritzz = Ritzz;
        this.Vela = Vela;
        this.Carlemany = Carlemany;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "Ritzz=" + Ritzz.getName() +
                ", Vela=" + Vela.getPrice() +
                ", Carlemany=" + Carlemany.getYearConstruction() +
                '}';
    }
}
