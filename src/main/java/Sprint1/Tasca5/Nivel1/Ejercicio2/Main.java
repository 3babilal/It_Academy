package Sprint1.Tasca5.Nivel1.Ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path;
        Scanner sc = new Scanner(System.in);

        System.out.println("Buscar ruta :");
        path = sc.nextLine();
        searchPath(path);
    }
    public static void searchPath(String path) {

        File pack = new File(path);
        File[] allFiles = pack.listFiles();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Arrays.sort(allFiles);
        for(int i = 0; i< allFiles.length; i++){
            if(allFiles[i].isDirectory()){
                System.out.println(String.format(String.format("D: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()))));
                String absPath = allFiles[i].getAbsolutePath();
                searchPath(absPath);
            }else{
                System.out.println("F: " + allFiles[i].getName()+ " última data de modificació " + date.format(allFiles[i].lastModified()));
            }
        }
    }
}
