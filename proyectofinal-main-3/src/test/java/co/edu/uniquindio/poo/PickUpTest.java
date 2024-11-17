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
public class PickUpTest {
    private static final Logger LOG = Logger.getLogger(PickUpTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Prueba velocidad máxima
    @Test
    public void velocidadMaxima() {
        
        LOG.info("Iniciado test velocidad máxima");

        PickUp pickUp = new PickUp("PU002", "Toyota", "Hilux", false, 5, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.GASOLINA,
        5, 4, 4, true, true, false, false, 1200.0);

        assertThrows(Throwable.class,()-> new PickUp("PU002", "Toyota", "Hilux", false, 5, 250.0, 2.8, Transmision.AUTOMATICA, Combustible.GASOLINA,5, 4, 4, true, true, false, false, 1200.0));

        LOG.info("Finalizando test velocidad máxima");
    }
    
     //Prueba datos iguales
    @Test
    public void datosIguales() {
     
     LOG.info("Iniciado test datos iguales");

     PickUp pickUp = new PickUp("PU002", "Toyota", "Hilux", false, 5, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.GASOLINA,5, 4, 4, true, true, false, false, 1200.0);

     assertEquals(1200.0, pickUp.getCapacidadCarga());

     LOG.info("Finalizando test datos iguales");
 }
}
