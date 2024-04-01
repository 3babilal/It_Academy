package Sprint1.Tasca2.Nivel2.Ejercicio1;

public class Menu {
    public static void main(String[] args) {
        byte readByte = Entrada.readByte("Introduce un byte");
        System.out.println(readByte);
        int readInt = Entrada.readInt("Introduce un int");
        System.out.println(readInt);
        float readFloat = Entrada.readFloat("Introduce un float");
        System.out.println(readFloat);
        char readChar = Entrada.readChar("Introduce un char");
        System.out.println(readChar);
        String readString = Entrada.readString("Introduce un string");
        System.out.println(readString);
        boolean readBoolean = Entrada.readYesNot("Introduce S o N");
        System.out.println(readBoolean);

    }
}
