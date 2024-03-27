package Sprint1.Tasca5.Nivel1.Ejercicio5;

import java.io.*;
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

        System.out.println("Leer archivo txt :");
        path = sc.nextLine();
        readFile(path);

        FileObject file = new FileObject("Test", 1);
        serialization(file);
        deserialization();
    }
    public static void serialization(FileObject file){
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.ser"))){
            outputStream.writeObject(file);
            System.out.println("Serializado");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void deserialization(){
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.ser"))){
            FileObject fileDeserializated = (FileObject) inputStream.readObject();
            System.out.println("Deserializado");
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void searchPath(String path) {

        File pack = new File(path);
        File[] allFiles = pack.listFiles();
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Arrays.sort(allFiles);
        for (int i = 0; i < allFiles.length; i++) {
            if (allFiles[i].isDirectory()) {
                createFile(String.format(String.format("D: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()))));
                String absPath = allFiles[i].getAbsolutePath();
                searchPath(absPath);
            } else {
                createFile("F: " + allFiles[i].getName() + " última data de modificació " + date.format(allFiles[i].lastModified()));
            }
        }
    }

    public static void createFile(String file) {
        try (FileWriter searchFile = new FileWriter("search.txt", true)) {
            searchFile.write((file + "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {

        try {
            BufferedReader input = new BufferedReader(new FileReader(path));

            String str = "";
            while ((str = input.readLine()) != null && str.length() != 0) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



