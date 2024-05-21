package Sprint3.Tasca1.Nivel1;

import java.util.Scanner;
import java.util.SortedMap;

public class Menu {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        int option = 99;
        String word = "";
        do {
            System.out.println("1 AÑADIR");
            System.out.println("2 DESHACER");
            System.out.println("3 VER LISTA");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case (1):
                    System.out.println("INTRODUCE LA PALABRA");
                    word = sc.nextLine();
                    undo.add(word);

                    break;
                case (2):
                    undo.undoLast();
                    break;
                case (3):
                    undo.showAll();
                    break;
                case (0):
                    System.out.println("HAS SALIDO DEL PROGRAMA");
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (option != 0);
    }
}


