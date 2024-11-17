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
public class CompraTest {
    private static final Logger LOG = Logger.getLogger(CompraTest.class.getName());

    //Prueba datos vacíos
    @Test
    public void datosVacios() {
        
        LOG.info("Iniciado test datos Vacios");

        Cliente cliente3 = new Cliente("Carlos", "Martínez", "1122334455", "carlos.martinez@mail.com", "0988765432", 28);
        Camion camion1 = new Camion("CAM001", "Mercedes-Benz", "Actros", true, 12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);

        Compra compra = new Compra(cliente3, camion1, empleado1, "2024-11-17", 25000);
    
        assertThrows(Throwable.class,()-> new Compra(cliente3, camion1, empleado1, " ", 25000));
        LOG.info("Finalizando test datos Vacios");
    }

    //Prueba datos no negativo
    @Test
    public void datoPositivo() {
            
        LOG.info("Iniciado test datos no negativos");

        Cliente cliente3 = new Cliente("Carlos", "Martínez", "1122334455", "carlos.martinez@mail.com", "0988765432", 28);
        Camion camion1 = new Camion("CAM001", "Mercedes-Benz", "Actros", true, 12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO);
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);
        
        Compra compra = new Compra(cliente3, camion1, empleado1, "2024-11-17", 25000);
        assertThrows(Throwable.class,()-> new Compra(cliente3, camion1, empleado1, "2024-11-17", -25000));

        LOG.info("Finalizando test datos no negativos");
    }
}
