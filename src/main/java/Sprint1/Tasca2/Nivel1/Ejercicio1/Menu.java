package Sprint1.Tasca2.Nivel1.Ejercicio1;

public class Menu {
    public static void main(String[] args) throws VendaBuidaException    {
        Producte primero = new Producte("Producto1", 50);
        Producte segundo = new Producte("Producto2", 60);

        Producte tercero = new Producte("Producto3", 70);
        Producte quarto = new Producte("Producto4", 80);

        Producte quinto = new Producte("Producto5", 90);
        Producte sexto = new Producte("Producto6", 100);

        Venda vip = new Venda();

        Venda buida = new Venda();
        vip.addProduct(segundo);
        vip.addProduct(sexto);
        vip.addProduct(tercero);

        System.out.println(vip.calculatorTotal());
        System.out.println(buida.calculatorTotal());

    }

}

