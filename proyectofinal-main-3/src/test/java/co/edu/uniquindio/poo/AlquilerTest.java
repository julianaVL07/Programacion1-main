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
public class AlquilerTest {
    private static final Logger LOG = Logger.getLogger(AlquilerTest.class.getName());

    //Prueba dias alquiler
    @Test
    public void diasAlquiler() {
        
        LOG.info("Iniciado test dias alquiler");

        Cliente cliente1 = new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", 25);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Deportivo deportivo1 = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);

        Alquiler alquiler1 = new Alquiler(cliente1, deportivo1, empleado1, "2024-11-17", 7, 700);

        assertThrows(Throwable.class,()-> new Alquiler(cliente1, deportivo1, empleado1, "2024-11-17", 0, 700));

        LOG.info("Finalizando test dias alquiler");
    }

    //Prueba datos iguales
    @Test
    public void datosIguales() {
            
        LOG.info("Iniciado test datos iguales");

        Cliente cliente1 = new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", 25);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Deportivo deportivo1 = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);

        Alquiler alquiler = new Alquiler(cliente1, deportivo1, empleado1, "2024-11-17", 7, 700);
        assertEquals(7, alquiler.getDiasAlquiler());

        LOG.info("Finalizando test datos iguales");
    }
}
