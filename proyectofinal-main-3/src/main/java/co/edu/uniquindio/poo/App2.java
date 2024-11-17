package co.edu.uniquindio.poo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;


public class App2 {
    private static List<Empleado> empleados = new ArrayList<>();
    private static List<Administrador> administradores = new ArrayList<>();
    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Transaccion> transacciones = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();
        boolean salir = false;

        while (!salir) {
            String[] opciones = {"Login como Empleado", "Login como Administrador", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Bienvenido a Tu Carro UQ ===", 
                "Menú Principal", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    loginEmpleado();
                    break;
                case 1:
                    loginAdministrador();
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar Tu Carro UQ.");
    }

    private static void inicializarDatos() {
        // Datos iniciales de ejemplo
        Administrador administrador1 = new Administrador("Juan", "Pérez", "1234567890", "juan.perez@mail.com",
                "juan123", "1234", "respuesta1");

        administradores.add(administrador1);

        empleados.add(new Empleado("Luis", "Martínez", "1112223334", "luis.martinez@mail.com", 
                "luis001", "456", "respuestaA", administrador1));

        vehiculos.add(new Moto("MOTO001", "Yamaha", "MT-07", true, 6, 200.0, 689.0, Transmision.MANUAL,
                Combustible.GASOLINA));
        vehiculos.add(new Moto("MOTO002", "Kawasaki", "Ninja 400", false, 6, 190.0, 399.0, Transmision.MANUAL,
                Combustible.GASOLINA));
    }

    private static void loginEmpleado() {
        String username = JOptionPane.showInputDialog("Ingrese su username:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(username) && empleado.getContraseña().equals(password)) {
                JOptionPane.showMessageDialog(null, "Login exitoso como Empleado");
                menuEmpleado(empleado);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static void loginAdministrador() {
        String username = JOptionPane.showInputDialog("Ingrese su username:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        for (Administrador admin : administradores) {
            if (admin.getUsuario().equals(username) && admin.getContraseña().equals(password)) {
                JOptionPane.showMessageDialog(null, "Login exitoso como Administrador");
                menuAdministrador(admin);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }

     private static void verVehiculos() {
        StringBuilder sb = new StringBuilder("Vehículos Disponibles:\n");
        for (Vehiculo vehiculo : vehiculos) {
            sb.append(vehiculo.toString());
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Vehículos Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }


    private static void menuEmpleado(Empleado empleado) {
        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Ver vehículos disponibles","Agregar nuevo vehículo", "Registrar transacción", "Cerrar sesión"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Menú de Empleado ===", 
                "Opciones de Empleado", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    verVehiculos();
                    break;
                case 1:
                    agregarVehiculo();
                    break;
                case 2:
                    registrarTransaccion(empleado);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void menuAdministrador(Administrador admin) {
        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Agregar empleado", 
                                 "Gestionar empleados", 
                                 "Ver reportes de empleados", 
                                 "Cerrar sesión"};
            int opcion = JOptionPane.showOptionDialog(null, 
                "=== Menú de Administrador ===", 
                "Opciones de Administrador", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

            switch (opcion) {
                case 0:
                    agregarEmpleado(admin);
                    break;
                case 1:
                    gestionarEmpleados();
                    break;
                case 2:
                    verReportesEmpleado();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void agregarEmpleado(Administrador admin) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado:");
        String email = JOptionPane.showInputDialog("Ingrese el correo electrónico del empleado:");
        String username = JOptionPane.showInputDialog("Ingrese el username del empleado:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña del empleado:");

        Empleado nuevoEmpleado = new Empleado(nombre, apellido, telefono, email, username, password, "", admin);
        empleados.add(nuevoEmpleado);
        JOptionPane.showMessageDialog(null, "Empleado agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }


    private static void gestionarEmpleados() {
        String[] empleadosLista = empleados.stream().map(empleado -> empleado.getNombres() + " " + empleado.getApellidos()).toArray(String[]::new);
        String empleadoSeleccionado = (String) JOptionPane.showInputDialog(null, 
            "Seleccione el empleado a gestionar", 
            "Gestionar Empleado", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            empleadosLista, 
            empleadosLista[0]);

        if (empleadoSeleccionado != null) {
            Empleado empleado = empleados.stream()
                .filter(emp -> (emp.getNombres() + " " + emp.getApellidos()).equals(empleadoSeleccionado))
                .findFirst()
                .orElse(null);

            if (empleado != null) {
                String[] opcionesGestion = {"Bloquear cuenta", "Volver"};
                int opcion = JOptionPane.showOptionDialog(null, 
                    "Opciones para el empleado: " + empleadoSeleccionado, 
                    "Gestionar Empleado", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, 
                    null, 
                    opcionesGestion, 
                    opcionesGestion[0]);

                if (opcion == 0) {
                    empleado.bloquearCuenta();
                    JOptionPane.showMessageDialog(null, "Cuenta bloqueada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    
    private static void verReportesEmpleado() {
    String[] empleadosLista = empleados.stream().map(empleado -> empleado.getNombres() + " " + empleado.getApellidos()).toArray(String[]::new);
    String empleadoSeleccionado = (String) JOptionPane.showInputDialog(null, 
        "Seleccione el empleado para ver el reporte", 
        "Ver Reporte de Empleado", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        empleadosLista, 
        empleadosLista[0]);

    if (empleadoSeleccionado != null) {
        Empleado empleado = empleados.stream()
            .filter(emp -> (emp.getNombres() + " " + emp.getApellidos()).equals(empleadoSeleccionado))
            .findFirst()
            .orElse(null);

        if (empleado != null) {
            // Solicitar fechas de inicio y fin
            String fechaInicioStr = JOptionPane.showInputDialog("Ingrese la fecha de inicio (YYYY-MM-DD):");
            String fechaFinStr = JOptionPane.showInputDialog("Ingrese la fecha de fin (YYYY-MM-DD):");

            // Filtrar las transacciones del empleado dentro del rango de fechas
            List<Transaccion> transaccionesEmpleado = transacciones.stream()
                .filter(transaccion -> transaccion.getEmpleado().equals(empleado) && 
                                       transaccion.getFecha().compareTo(fechaInicioStr) >= 0 && 
                                       transaccion.getFecha().compareTo(fechaFinStr) <= 0)
                .collect(Collectors.toList());

            // Mostrar las transacciones encontradas
            if (!transaccionesEmpleado.isEmpty()) {
                StringBuilder reporte = new StringBuilder("Reporte de transacciones de " + empleadoSeleccionado + ":\n");
                for (Transaccion transaccion : transaccionesEmpleado) {
                    reporte.append(transaccion.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(null, reporte.toString(), "Reporte de Transacciones", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron transacciones para este empleado en el rango de fechas.", "No se encontraron transacciones", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}


    private static void registrarTransaccion(Empleado empleado) {
        JOptionPane.showMessageDialog(null, "=== Registro de Transacción ===");
        String[] opcionesTransaccion = {"Venta", "Compra", "Alquiler"};
        int tipo = JOptionPane.showOptionDialog(null, "Seleccione el tipo de transacción:", "Tipo de Transacción",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesTransaccion, opcionesTransaccion[0]) + 1;

    // Seleccionar cliente
        JOptionPane.showMessageDialog(null, "=== Selección de Cliente ===");
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String apellidoCliente = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String correoCliente = JOptionPane.showInputDialog("Ingrese el correo del cliente:");
        String telefonoCliente = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        String edadClienteStr = JOptionPane.showInputDialog("Ingrese la edad del cliente:");
        int edadCliente = Integer.parseInt(edadClienteStr);

        Cliente cliente = new Cliente(nombreCliente, apellidoCliente, cedulaCliente, correoCliente, telefonoCliente, edadCliente);
        clientes.add(cliente);


        // Seleccionar vehículo
        JOptionPane.showMessageDialog(null, "=== Selección de Vehículo ===");
        StringBuilder listaVehiculos = new StringBuilder();
        for (int i = 0; i < vehiculos.size(); i++) {
            listaVehiculos.append((i + 1)).append(". ").append(vehiculos.get(i).toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaVehiculos.toString(), "Lista de Vehículos", JOptionPane.INFORMATION_MESSAGE);
        String indiceVehiculoStr = JOptionPane.showInputDialog("Seleccione un vehículo (número):");
        int indiceVehiculo = Integer.parseInt(indiceVehiculoStr) - 1;
        Vehiculo vehiculoSeleccionado = vehiculos.get(indiceVehiculo);

        // Registro de la transacción
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la transacción (dd/MM/yyyy):");

        Transaccion transaccion = null;
        switch (tipo) {
            case 1:
                String precioVentaStr = JOptionPane.showInputDialog("Ingrese el precio de venta : ");
                double precioVenta = Double.parseDouble(precioVentaStr);
                transaccion = new Venta(cliente, vehiculoSeleccionado, empleado, fecha,precioVenta);
                break;
            case 2:
                String precioCompraStr = JOptionPane.showInputDialog("Ingrese el precio de compra : ");
                double precioCompra = Double.parseDouble(precioCompraStr);
                transaccion = new Compra(cliente, vehiculoSeleccionado, empleado, fecha,precioCompra);
                break;
            case 3:
                //public Alquiler( Cliente cliente,Vehiculo vehiculo, Empleado empleado, String fecha, int diasAlquiler, double precioAlquiler) {
                String diasAlquilerStr = JOptionPane.showInputDialog("Ingrese los dias de alquler : ");
                int diasAlquiler = Integer.parseInt(diasAlquilerStr);
                String precioDiasAlquilerStr = JOptionPane.showInputDialog("Ingrese el precio por dia de alquiler: ");
                double precioDiasAlquiler = Double.parseDouble(precioDiasAlquilerStr);
                transaccion = new Alquiler(cliente, vehiculoSeleccionado, empleado, fecha, diasAlquiler,precioDiasAlquiler);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de transacción no válido", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
        }

        transacciones.add(transaccion);
        JOptionPane.showMessageDialog(null, "Transacción registrada con éxito", "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(transaccion.toString());
    }

    private static void agregarVehiculo() {
        String[] opciones = {"Moto", "Sedán", "Deportivo", "Camioneta", "Pick-up", "Eléctrico", "Híbrido", "Van", "Camión", "Bus"};
        int tipoVehiculo = JOptionPane.showOptionDialog(null, 
            "Seleccione el tipo de vehículo:", 
            "Tipo de Vehículo", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opciones, 
            opciones[0]);

        String codigo = JOptionPane.showInputDialog("Ingrese el código del vehículo:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        String esNuevoStr = JOptionPane.showInputDialog("¿El vehículo es nuevo? (true/false):");
        boolean esNuevo = Boolean.parseBoolean(esNuevoStr);
        String cambiosStr = JOptionPane.showInputDialog("Ingrese la cantidad de cambios:");
        int cambios = Integer.parseInt(cambiosStr);
        String velocidadMaxStr = JOptionPane.showInputDialog("Ingrese la velocidad máxima (km/h):");
        double velocidadMax = Double.parseDouble(velocidadMaxStr);
        String cilindrajeStr = JOptionPane.showInputDialog("Ingrese el cilindraje:");
        double cilindraje = Double.parseDouble(cilindrajeStr);

        String transmisionInput = JOptionPane.showInputDialog("¿El vehículo tiene transmisión automática? (AUTOMATICA/MANUAL):");
        Transmision transmision = null;
        try {
            transmision = Transmision.valueOf(transmisionInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para transmisión. Se asignará el valor por defecto: MANUAL.");
            transmision = Transmision.MANUAL; // Valor por defecto
        }

        String combustibleInput = JOptionPane.showInputDialog("¿El vehículo qué tipo de combustible tiene? (GASOLINA/DIESEL/ELECTRICO/HIBRIDO):");
        Combustible combustible = null;
        try {
            combustible = Combustible.valueOf(combustibleInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para combustible. Se asignará el valor por defecto: GASOLINA.");
            combustible = Combustible.GASOLINA; // Valor por defecto
        }

        Vehiculo nuevoVehiculo = null;
        switch (tipoVehiculo) {
            case 0:  // Moto
                nuevoVehiculo = new Moto(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible);
                break;
            case 1:  // Sedán
                String pasajerosStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajeros = Integer.parseInt(pasajerosStr);
                String puertasStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertas = Integer.parseInt(puertasStr);
                String bolsasStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAire = Integer.parseInt(bolsasStr);
                String aireAcondicionadoStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false):");
                boolean aireAcondicionado = Boolean.parseBoolean(aireAcondicionadoStr);
                String absStr = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false):");
                boolean abs = Boolean.parseBoolean(absStr);
                String camaraReversaStr = JOptionPane.showInputDialog("¿El vehículo tiene cámara reversa? (true/false):");
                boolean camaraReversa = Boolean.parseBoolean(camaraReversaStr);
                String sensorColisionStr = JOptionPane.showInputDialog("¿El vehículo tiene sensor de colisión? (true/false):");
                boolean sensorColision = Boolean.parseBoolean(sensorColisionStr);
                String sensorTraficoStr = JOptionPane.showInputDialog("¿El vehículo tiene sensor de tráfico? (true/false):");
                boolean sensorTrafico = Boolean.parseBoolean(sensorTraficoStr);
                String asistentePermanenciaCarrilStr = JOptionPane.showInputDialog("¿El vehículo tiene asistente de permanencia en carril? (true/false):");
                boolean asistentePermanenciaCarril = Boolean.parseBoolean(asistentePermanenciaCarrilStr);
                String velocidadCruceroStr = JOptionPane.showInputDialog("¿El vehículo tiene velocidad crucero? (true/false):");
                boolean velocidadCrucero = Boolean.parseBoolean(velocidadCruceroStr);
                String capacidadCargaStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):");
                double capacidadCarga = Double.parseDouble(capacidadCargaStr);

                nuevoVehiculo = new Sedan(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, numeroPasajeros, numeroPuertas, numeroBolsasAire, aireAcondicionado, abs, camaraReversa, sensorColision, sensorTrafico, asistentePermanenciaCarril, velocidadCrucero, capacidadCarga);
                break;
            case 2:  // Deportivo
                String caballosStr = JOptionPane.showInputDialog("Ingrese el número de caballos de fuerza:");
                int caballosFuerza = Integer.parseInt(caballosStr);
                String tiempoCienStr = JOptionPane.showInputDialog("Ingrese el tiempo en segundos para alcanzar los 100 km/h:");
                double tiempoCien = Double.parseDouble(tiempoCienStr);
                String pasajerosDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajerosDeportivo = Integer.parseInt(pasajerosDeportivoStr);
                String puertasDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertasDeportivo = Integer.parseInt(puertasDeportivoStr);
                String bolsasAireDeportivoStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAireDeportivo = Integer.parseInt(bolsasAireDeportivoStr);

                nuevoVehiculo = new Deportivo(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, numeroPasajerosDeportivo, numeroPuertasDeportivo, numeroBolsasAireDeportivo, caballosFuerza, tiempoCien);
                break;
            case 3:  // Camioneta
                String numeroPasajerosStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros: ");
                int numeroPasajerosCamioneta = Integer.parseInt(numeroPasajerosStr);
                String numeroPuertasStr = JOptionPane.showInputDialog("Ingrese el número de puertas: ");
                int numeroPuertasCamioneta = Integer.parseInt(numeroPuertasStr);
                String numeroBolsasStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire: ");
                int numeroBolsasAireCamioneta = Integer.parseInt(numeroBolsasStr);
                String aireAcondicionadStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false): ");
                boolean aireAcondicionadoCamioneta = Boolean.parseBoolean(aireAcondicionadStr);
                String absStrg = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false): ");
                boolean absCamioneta = Boolean.parseBoolean(absStrg);
                String camaraReservaStr = JOptionPane.showInputDialog("¿El vehículo tiene cámara reversa? (true/false): ");
                boolean camaraReversaCamioneta = Boolean.parseBoolean(camaraReservaStr);
                String sensorColisionStrg = JOptionPane.showInputDialog("¿El vehículo tiene sensor de colisión? (true/false): ");
                boolean sensorColisionCamioneta = Boolean.parseBoolean(sensorColisionStrg);
                String sensorTraficoStrg = JOptionPane.showInputDialog("¿El vehículo tiene sensor de tráfico? (true/false): ");
                boolean sensorTraficoCamioneta = Boolean.parseBoolean(sensorTraficoStrg);
                String asistenciaPermanenciaCarrilStr = JOptionPane.showInputDialog("¿El vehículo tiene asistente de permanencia en carril? (true/false): ");
                boolean asistentePermanenciaCarrilCamioneta = Boolean.parseBoolean(asistenciaPermanenciaCarrilStr);
                String VvelocidadCruceroStr = JOptionPane.showInputDialog("¿El vehículo tiene velocidad crucero? (true/false): ");
                boolean velocidadCruceroCamioneta = Boolean.parseBoolean(VvelocidadCruceroStr);
                String CapacidadCargaStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga: ");
                double capacidadCargaCamioneta = Double.parseDouble(CapacidadCargaStr);
                String cuatroxCuatroStr = JOptionPane.showInputDialog("¿La camioneta es 4x4? (true/false): ");
                boolean cuatroxcuatro = Boolean.parseBoolean(cuatroxCuatroStr);

                nuevoVehiculo = new Camioneta(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje,
                        transmision, combustible,
                        numeroPasajerosCamioneta, numeroPuertasCamioneta, numeroBolsasAireCamioneta,
                        aireAcondicionadoCamioneta, absCamioneta, camaraReversaCamioneta,
                        sensorColisionCamioneta, sensorTraficoCamioneta, asistentePermanenciaCarrilCamioneta,
                        velocidadCruceroCamioneta, capacidadCargaCamioneta, cuatroxcuatro);
                break;
            //Pick up
            case 4:
                String numeroPasajerosPickUpStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajerosPickUp = Integer.parseInt(numeroPasajerosPickUpStr);
                String numeroPuertasPickUpStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertasPickUp= Integer.parseInt(numeroPuertasPickUpStr);
                String numeroBolsasPickUpStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAirePickUp = Integer.parseInt(numeroBolsasPickUpStr);
                String aireAcondicionadoPickUpStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false):");
                boolean aireAcondicionadoPickUp = Boolean.parseBoolean(aireAcondicionadoPickUpStr);
                String absPickUpStr = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false):");
                boolean absPickUp = Boolean.parseBoolean(absPickUpStr);
                String camaraReversaPickUpStr = JOptionPane.showInputDialog("¿El vehículo tiene cámara reversa? (true/false):");
                boolean camaraReversaPickUp = Boolean.parseBoolean(camaraReversaPickUpStr);
                String cuatroxCuatroPickUpStr = JOptionPane.showInputDialog("¿La camioneta es 4x4? (true/false):");
                boolean cuatroxcuatroPickUp = Boolean.parseBoolean(cuatroxCuatroPickUpStr);
                String capacidadCargaPickUpStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):");
                double capacidadCargaPickUp = Double.parseDouble(capacidadCargaPickUpStr);
                
                nuevoVehiculo = new PickUp(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje,
                transmision, combustible, numeroPasajerosPickUp,numeroPuertasPickUp , numeroBolsasAirePickUp,
                aireAcondicionadoPickUp, absPickUp, camaraReversaPickUp, cuatroxcuatroPickUp, capacidadCargaPickUp);
            break;
            case 5:  // Eléctrico
                String autonomiaStr = JOptionPane.showInputDialog("Ingrese la autonomía (en km):");
                double autonomia = Double.parseDouble(autonomiaStr);
                String tiempoCargaStr = JOptionPane.showInputDialog("Ingrese el tiempo de carga (en horas):");
                double tiempoCarga = Double.parseDouble(tiempoCargaStr);
                nuevoVehiculo = new Electrico(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, autonomia, tiempoCarga);
                break;
            case 6:  // Híbrido
                String enchufableStr = JOptionPane.showInputDialog("¿El vehículo es enchufable? (true/false):");
                boolean enchufable = Boolean.parseBoolean(enchufableStr);
                String ligeroStr = JOptionPane.showInputDialog("¿El vehículo es ligero? (true/false):");
                boolean ligero = Boolean.parseBoolean(ligeroStr);

                nuevoVehiculo = new Hibrido(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible, enchufable, ligero);
                break;

            case 7: //Van
                String numeroPasajerosVanStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajerosVan = Integer.parseInt(numeroPasajerosVanStr);

                String numeroPuertasVanStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertasVan = Integer.parseInt(numeroPuertasVanStr);

                String numeroBolsasAireVanStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAireVan = Integer.parseInt(numeroBolsasAireVanStr);

                String aireAcondicionadoVanStr = JOptionPane.showInputDialog("¿Tiene aire acondicionado? (true/false):");
                boolean aireAcondicionadoVan = Boolean.parseBoolean(aireAcondicionadoVanStr);

                String absVanStr = JOptionPane.showInputDialog("¿Tiene sistema ABS? (true/false):");
                boolean absVan = Boolean.parseBoolean(absVanStr);

                String camaraReversaVanStr = JOptionPane.showInputDialog("¿Tiene cámara reversa? (true/false):");
                boolean camaraReversaVan = Boolean.parseBoolean(camaraReversaVanStr);

                String capacidadMaleteroStr = JOptionPane.showInputDialog("Ingrese la capacidad del maletero (en litros):");
                double capacidadMaletero = Double.parseDouble(capacidadMaleteroStr);

                nuevoVehiculo = new Van(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje,
                    transmision, combustible, numeroPasajerosVan, numeroPuertasVan,
                    numeroBolsasAireVan, aireAcondicionadoVan, absVan, camaraReversaVan, capacidadMaletero);
                
                break;
            case 8:
                String capacidadCargaCamionStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga:");
                double capacidadCargaCamion = Double.parseDouble(capacidadCargaCamionStr);

                String aireAcondicionadoCamionStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false):");
                boolean aireAcondicionadoCamion = Boolean.parseBoolean(aireAcondicionadoCamionStr);

                String frenosAireStr = JOptionPane.showInputDialog("¿El vehículo tiene frenos de aire? (true/false):");
                boolean frenosAire = Boolean.parseBoolean(frenosAireStr);

                String absCamionStr = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false):");
                boolean absCamion = Boolean.parseBoolean(absCamionStr);

                String numeroEjesCamionStr = JOptionPane.showInputDialog("Ingrese el número de ejes:");
                int numeroEjesCamion = Integer.parseInt(numeroEjesCamionStr);

                String tipoCamionStr = JOptionPane.showInputDialog("Ingrese el tipo de camión (liviano/pesado):");

                nuevoVehiculo = new Camion(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje,
                    transmision, combustible, capacidadCargaCamion, aireAcondicionadoCamion, frenosAire, absCamion, numeroEjesCamion,
                    TipoCamion.valueOf(tipoCamionStr.toUpperCase()));
                break;
            case 9:
                String numeroPasajerosBusStr = JOptionPane.showInputDialog("Ingrese el número de pasajeros:");
                int numeroPasajerosBus = Integer.parseInt(numeroPasajerosBusStr);

                String numeroPuertasBusStr = JOptionPane.showInputDialog("Ingrese el número de puertas:");
                int numeroPuertasBus = Integer.parseInt(numeroPuertasBusStr);

                String numeroBolsasAireBusStr = JOptionPane.showInputDialog("Ingrese el número de bolsas de aire:");
                int numeroBolsasAireBus = Integer.parseInt(numeroBolsasAireBusStr);

                String aireAcondicionadoBusStr = JOptionPane.showInputDialog("¿El vehículo tiene aire acondicionado? (true/false):");
                boolean aireAcondicionadoBus = Boolean.parseBoolean(aireAcondicionadoBusStr);

                String absBusStr = JOptionPane.showInputDialog("¿El vehículo tiene ABS? (true/false):");
                boolean absBus = Boolean.parseBoolean(absBusStr);

                String camaraReversaBusStr = JOptionPane.showInputDialog("¿El vehículo tiene cámara reversa? (true/false):");
                boolean camaraReversaBus = Boolean.parseBoolean(camaraReversaBusStr);

                String numeroEjesBusStr = JOptionPane.showInputDialog("Ingrese el número de ejes:");
                int numeroEjesBus = Integer.parseInt(numeroEjesBusStr);

                String numeroSalidasEmergenciaStr = JOptionPane.showInputDialog("Ingrese el número de salidas de emergencia:");
                int numeroSalidasEmergencia = Integer.parseInt(numeroSalidasEmergenciaStr);

                String capacidadMaleteroBusStr = JOptionPane.showInputDialog("Ingrese la capacidad del maletero:");
                double capacidadMaleteroBus = Double.parseDouble(capacidadMaleteroBusStr);

                nuevoVehiculo = new Bus(codigo, marca, modelo, esNuevo, cambios, velocidadMax, cilindraje, transmision, combustible,
                    numeroPasajerosBus, numeroPuertasBus, numeroBolsasAireBus, aireAcondicionadoBus, absBus,camaraReversaBus, numeroEjesBus,
                    numeroSalidasEmergencia, capacidadMaleteroBus);
                break;  
            default:
                JOptionPane.showMessageDialog(null, "Tipo de vehículo no válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        vehiculos.add(nuevoVehiculo);
        JOptionPane.showMessageDialog(null, "Vehículo agregado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(nuevoVehiculo.toString());
    
        }
        
}
 