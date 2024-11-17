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
public class VanTest {
    private static final Logger LOG = Logger.getLogger(VanTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");

        Van van = new Van("VAN001", "Toyota", "Hiace", true, 6, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.DIESEL, 
        12, 4, 6, true, true, true, 3500.0);

        assertThrows(Throwable.class,()-> new Van(" ", " ", " ", true, 6, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.DIESEL,12, 4, 6, true, true, true, 3500.0));

        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos iguales 
    @Test
    public void datosIguales() {
            
        LOG.info("Iniciado test datos iguales");
    
        Van van = new Van("VAN001", "Toyota", "Hiace", true, 6, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.DIESEL, 
        12, 4, 6, true, true, true, 3500.0);

        assertEquals(3500.0, van.getCapacidadMaletero());

        LOG.info("Finalizando test datos iguales");
    }
}
