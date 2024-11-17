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
public class CamionetaTest {
    private static final Logger LOG = Logger.getLogger(CamionetaTest.class.getName());

    //Prueba datos vacios
    @Test
    public void datosVacios() {

        LOG.info("Iniciado test datos Vacios");

        Camioneta camioneta= new Camioneta("CAM002", "Chevrolet", "Colorado", false, 6, 200.0, 2.8, Transmision.MANUAL, Combustible.DIESEL, 5, 4, 8, true, true, false, true, false, true, false, 1200.0, true);

        assertThrows(Throwable.class,()-> new Camioneta(" "," "," ",false, 6, 200.0, 2.8, Transmision.MANUAL, Combustible.DIESEL, 5, 4, 8, true, true, false, true, false, true, false, 1200.0, true));

        LOG.info("Finalizando test datos Vacios");
    }


    //Prueba numero Puertas
    @Test
    public void numeroPuertas() {
            
        LOG.info("Iniciado test numero de puertas");
        
        Camioneta camioneta= new Camioneta("CAM002", "Chevrolet", "Colorado", false, 6, 200.0, 2.8, Transmision.MANUAL, Combustible.DIESEL, 5, 4, 8, true, true, false, true, false, true, false, 1200.0, true);

        assertThrows(Throwable.class,()-> new Camioneta("CAM002", "Chevrolet", "Colorado",false, 6, 200.0, 2.8, Transmision.MANUAL, Combustible.DIESEL, 5, 3, 8, true, true, false, true, false, true, false, 1200.0, true));
        
        LOG.info("Finalizando test numero de puertas");
    }
}
