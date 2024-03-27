//package Sprint1.Tasca5.Nivel1.Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path;
        //Scanner sc = new Scanner(System.in);

        System.out.println("Buscar ruta :");
        path = args[0]; //sc.nextLine();
        searchPath(path);
    }
    public static void searchPath(String path) {

        File pack = new File(path);

        if (pack.exists() && pack.isDirectory()) {
            File[] allFiles = pack.listFiles();
            assert allFiles != null;
            for (File file : allFiles) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No trobat");
        }
    }
}

