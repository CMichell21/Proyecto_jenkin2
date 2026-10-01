
package src.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import src.service.FuncionesService;

public class FuncionesServiceTest {
    
   @Test
   public void ProbarMayorEdad() {
       boolean respuesta = FuncionesService.MayorEdad(25);
       assertTrue(respuesta);
   }
   
   @Test
   public void probarMenorEdad(){
       boolean respuesta = FuncionesService.MayorEdad(13);
       assertFalse(respuesta);
   }
   
}
