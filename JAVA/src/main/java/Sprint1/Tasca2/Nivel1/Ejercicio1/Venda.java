package Sprint1.Tasca2.Nivel1.Ejercicio1;

import java.util.ArrayList;

public class Venda {

    private int totalPrice;
    private final Producte[] products;

    public Venda(Producte[] products) throws VendaBuidaException {
        if(products.length==0){
            throw new VendaBuidaException("No haz añadido productos");
        }
        this.products = products;
    }
    public int calculatorTotal(){

            for (Producte producte : products) {
                totalPrice += producte.getPrice();
            }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Preu total venda=" + totalPrice + ", productes=" + products + "]";
    }

}

