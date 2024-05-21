package Tasca4.Nivel1.Ejercicio1;

import Sprint1.Tasca4.Nivel1.Ejercicio1.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MonthTest {
    @Test
    @DisplayName("Debe tener 12 objetos")
    void  monthsSize(){
        Assertions.assertEquals(12, Month.getMonths().size());
    }
    @Test
    @DisplayName("Comprueba que tenemos valores")
    void notNull(){
        Assertions.assertNotEquals(null,Month.getMonths());
        Assertions.assertNotNull(Month.getMonths());
    }
    @Test
    @DisplayName("Comprueba que el 8 més es Agosto")
    void monthAugust(){
        Assertions.assertEquals("Agosto",Month.getMonths().get(7));
    }
}
