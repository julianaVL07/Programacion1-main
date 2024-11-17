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
public class SedanTest {
    private static final Logger LOG = Logger.getLogger(SedanTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");

        Sedan sedan = new Sedan("SED001", "Toyota", "Corolla", true, 6, 200.0, 1.8, Transmision.AUTOMATICA, Combustible.GASOLINA,
        5, 4, 6, true, true, true, true, false, true, true, 450.0);

        assertThrows(Throwable.class,()-> new Sedan(" ", " ", " ", true, 6, 200.0, 1.8, Transmision.AUTOMATICA, Combustible.GASOLINA,5, 4, 6, true, true, true, true, false, true, true, 450.0));

        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba bolsas de aire 
    @Test
    public void bolsasAire() {
            
        LOG.info("Iniciado test bolsas de aire");
        
        Sedan sedan = new Sedan("SED001", "Toyota", "Corolla", true, 6, 200.0, 1.8, Transmision.AUTOMATICA, Combustible.GASOLINA,
        5, 4, 6, true, true, true, true, false, true, true, 450.0);

        assertThrows(Throwable.class,()-> new Sedan(" ", " ", " ", true, 6, 200.0, 1.8, Transmision.AUTOMATICA, Combustible.GASOLINA,5, 4, 2, true, true, true, true, false, true, true, 450.0));

        LOG.info("Finalizando test bolsas de aire");
    }
}
