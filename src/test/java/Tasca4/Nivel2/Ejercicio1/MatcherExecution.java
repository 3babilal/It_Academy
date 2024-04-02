package Tasca4.Nivel2.Ejercicio1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatcherExecution {
    @Test
    @DisplayName("Longitud de la palabra")
    public void test(){
        String str = "Mordor";
        assertThat(str, new MatcherString(is(6)));
    }
}
