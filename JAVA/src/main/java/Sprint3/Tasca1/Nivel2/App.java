package Sprint3.Tasca1.Nivel2;

import Sprint3.Tasca1.Nivel2.Factory.AbstractFactory;
import Sprint3.Tasca1.Nivel2.Factory.IrelandFactory;
import Sprint3.Tasca1.Nivel2.Factory.SpainFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void menu(){
        int option = 0;

        do{
            System.out.println("OPCIONES: 1- AÑADIR 2- MOSTRAR 3- SALIR");
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    System.out.println("HAS SALIDO!");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!!");
            }

        }while (option != 3);
    }
    public static void add(){

        AbstractFactory factory = null;
        String name, phone, address;
        int option = 0;
        System.out.println("NOMBRE :");
        name = sc.nextLine();
        System.out.println("PHONE :");
        phone = sc.nextLine();
        System.out.println("ADDRESS :");
        address = sc.nextLine();

        do {
            System.out.println("1- SPAIN 2- IRELAND");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    factory = new SpainFactory();
                    break;
                case 2:
                    factory = new IrelandFactory();
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!!");
            }
        }while (option != 1 && option != 2);
        System.out.println("AÑADIDO");
        contacts.add(new Contact(name, factory.newAddress(address), factory.newPhone(phone)));
    }
    public static void show(){
        if(contacts.isEmpty()){
            System.out.println("SIN CONTACTOS");
        }else{
            for(Contact contact: contacts){
                System.out.println(contact);
            }
        }
    }
}
