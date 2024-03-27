package Tasca4.Nivel1.Ejercicio2;

import Sprint1.Tasca4.Nivel1.Ejercicio2.CalculoDni;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IdNumberTest {
    @ParameterizedTest
    @DisplayName("Comprueba que el dni es correcto")
    @CsvSource({
            "85309331,P",
            "35626462,Z",
            "77429007,J",
            "16126215,H",
            "50435477,L",
            "34385292,Q",
            "77036169,S",
            "18036937,S",
            "82867789,P",
            "13972982,E"
    })
    public void calculIdTest(int numberId, char letterId){
        char letterCalcul = CalculoDni.getLetter(numberId);
        Assertions.assertEquals(letterId,letterCalcul);
    }
}
