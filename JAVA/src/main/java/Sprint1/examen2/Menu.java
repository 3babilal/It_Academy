package Sprint1.examen2;

import java.util.*;


public class Menu {
    static int option = 0;
    static int id = 0;
    static Scanner sc = new Scanner(System.in);
    private static Client c1 = new Client("Marcos", "Calle");
    private static Client c2 = new Client("Pepa", "Calle");
    private static Client c3 = new Client("Pepe", "Calle");

    private static Repartidor r1 = new Repartidor("Repartidor",false,Transport.MOTO);
    private static Repartidor r2 = new Repartidor("Repartidor2",true,Transport.PIE);
    private static Repartidor r3 = new Repartidor("Repartidor3",true,Transport.BICICLETA);
    static ArrayList<Item> items = new ArrayList<Item>();
    static ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
    private static List<Client> clients = List.of(c1,c2,c3);
    private static List<Repartidor> repartidors = List.of(r1,r2,r3);

    public static void start() {
        do {
            System.out.println("CREAR PEDIDO");
            System.out.println("MARCAR PEDIDO ENTREGADO");
            System.out.println("LISTAR PEDIDOS PENDIENTES");
            System.out.println("LISTAR PEDIDOS ENTREGADOS");
            try {
                option = sc.nextInt();
                switch (option) {
                    case (1):
                        newCommand();
                        break;
                    case (2):
                        deliverDone();
                        break;
                    case (3):
                        deliverWaiting();
                        break;
                    case (4):
                        deliverDoit();
                        break;
                    case (0):
                        System.out.println("Fins aviat!");
                        break;
                    default:
                        System.out.println("OPCION ERRONEA");
                }

            }catch (InputMismatchException e){
                System.out.println("ENTRADA NO VALIDA");
                sc.nextLine();
            }catch (Exception e){
                System.out.println("Error inesperado" + e.getMessage());
            }
        } while (option != 0);
    }
    public static void choseItems(){
        int option =99;
        do {
            System.out.println("QUE VOLS ORDENAR:\n1 BURRITOS, \n2 HAMBURGUESAS, \n3 KEBAB, \n4 PIZZA \n0 FINALIZAR ORDEN");
            try {
                option = sc.nextInt();
                switch (option) {
                    case (1):
                        items.add(new Burrito());
                        break;
                    case (2):
                        items.add(new Hamburguer());
                        break;
                    case (3):
                        items.add(new Kebab());
                        break;
                    case (4):
                        items.add(new Pizza());
                        break;
                    case (0):
                        System.out.println("Articulos añadidos");
                    default:
                        System.out.println("Error");
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR ENTRADA NO VALIDA");
                sc.nextLine();
            }catch (Exception e){
                System.out.println("ERROR : " + e.getMessage());
            }
        }while (option != 0);
    }

    private static void calculateItems(ArrayList<Item> items) throws EmptyListException {
        if(items.isEmpty()){
           throw new EmptyListException("SENSE PRODUCTES");
        }
        double total = 0;
        for (Item item: items){
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println(total);
    }

    public static void showClient() throws EmptyListException{
        if(clients.isEmpty()){
            throw new EmptyListException("SENSE CLIENTS");
        }
        System.out.println("LLISTA DE CLIENTS:");
        for(Client clt: clients){
            System.out.println(clt.getName());
        }
    }
    public static Client searchClient() throws EmptyListException {
        showClient();

        Client ct = null;
        System.out.println("Introduce el nombre del cliente :");
        String name = sc.next();
        boolean trobat = false;
        for(int i = 0; i< clients.size(); i++){
            if(clients.get(i).getName().equalsIgnoreCase(name)){
                trobat = true;
                ct = clients.get(i);
            }
        }
        if(!trobat){
            throw new EmptyListException("El cliente " + name + " no existe .");
            //start();
        }
        return ct;
    }
    public static Repartidor repartidorRandom() throws EmptyListException{

        Repartidor rp = null;
        if(repartidors.stream().noneMatch(Repartidor::isDisponibilidad)) {
            throw new EmptyListException(" SIN REPARTIDORES DISPONIBLES");
        }
        else{
            ArrayList<Repartidor> repartidorsDisponibles = new ArrayList<Repartidor>();

            for (Repartidor repartidor : repartidors) {
                if(repartidor.isDisponibilidad()){
                repartidorsDisponibles.add(repartidor);
                }
            }
            Random random = new Random();
            int index = random.nextInt(repartidorsDisponibles.size());
            Repartidor repartidor = repartidorsDisponibles.get(index);
            repartidor.setDisponibilidad(false);
            rp = repartidor;
            choseItems();
            return rp;
        }
    }
    public static void newCommand() throws EmptyListException {
        Client cl = searchClient();
        Repartidor rp = repartidorRandom();

            if(rp != null && items != null && cl != null){
                Pedidos p = new Pedidos(cl,rp,items,id++, false);
                System.out.println(p);
                pedidos.add(p);
                items.clear();
            }
    }
    public static void deliverDone() throws Exception{
        if (pedidos.isEmpty()){
            throw new EmptyListException(" sin pedidos pendientes");
        }
        deliverWaiting();
        System.out.println(" QUE PEDIDO QUIERES MARCAR COMO ENTREGADO:");
        try {
            int optionDelivery = sc.nextInt();
            pedidos.get(optionDelivery).setDelivery(true);
            System.out.println(pedidos.get(optionDelivery));
            Repartidor r = pedidos.get(optionDelivery).getRepartidor();
            r.setDisponibilidad(true);
            System.out.println(r);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fuera de rango");
        }
    }
    public static void deliverWaiting() {
        for (int i = 0; i < pedidos.size(); i++) {
            if(!pedidos.get(i).isDelivery()) {
                System.out.println(pedidos.get(i));
            }else {
                System.out.println(" SIN PEDIDOS PENDIENTES");
            }
        }
    }
    public static void deliverDoit() {
        if(pedidos.isEmpty()){
            // falta la excepcion de vacio
        }
        for (int i = 0; i < pedidos.size(); i++) {
            if(pedidos.get(i).isDelivery()) {
                System.out.println(pedidos.get(i));
            }
        }
    }
}
