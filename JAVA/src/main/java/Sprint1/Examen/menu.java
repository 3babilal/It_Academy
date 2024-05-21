package Sprint1.Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    static ArrayList<Diagnosis> diagnosis = new ArrayList<Diagnosis>();

    public static void main(String[] args) {
        Neuroleg Marc = new Neuroleg(2,"marc","neuro");
        doctors.add(Marc);

        //Paciente Jaume = new Paciente();
        int option = 0;
        do{
            option = crud(option);
            switch (option){
                case 1:
                 //   addClient();
                    break;
                case 2:
                 //   addAppointment();
                    break;
                case 3:
                 //   deletAppointment();
                    break;
                case 4:
                 //   showAppointment();
                    break;
                case 5:
                 //   showAppointment();
            }
        }while (option != 9);
    }
    public static int crud(int option){
            System.out.println("add pacient");
            System.out.println("add appointment");
            System.out.println("delete appointment");
            System.out.println("search appointment");
            System.out.println("search doctor calender");
            option = sc.nextInt();
            return option;
    }

}
