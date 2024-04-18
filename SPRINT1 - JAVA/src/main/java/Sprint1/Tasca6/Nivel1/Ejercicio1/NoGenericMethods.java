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

    public Bulding getRitzz() {
        return Ritzz;
    }

    public void setRitzz(Bulding ritzz) {
        Ritzz = ritzz;
    }

    public Bulding getVela() {
        return Vela;
    }

    public void setVela(Bulding vela) {
        Vela = vela;
    }

    public Bulding getCarlemany() {
        return Carlemany;
    }

    public void setCarlemany(Bulding carlemany) {
        Carlemany = carlemany;
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
