package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Transportes automóviles SJLL");

        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com", "juan123", "contraseña1", "respuesta1");
        Administrador administrador2 = new Administrador("María", "Gómez", "0987654321", "maria.gomez@mail.com", "maria456", "contraseña2", "respuesta2");

        Empleado empleado1 = new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", "luis001", "contraseñaA", "respuestaA", administrador1);
        Empleado empleado2 = new Empleado("Ana", "Hernández", "5556667778", "ana.hernandez@mail.com", "ana002", "contraseñaB", "respuestaB", administrador2);

        Cliente cliente1 = new Cliente("Sofía", "López", "1234567890", "sofia.lopez@mail.com", "0987654321", 25);
        Cliente cliente2 = new Cliente("Diego", "Ramírez", "0987654321", "diego.ramirez@mail.com", "0912345678", 30);
        Cliente cliente3 = new Cliente("Carlos", "Martínez", "1122334455", "carlos.martinez@mail.com", "0988765432", 28);
        Cliente cliente4 = new Cliente("Ana", "Gómez", "2233445566", "ana.gomez@mail.com", "0999887766", 35);
        Cliente cliente5 = new Cliente("Luis", "Pérez", "3344556677", "luis.perez@mail.com", "0977665544", 40);
        Cliente cliente6 = new Cliente("María", "Hernández", "4455667788", "maria.hernandez@mail.com", "0966554433", 32);

        Van van1 = new Van("VAN001", "Toyota", "Hiace", true, 6, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.DIESEL, 
        12, 4, 6, true, true, true, 3500.0);
        Van van2 = new Van("VAN002", "Mercedes-Benz", "Sprinter", false, 5, 160.0, 3.0, Transmision.MANUAL, Combustible.DIESEL, 
        15, 4, 8, true, true, false, 4000.0);

        Sedan sedan1 = new Sedan("SED001", "Toyota", "Corolla", true, 6, 200.0, 1.8, Transmision.AUTOMATICA, Combustible.GASOLINA,
        5, 4, 6, true, true, true, true, false, true, true, 450.0);
        Sedan sedan2 = new Sedan("SED002", "Honda", "Civic", false, 5, 180.0, 2.0, Transmision.MANUAL, Combustible.DIESEL,
        5, 4, 4, true, true, false, false, true, false, true, 420.0);

        PickUp pickUp1 = new PickUp("PU001", "Ford", "Ranger", true, 6, 190.0, 2.3, Transmision.MANUAL, Combustible.DIESEL,
        5, 4, 6, true, true, true, true, 1000.0);
        PickUp pickUp2 = new PickUp("PU002", "Toyota", "Hilux", false, 5, 180.0, 2.8, Transmision.AUTOMATICA, Combustible.GASOLINA,
        5, 4, 4, true, true, false, false, 1200.0);

        Moto moto1 = new Moto( "MOTO001", "Yamaha", "MT-07", true, 6, 200.0, 689.0, Transmision.MANUAL, Combustible.GASOLINA);
        Moto moto2 = new Moto("MOTO002", "Kawasaki", "Ninja 400", false, 6, 190.0, 399.0, Transmision.MANUAL, Combustible.GASOLINA);

        Hibrido hibrido1 = new Hibrido("HIB001", "Toyota", "Prius", true, 6, 180.0, 1.8, Transmision.AUTOMATICA, Combustible.HIBRIDO, true, true);
        Hibrido hibrido2 = new Hibrido("HIB002", "Ford", "Escape", false, 6, 200.0, 2.5, Transmision.AUTOMATICA, Combustible.HIBRIDO, true, false);

        Electrico electrico1 = new Electrico("ELE001", "Tesla", "Model 3", true, 1, 250.0, 0.0, Transmision.AUTOMATICA, Combustible.ELECTRICO, 500.0, 1.5);
        Electrico electrico2 = new Electrico("ELE002", "Nissan", "Leaf", false, 1, 150.0, 0.0, Transmision.AUTOMATICA, Combustible.ELECTRICO, 350.0, 2.0);

        Deportivo deportivo1 = new Deportivo("DEP001", "Ferrari", "488 GTB", true, 7, 330.0, 3.9, Transmision.AUTOMATICA, Combustible.GASOLINA, 2, 2, 6, 720, 3.0);
        Deportivo deportivo2 = new Deportivo("DEP002", "Porsche", "911 Turbo", false, 6, 320.0, 3.8, Transmision.MANUAL, Combustible.GASOLINA, 2, 2, 6, 640, 3.2);

        Camioneta camioneta1 = new Camioneta("CAM001", "Jeep", "Cherokee", true, 8, 220.0, 3.2, Transmision.AUTOMATICA, Combustible.GASOLINA,  5, 4, 6, true, true, true, true, true, true, true, 1500.0, true);
        Camioneta camioneta2 = new Camioneta("CAM002", "Chevrolet", "Colorado", false, 6, 200.0, 2.8, Transmision.MANUAL, Combustible.DIESEL, 5, 4, 8, true, true, false, true, false, true, false, 1200.0, true);

        Camion camion1 = new Camion("CAM001", "Mercedes-Benz", "Actros", true, 12, 180.0, 12.8, Transmision.MANUAL, Combustible.DIESEL, 30000.0, true, true, true, 3, TipoCamion.PEQUEÑO);
        Camion camion2 = new Camion("CAM002", "Volvo", "FH16", false, 14, 160.0, 16.0, Transmision.AUTOMATICA, Combustible.DIESEL, 
        35000.0, true, true, true, 4, TipoCamion.GRANDE);

        Bus bus1 = new Bus("BUS001", "Mercedes-Benz", "Sprinter", true, 6, 120.0, 3.0, Transmision.AUTOMATICA, Combustible.DIESEL, 
        30, 4, 6, true, true, true, 2, 2, 2000.0);

        Bus bus2 = new Bus("BUS002", "Volvo", "7900", false, 5, 100.0, 5.0, Transmision.AUTOMATICA, Combustible.GASOLINA, 
        50, 2, 8, true, true, false, 3, 4, 3000.0);

        Alquiler alquiler1 = new Alquiler(cliente1, deportivo1, empleado1, "2024-11-17", 7, 700);
        Alquiler alquiler2 = new Alquiler(cliente2, deportivo2, empleado2, "2024-11-18", 5, 500);

        Compra compra1 = new Compra(cliente3, camion1, empleado1, "2024-11-17", 25000);
        Compra compra2 = new Compra(cliente4, camion2, empleado2, "2024-11-18", 22000);

        Venta venta1 = new Venta(cliente5, pickUp1, empleado1, "2024-11-17", 35000);
        Venta venta2 = new Venta(cliente6, pickUp2, empleado2, "2024-11-18", 32000);

        empresa.agregarTransaccion(alquiler1);
        empresa.agregarTransaccion(alquiler2);

        empresa.agregarTransaccion(compra1);
        empresa.agregarTransaccion(compra2);

        empresa.agregarTransaccion(venta1);
        empresa.agregarTransaccion(venta2);

        empresa.agregarPersona(administrador1);
        empresa.agregarPersona(administrador2);

        empresa.agregarPersona(empleado1);
        empresa.agregarPersona(empleado2);

        empresa.agregarPersona(cliente1);
        empresa.agregarPersona(cliente2);
        empresa.agregarPersona(cliente3);
        empresa.agregarPersona(cliente4);
        empresa.agregarPersona(cliente5);
        empresa.agregarPersona(cliente6);

        empresa.agregarVehiculo(van1);
        empresa.agregarVehiculo(van2);
        
        empresa.agregarVehiculo(sedan1);
        empresa.agregarVehiculo(sedan2);

        empresa.agregarVehiculo(pickUp1);
        empresa.agregarVehiculo(pickUp2);
        
        empresa.agregarVehiculo(moto1);
        empresa.agregarVehiculo(moto2);

        empresa.agregarVehiculo(hibrido1);
        empresa.agregarVehiculo(hibrido2);
        
        empresa.agregarVehiculo(electrico1);
        empresa.agregarVehiculo(electrico2);

        empresa.agregarVehiculo(deportivo1);
        empresa.agregarVehiculo(deportivo2);

        empresa.agregarVehiculo(camioneta1);
        empresa.agregarVehiculo(camioneta2);

        empresa.agregarVehiculo(camion1);
        empresa.agregarVehiculo(camion2);
        
        empresa.agregarVehiculo(bus1);
        empresa.agregarVehiculo(bus2);

        empleado1.agregarCliente(cliente1);
        empleado1.agregarCliente(cliente3);
        empleado1.agregarCliente(cliente5);
        empleado1.agregarVehiculo(van1);
        empleado1.agregarVehiculo(sedan1);
        empleado1.agregarVehiculo(pickUp1);
        empleado1.agregarVehiculo(moto1);
        empleado1.agregarVehiculo(hibrido1);
        empleado1.agregarVehiculo(electrico1);
        empleado1.agregarVehiculo(deportivo1);
        empleado1.agregarVehiculo(camioneta1);
        empleado1.agregarVehiculo(camion1);
        empleado1.agregarVehiculo(bus1);

        empleado2.agregarCliente(cliente2);
        empleado1.agregarCliente(cliente4);
        empleado1.agregarCliente(cliente6);
        empleado2.agregarVehiculo(van2);
        empleado2.agregarVehiculo(sedan2);
        empleado2.agregarVehiculo(pickUp2);
        empleado2.agregarVehiculo(moto2);
        empleado2.agregarVehiculo(hibrido2);
        empleado2.agregarVehiculo(electrico2);
        empleado2.agregarVehiculo(deportivo2);
        empleado2.agregarVehiculo(camioneta2);
        empleado2.agregarVehiculo(camion2);
        empleado2.agregarVehiculo(bus2);

        administrador1.agregarEmpleado(empleado1);
        administrador2.agregarEmpleado(empleado2);

        Empresa.mostrarMensaje(empresa.toString());
        

    
        }
 }

