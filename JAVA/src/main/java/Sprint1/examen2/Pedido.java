package Sprint1.examen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private static Scanner sc = new Scanner(System.in);
    private static Client c1 = new Client("Client","Address");
    private static Client c2 = new Client("Client2","Address");
    private static Client c3 = new Client("Client3","Address");

    private static Repartidor r1 = new Repartidor("Repartidor",true,Transport.MOTO);
    private static Repartidor r2 = new Repartidor("Repartidor2",true,Transport.PIE);
    private static Repartidor r3 = new Repartidor("Repartidor3",true,Transport.BICICLETA);

    private static List<Client> clients = List.of(c1,c2,c3);
    private static List<Repartidor> repartidors = List.of(r1,r2,r3);
    private static List<Pedidos> pedidos = new ArrayList<>();


}
