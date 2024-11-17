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
public class MotoTest {
    private static final Logger LOG = Logger.getLogger(MotoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    //Prueba datos vacios
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos Vacios");

        Moto moto = new Moto( "MOTO001", "Yamaha", "MT-07", true, 6, 200.0, 689.0, Transmision.MANUAL, Combustible.GASOLINA);

        assertThrows(Throwable.class,()-> new Moto( " ", " ", " ", true, 6, 200.0, 689.0, Transmision.MANUAL, Combustible.GASOLINA));

        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");

        Moto moto = new Moto( "MOTO001", "Yamaha", "MT-07", true, 6, 200.0, 689.0, Transmision.MANUAL, Combustible.GASOLINA);

        assertEquals("Yamaha", moto.getMarca());
        assertEquals(Transmision.MANUAL, moto.getTransmision());

        LOG.info("Finalizando test datos iguales");
    }


}
