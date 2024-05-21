package Sprint1.Tasca4.Nivel1.Ejercicio2;

public class CalculoDni {

public static String alphabetId ="TRWAGMYFPDXBNJZSQVHLCKE";



    public static char getLetter(int numbersId) {

        int idCalcul = numbersId % 23;
        char letterId = alphabetId.charAt(idCalcul);

        return letterId;
    }
}
