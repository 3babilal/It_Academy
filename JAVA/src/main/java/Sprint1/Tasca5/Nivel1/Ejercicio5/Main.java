package Sprint1.Tasca5.Nivel1.Ejercicio5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileObject file = new FileObject("Test", 1);
        serialization(file);
        deserialization();
    }
    public static void serialization(FileObject file){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.ser"));
            outputStream.writeObject(file);
            outputStream.close();
            System.out.println("Serializado");
        }catch (IOException e){
            System.out.println("Error");
        }
    }
    public static void deserialization(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.ser"));
            FileObject fileDeserializated = (FileObject) inputStream.readObject();
            inputStream.close();
            System.out.println("Deserializado");
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error");
        }
    }
}



