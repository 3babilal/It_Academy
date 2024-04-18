package Sprint1.Tasca2.Nivel1.Ejercicio1;

public class Menu {
    public static void main(String[] args) {

        try {
            Producte[] empty = new Producte[0];
            Venda empty_sell = new Venda(empty);

            System.out.println(empty_sell.calculatorTotal());
        }catch (VendaBuidaException e){
            System.out.println("Error " + e.getMessage());
        }
        try {
            Producte[] products = new Producte[1];
            products[0] = new Producte("Producto",25);
            Venda sell = new Venda(products);
            Producte arrayBoundException = products[99];
        }catch (ArrayIndexOutOfBoundsException | VendaBuidaException e){
            System.out.println("Error " + e.getMessage());
        }
    }

}

