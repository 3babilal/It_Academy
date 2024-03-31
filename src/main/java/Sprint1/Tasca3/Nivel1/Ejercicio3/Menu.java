package Sprint1.Tasca3.Nivel1.Ejercicio3;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.dir")+"/countries.txt");
        Scanner sc = new Scanner(System.in);
        String name ="";
        int score = 0;
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(file));
            String line;

            HashMap<String, String> countriesData = new HashMap<String, String>();
            while((line = reader.readLine()) != null) {
                String[] content = line.split(" ");
                countriesData.put(content[0], content[1]);

            }
            System.out.println("Nom usuari :");
            name = sc.nextLine();

            for(int i = 0; i<10; i++) {

                Object[] arrayObjectes = countriesData.keySet().toArray();
                Object key = arrayObjectes[new Random().nextInt(arrayObjectes.length)];
                System.out.println(key);
                System.out.println("Introdueix el nom de la capital :");
                String capital = sc.nextLine();

                if(capital.equalsIgnoreCase(countriesData.get(key))) {
                    System.out.println("Puntos +1");
                    score++;
                }else {
                    System.err.println("No");
                }
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter f = new FileWriter(System.getProperty("user.dir")+"/classificacio.txt",true);
            f.write(name + ", Score = " + score + "\n");
            f.close();
        }catch (Exception e) {

        }

    }

}

