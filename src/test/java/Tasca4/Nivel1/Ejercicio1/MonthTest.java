package Tasca4.Nivel1.Ejercicio1;

import Sprint1.Tasca4.Nivel1.Ejercicio1.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MonthTest {
    @Test
    @DisplayName("Deberia tener 12 meses")
    void  monthsSize(){
        Assertions.assertEquals(12, Month.getMonths().size());
    }
    @Test
    @DisplayName("Comprueba que no es nulo")
    void notNull(){
        Assertions.assertNotEquals(null,Month.getMonths());
        Assertions.assertNotNull(Month.getMonths());
    }
    @Test
    @DisplayName("Mes 8 agosto")
    void monthAugust(){
        Assertions.assertEquals("Agosto",Month.getMonths().get(7));
    }
}
