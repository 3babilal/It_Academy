package Sprint3.Tasca1.Nivel3;

import Sprint3.Tasca1.Nivel3.Command.Accelerate;
import Sprint3.Tasca1.Nivel3.Command.Command;
import Sprint3.Tasca1.Nivel3.Command.Start;
import Sprint3.Tasca1.Nivel3.Command.Stop;
import Sprint3.Tasca1.Nivel3.Vehicle.*;

import java.util.Optional;
import java.util.Scanner;

public class Menu {
    static int option = 0;
    static Scanner sc = new Scanner(System.in);
    static CallCommand commands = new CallCommand();
    public static void app(){
        do {
            System.out.println("QUIN VEHICLE VOLS UTILITZAR ?");
            option = sc.nextInt();

            switch (option){
                case 1 :order(new Car());
                        break;
                case 2 :order(new Bike());
                        break;
                case 3 :order(new Ship());
                        break;
                case 4 :order(new Plane());
                        break;
                default:
                    System.out.println("OPTION INVALID");
            }
        } while (option != 0);
    }
    public static void order(Vehicle vehicle){

        do {
            System.out.println("QUE ORDEN LE QUIERES DAR ?");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    commands.setStart((new Start(vehicle)));
                    commands.start();
                    break;
                case 2:
                    commands.setAccelerate(new Accelerate(vehicle));
                    commands.accelerate();
                    break;
                case 3:
                    commands.setStop(new Stop(vehicle));
                    commands.stop();
                    break;
                default:
                    System.out.println("INVALID OPTION");
            }
        }while (option != 0);



    }
}
