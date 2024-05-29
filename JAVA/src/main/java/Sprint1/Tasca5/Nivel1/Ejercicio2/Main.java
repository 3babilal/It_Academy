package Sprint1.Tasca5.Nivel1.Ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar ruta :");
        File path = new File(sc.nextLine());
        searchPath(path);
    }
    public static void searchPath(File path) {

        if(path.exists()) {
            File[] allFiles = path.listFiles();
            SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            Arrays.sort(allFiles);
            for (int i = 0; i < allFiles.length; i++) {
                if (allFiles[i].isDirectory()) {
                    System.out.printf((String.format("Folder: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()))) + "%n");
                    File absPath = new File(allFiles[i].getAbsolutePath());
                    searchPath(absPath);
                } else {
                    System.out.println("File: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()));
                }
            }
        }else {
            System.out.println("No existeix la ruta");
        }
    }
}
