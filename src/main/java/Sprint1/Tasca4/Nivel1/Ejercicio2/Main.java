package Sprint1.Tasca4.Nivel1.Ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //parametrizado, no hace falta añadir los DNI por consola
       int counter = 0; 
       do{
           System.out.println("Introduce el dni");
           int numberId = sc.nextInt();
           char correctLetter = CalculoDni.getLetter(numberId);
           System.out.println("Dni :"+numberId+correctLetter);
           counter++;

       }while(counter<10);
    }
}
