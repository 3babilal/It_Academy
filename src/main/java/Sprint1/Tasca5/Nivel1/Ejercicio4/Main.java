package Sprint1.Tasca5.Nivel1.Ejercicio4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Leer archivo txt :");
        File path = new File(sc.nextLine());
        readFile(path);
    }
    public static void readFile(File path) {

        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            String str;
            while ((str = input.readLine()) != null && !str.isEmpty()) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
