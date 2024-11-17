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
public class CamionTest {
    private static final Logger LOG = Logger.getLogger(CamionTest.class.getName());

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");

        Camion camion = new Camion("CAM001", "Mercedes-Benz", "Actros", true, 12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO);

        assertEquals("Actros",camion.getModelo());
        assertEquals(TipoCamion.PEQUEÑO,camion.getTipoCamion());

        LOG.info("Finalizando test datos iguales");
    }

    //Prueba datos enteros
    @Test
    public void datosEnteros() {
            
        LOG.info("Iniciado test datos Enteros");
        
        Camion camion = new Camion("CAM001", "Mercedes-Benz", "Actros", true, 12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO);
        
        assertThrows(Throwable.class,()-> new Camion("CAM001", "Mercedes-Benz", "Actros", true,-12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO));

        LOG.info("Finalizando test datos Enteros");
    }
}
