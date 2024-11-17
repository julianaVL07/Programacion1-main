/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AdministradorTest {
    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());

    //Prueba datos vacíos
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos Vacios");

        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");

        assertThrows(Throwable.class,()-> new Administrador(" "," "," "," "," "," "," "));
        LOG.info("Finalizando test datos Vacios");
    }

   //Prueba verificando que el correo contenga el @
    @Test
    public void contenerArrobaEnCorreo() {
        
        LOG.info("Iniciado test de contener Arroba En Correo");

        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");

        assertThrows(Throwable.class,()-> new Administrador("Juan", "Pérez", "1234567890", "juan.perezmail.com", "juan123", "contraseña1", "respuesta1"));

        LOG.info("Finalizando test de contener Arroba En Correo");
    } 



}
