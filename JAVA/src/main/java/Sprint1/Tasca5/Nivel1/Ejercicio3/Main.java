package Sprint1.Tasca5.Nivel1.Ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
                    createFile(String.format(String.format("D: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()))));
                    File absPath = new File(allFiles[i].getAbsolutePath());
                    searchPath(absPath);
                } else {
                    createFile("F: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()));
                }
            }
        }else {
            System.out.println("No trobat");
        }
    }
    public static void createFile(String file){
        try(FileWriter searchFile = new FileWriter("search.txt", true)){
            searchFile.write((file + "\n"));
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}

