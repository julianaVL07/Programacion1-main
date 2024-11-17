/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EmpresaTest {
    private static final Logger LOG = Logger.getLogger(EmpresaTest.class.getName());

    //Prueba datos iguales
     @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");
        
        Empresa empresa = new Empresa("Transportes automóviles SJLL");

        assertEquals("Transportes automóviles SJLL",empresa.getNombre());

        LOG.info("Finalizando test datos iguales");
    } 

    //Prueba de condición verdadera

    @Test
    public void agregarPersona() {
        
        LOG.info("Iniciado test agregarPersona");

        Empresa empresa = new Empresa("Transportes automóviles SJLL");
        
        Administrador administrador = new Administrador("María", "Gómez", "0987654321", "maria.gomez@mail.com", "maria456", "contraseña2", "respuesta2");
        Empleado empleado = new Empleado ("Juan", "Hernandez", "123", "juan@gmail.com", "JuanUser", "Juan123", "preguntaSeguridad", administrador);

        empresa.agregarPersona(administrador);
        empresa.agregarPersona(empleado);

        assertTrue(empresa.getPersonas().contains(administrador));
        assertTrue(empresa.getPersonas().contains(empleado));

        assertEquals(2, empresa.getPersonas().size());

        LOG.info("Finalizando test agregarPersona");
    } 
}
