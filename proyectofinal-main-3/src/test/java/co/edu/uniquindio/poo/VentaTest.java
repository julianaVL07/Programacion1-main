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
public class VentaTest {
    private static final Logger LOG = Logger.getLogger(VentaTest.class.getName());

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");

        Cliente cliente5 = new Cliente("Luis", "Pérez", "3344556677", "luis.perez@mail.com", "0977665544", 40);
        PickUp pickUp1 = new PickUp("PU001", "Ford", "Ranger", true, 6, 190.0, 2.3, Transmision.MANUAL, Combustible.DIESEL,
        5, 4, 6, true, true, true, true, 1000.0);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);
        Venta venta = new Venta(cliente5, pickUp1, empleado1, "2024-11-17", 35000);

        assertEquals("2024-11-17",venta.getFecha());
        LOG.info("Finalizando test datos iguales");
    }

    //Prueba datos enteros
    @Test
    public void datosEnteros() {
            
        LOG.info("Iniciado test datos Enteros");
        
        Cliente cliente5 = new Cliente("Luis", "Pérez", "3344556677", "luis.perez@mail.com", "0977665544", 40);
        PickUp pickUp1 = new PickUp("PU001", "Ford", "Ranger", true, 6, 190.0, 2.3, Transmision.MANUAL, Combustible.DIESEL,
        5, 4, 6, true, true, true, true, 1000.0);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);
        Venta venta = new Venta(cliente5, pickUp1, empleado1, "2024-11-17", 35000);
        assertEquals(35000, venta.getPrecioVenta());

        LOG.info("Finalizando test datos Enteros");
    }
}
