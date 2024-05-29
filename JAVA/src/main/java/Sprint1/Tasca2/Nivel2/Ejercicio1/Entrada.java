package Sprint1.Tasca2.Nivel2.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner sc = new Scanner(System.in);
    private static String errorMessage ="Error de Format";
    public static byte readByte(String message){
        byte readByte;
        do{
            System.out.println(message);
            try {
                readByte = sc.nextByte();
                break;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while(true);
        return readByte;
    }
    public static int readInt(String message){
        int readInt;
        do{
            System.out.println(message);
            try {
                readInt = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while(true);
        return readInt;
    }
    public static float readFloat(String message){
        float readFloat;
        do{
            System.out.println(message);
            try {
                readFloat = sc.nextFloat();
                break;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while (true);
        return readFloat;
    }
    public static double readDouble(String message){
        double readDouble;
        do {
            System.out.println(message);
            try{
                readDouble = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while (true);
        return readDouble;
    }
    public static char readChar(String message){
        char readChar;
        do{
            System.out.println(message);
            try {
                readChar = sc.next().charAt(0);
                break;
            }catch (Exception e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while (true);
        return readChar;
    }
    public static String readString(String message){
        String readString;
        do{
            System.out.println(message);
            sc.nextLine();
            try {
                readString = sc.nextLine();
                break;
            }catch (Exception e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while (true);
        return readString;
    }
    public static boolean readYesNot(String message){
        String answer;
        boolean answerConditional;
        do {
            System.out.println(message);
            answer = sc.next();
            try {
                    if (answer.equalsIgnoreCase("s")){
                        answerConditional = true;
                        break;
                    }else if (answer.equalsIgnoreCase("n")) {
                        answerConditional = false;
                        break;
                    }else{
                        throw new Exception();
                }
            }catch (Exception e){
                System.out.println(errorMessage);
                sc.nextLine();
            }
        }while(true);
        return answerConditional;
    }
}
