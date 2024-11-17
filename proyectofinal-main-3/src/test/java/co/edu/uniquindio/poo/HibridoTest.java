/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class HibridoTest {
    private static final Logger LOG = Logger.getLogger(HibridoTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");

        Hibrido hibrido1 = new Hibrido("HIB001", "Toyota", "Prius", true, 6, 180.0, 1.8, Transmision.AUTOMATICA, Combustible.HIBRIDO, true, true);
        assertThrows(Throwable.class,()-> new Hibrido(" ", " ", " ", true, 6, 180.0, 1.8, Transmision.AUTOMATICA, Combustible.HIBRIDO, true, true));
        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
            
        LOG.info("Iniciado test datos iguales");
        
        Hibrido hibrido1 = new Hibrido("HIB001", "Toyota", "Prius", true, 6, 180.0, 1.8, Transmision.AUTOMATICA, Combustible.HIBRIDO, true, true);
        assertEquals(Combustible.HIBRIDO, hibrido1.getCombustible());
        assertEquals(6, hibrido1.getCambios());

        LOG.info("Finalizando test datos iguales");
    }
}
