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
public class ClienteTest {
    private static final Logger LOG = Logger.getLogger(ClienteTest.class.getName());

    //Prueba edad no negativa
    @Test
    public void Edad() {

        LOG.info("Iniciado test edad no negativa");

        Cliente cliente = new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", 25);
     
        assertThrows(Throwable.class,()-> new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", -25));
        LOG.info("Finalizando test edad no negativa");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");
        
        Cliente cliente = new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", 25);
       
        assertEquals("0987654321",cliente.getTelefono());

        LOG.info("Finalizando test datos iguales");
    } 
}
