package Sprint1.EscapeRoom.Menu;

import Sprint1.EscapeRoom.Elementos.Decoration;
import Sprint1.EscapeRoom.Elementos.Pistas;
import Sprint1.EscapeRoom.Exceptions.EmptyListException;
import Sprint1.EscapeRoom.Salas.Sala;
import Sprint1.examen2.Pedidos;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static int option = 0;
    static Scanner sc = new Scanner(System.in);
    private static Decoration d1 = new Decoration(1,"Decoration",2.45,"Metal");
    private static Decoration d2 = new Decoration(2,"Decoration2",3.45,"OTHER");

    private static Pistas p1 = new Pistas(3,"Pista",45.54, 2.4,"Theme");
    private static Pistas p2 = new Pistas(4,"Pista2",95.54, 0.4,"NON-Theme");

    static List<Decoration> decorations = List.of(d1,d2);
    static List<Pistas> pistas = List.of(p1,p2);

    private static Sala s1 = new Sala("Sala1",2, decorations, pistas);

    public static void start(){
        do{
            System.out.println("1 - CREATE SALA");
            System.out.println("2 - ADD PISTA");
            System.out.println("3 - ADD DECORATION");
            System.out.println("4 - INVENTORY");
            System.out.println("5 - DELET FROM INVENTORY");

            try{
                option = sc.nextInt();
                switch (option){
                    case (1) :
                        createSala();
                        break;
                    case (2) :
                        addPista();
                        break;
                    case (3) :
                        //addDecoration();
                        break;
                    case (4) :
                        //inventory();
                        break;
                    case (5) :
                        //deleteItem();
                        break;
                    case (0) :
                        System.out.println("HAS SORTIT");
                        break;
                    default:
                        System.out.println("OPCION ERRONEO");
                }
            }catch (InputMismatchException e) {
                System.out.println("ENTRADA NO VALIDA");
                sc.nextLine();
            }catch (IndexOutOfBoundsException e) {
                System.out.println("ENTRADA FORA DEL RANG");
                sc.nextLine();
            }catch (Exception e) {
                System.out.println("ERROR INESPERAT : " + e.getMessage());
            }
            }while (option != 0);
        }
        public static void createSala() throws EmptyListException {
            Pistas p = showPista();
            Decoration d = showDecoration();
            System.out.println("INTRODUCE EL NOMBRE DE LA SALA :");
            String name = sc.nextLine();
            if(name.isEmpty()){
               throw new EmptyListException ("NO HAS INTRODUCIDO EL NOMBRE DE LA SALA");
            }else {
                System.out.println("INTRODUCE EL NIVEL");
                int level = sc.nextInt();
                if(level<0){
                    System.out.println("EL NIVEL INTRODUCIDO ES INCORRECTO");
                }else {
                   // Sala s = new Sala(name,level,pistas,decorations);
                    System.out.println("SALA CREADA CORRECTAMENTE");
                }
            }
        }
        public static void searchPista() throws EmptyListException {
            if(pistas.isEmpty()){
                throw new EmptyListException("NO SE HAN CREADO PISTAS PREVIAMENTE ");
            }
            pistas.forEach(System.out::println);
        }
        public static void searchDecoration() throws EmptyListException {
            if(decorations.isEmpty()){
                throw new EmptyListException("NO SE HAN CREADO DECORACIONES PREVIAMENTE");
            }
            decorations.forEach(System.out::println);
        }

        public static Pistas showPista() throws EmptyListException{
            searchPista();
            Pistas p = null;
            boolean find = false;
            System.out.println("QUE PISTA QUIERES AÑADIR A LA SALA :");
            int pistaId = sc.nextInt();
            for(int i = 0; i<pistas.size(); i++){
                if(pistas.get(i).equals(pistaId)){
                    find = true;
                    p = pistas.get(i);
                }
            }
            if(!find){
                System.out.println("EL NUMERO DE PISTA " + pistaId + " INTRODUCIDA NO EXISTE");
            }
            return p;
        }
    public static Decoration showDecoration() throws EmptyListException{
        searchDecoration();
        Decoration d = null;
        boolean find = false;
        System.out.println("QUE DECORACION QUIERES AÑADIR A LA SALA :");
        int pistaId = sc.nextInt();
        for(int i = 0; i<decorations.size(); i++){
            if(decorations.get(i).equals(pistaId)){
                find = true;
                d=decorations.get(i);
            }
        }
        if(!find){
            System.out.println("EL NUMERO DE DECORACION  " + pistaId + " INTRODUCIDA NO EXISTE");
        }
        return d;
    }
    public static void addPista(){
        System.out.println("INTRODUCE EL NOMBRE DE LA PISTA");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("INTRODUCE EL PRECIO DE LA PISTA");
        double precio = sc.nextDouble();
        System.out.println("INTRODUCE EL TIEMPO");
        double time = sc.nextDouble();
        sc.nextLine();
        System.out.println("INTRODUCE EL TEMA DE LA PISTA");
        String theme = sc.nextLine();
        sc.nextLine();


    }

    }


