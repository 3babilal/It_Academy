package Sprint1.Tasca5.Nivel1.Ejercicio1;//package Sprint1.Tasca5.Nivel1.Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar ruta :");
        File path = new File(sc.nextLine());
        searchPath(path);
    }
    public static void searchPath(File path) {

        if (path.isDirectory()) {
            File[] allFiles = path.listFiles();
            if(allFiles != null) {
                for (File file : allFiles) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("No trobat");
        }
    }
}

