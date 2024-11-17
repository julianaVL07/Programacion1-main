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
public class ElectricoTest {
    private static final Logger LOG = Logger.getLogger(ElectricoTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");
        Electrico electrico = new Electrico("ELE001", "Tesla", "Model 3", true, 1, 250.0, 0.0, Transmision.AUTOMATICA, Combustible.ELECTRICO, 500.0, 1.5);
        assertThrows(Throwable.class,()-> new Electrico(" ", " ", " ", true, 1, 250.0, 0.0, Transmision.AUTOMATICA, Combustible.ELECTRICO, 500.0, 1.5));
        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
            
        LOG.info("Iniciado test datos iguales");
        
        Electrico electrico = new Electrico("ELE001", "Tesla", "Model 3", true, 1, 250.0, 0.0, Transmision.AUTOMATICA, Combustible.ELECTRICO, 500.0, 1.5);
        assertEquals(Transmision.AUTOMATICA, electrico.getTransmision());

        LOG.info("Finalizando test datos iguales");
    }
}
