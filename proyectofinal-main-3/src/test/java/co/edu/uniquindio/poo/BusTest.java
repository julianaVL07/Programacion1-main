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


public class BusTest {
    private static final Logger LOG = Logger.getLogger(BusTest.class.getName());

    //Prueba numero de pasajeros
    @Test
    public void numeroPasajeros() {
        
        LOG.info("Iniciado test numero pasajeros");

        Bus bus = new Bus("BUS001", "Mercedes-Benz", "Sprinter", true, 6, 120.0, 3.0, Transmision.AUTOMATICA, Combustible.DIESEL, 5, 4, 6, true, true, true, 2, 2, 2000.0);

        assertThrows(Throwable.class,()-> new Bus("BUS001", "Mercedes-Benz", "Sprinter", true, 6, 120.0, 3.0, Transmision.AUTOMATICA, Combustible.DIESEL,-5, 4, 6, true, true, true, 2, 2, 2000.0));

        LOG.info("Finalizando test numero pasajeros");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");
        
        Bus bus = new Bus("BUS001", "Mercedes-Benz", "Sprinter", true, 6, 120.0, 3.0, Transmision.AUTOMATICA, Combustible.DIESEL, 5, 4, 6, true, true, true, 2, 2, 2000.0);
    
        assertEquals("BUS001",bus.getCodigo());
        assertEquals(120.0,bus.getVelocidadMaxima());

        LOG.info("Finalizando test datos iguales");
    } 
}
