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
public class DeportivoTest {
    private static final Logger LOG = Logger.getLogger(DeportivoTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");

        Deportivo deportivo = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);

        assertThrows(Throwable.class,()-> new Deportivo(" ", " ", " ", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0));

        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");
        
        Deportivo deportivo = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);

        assertEquals("Ferrari",deportivo.getMarca());

        LOG.info("Finalizando test datos iguales");
    } 


}
