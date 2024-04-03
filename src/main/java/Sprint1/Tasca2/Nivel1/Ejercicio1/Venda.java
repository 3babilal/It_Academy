package Sprint1.Tasca2.Nivel1.Ejercicio1;

import java.util.ArrayList;

public class Venda {

    private int totalPrice;
    private ArrayList<Producte> products = new ArrayList<Producte>();

    public Venda() {

    }

    public void addProduct(Producte product) {
        products.add(product);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int calculatorTotal()throws VendaBuidaException {
        try {
            if (products.isEmpty()) {
                throw new VendaBuidaException("Per fer una venda primer has d'afegir productes!");
            }
            for (Producte producte : products) {
                totalPrice += producte.getPrice();
            }

            Producte[] error = new Producte[1];
            error[5] = new Producte(null, totalPrice);


        } catch (VendaBuidaException e) {
            String mensaje = e.getMessage();
            System.out.println(mensaje);

        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println("Excepcion Out Of Bounds " + g.getMessage());
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Preu total venda=" + totalPrice + ", productes=" + products + "]";
    }

}

