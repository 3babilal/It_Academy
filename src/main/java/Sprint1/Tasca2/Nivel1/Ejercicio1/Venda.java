package Sprint1.Tasca2.Nivel1.Ejercicio1;

import java.util.ArrayList;

public class Venda {

    private int preuTotalVenda;
    private ArrayList<Producte> productes = new ArrayList<Producte>();

    public Venda() {

    }

    public void afegirProducte(Producte producto) {
        productes.add(producto);
    }

    public int getPreuTotalVenda() {
        return preuTotalVenda;
    }

    public void setPreuTotalVenda(int preuTotalVenda) {
        this.preuTotalVenda = preuTotalVenda;
    }

    public int calcularTotal()throws VendaBuidaException {
        try {
            if (productes.size() == 0) {
                throw new VendaBuidaException("Per fer una venda primer has d'afegir productes!");
            }
            for (Producte producte : productes) {
                preuTotalVenda += producte.getPreu();
            }

            Producte[] error = new Producte[1];
            error[5] = new Producte(null, preuTotalVenda);


        } catch (VendaBuidaException e) {
            String mensaje = e.getMensaje();
            System.out.println(mensaje);

        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println("Excepcion Out Of Bounds " + g.getMessage());
        }

        return preuTotalVenda;
    }

    @Override
    public String toString() {
        return "Preu total venda=" + preuTotalVenda + ", productes=" + productes + "]";
    }

}

