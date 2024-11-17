/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());

    //Prueba datos vacíos
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos Vacios");

        Administrador administrador = new Administrador("María", "Gómez", "0987654321", "maria.gomez@mail.com", "maria456", "contraseña2", "respuesta2");

        Empleado empleado = new Empleado ("Juan", "Hernandez", "123", "juan@gmail.com", "JuanUser", "Juan123", "preguntaSeguridad", administrador);

        assertThrows(Throwable.class,()-> new Empleado(" "," "," "," "," "," "," ",administrador));
        LOG.info("Finalizando test datos Vacios");
    }

   //Prueba verificar datos iguales
    @Test
    public void datosIguales() {
        
        LOG.info("Iniciado test datos iguales");
        
        Administrador administrador = new Administrador("María", "Gómez", "0987654321", "maria.gomez@mail.com", "maria456", "contraseña2", "respuesta2");

        Empleado empleado = new Empleado ("Juan", "Hernandez", "123", "juan@gmail.com", "JuanUser", "Juan123", "preguntaSeguridad", administrador);

        assertEquals("JuanUser", empleado.getUsuario());
        assertEquals("Juan123", empleado.getContraseña());

        LOG.info("Finalizando test datos iguales");
    } 

    //Prueba de condición verdadera

    @Test
    public void agregarVehiculo() {
        
        LOG.info("Iniciado test agregarVehiculo");
        
        Administrador administrador = new Administrador("María", "Gómez", "0987654321", "maria.gomez@mail.com", "maria456", "contraseña2", "respuesta2");

        Empleado empleado = new Empleado ("Juan", "Hernandez", "123", "juan@gmail.com", "JuanUser", "Juan123", "preguntaSeguridad", administrador);

        Deportivo deportivo1 = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);
        Deportivo deportivo2 = new Deportivo("DEP002", "Porsche", "911 Turbo", false, 6, 320.0, 3.8, Transmision.MANUAL, Combustible.GASOLINA, 2, 2, 6, 640, 3.2);

        empleado.agregarVehiculo(deportivo1);
        empleado.agregarVehiculo(deportivo2);

        assertTrue(empleado.getVehiculos().contains(deportivo1));
        assertTrue(empleado.getVehiculos().contains(deportivo2));

        assertEquals(2, empleado.getVehiculos().size());

        LOG.info("Finalizando test agregarVehiculo");
    } 




}

       
       
       
       
       
       
       
       
       
       
       
       
       
       
      
   