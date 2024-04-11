package Tasca4.Nivel1.Eejrcicio3;

import Sprint1.Tasca4.Nivel1.Ejercicio3.LaunchException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LaunchEceptionTest {
    @Test
    @DisplayName("Debe lanzar un ArrayIndexOutOfBoundsException")

    public void launchException(){
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, LaunchException::launchException);
    }
}
