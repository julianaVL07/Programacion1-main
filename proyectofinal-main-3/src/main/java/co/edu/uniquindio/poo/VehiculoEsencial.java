package co.edu.uniquindio.poo;

public class VehiculoEsencial extends VehiculoNumero{
    public boolean aireAcondicionado;
    public boolean abs;
    public boolean camaraReversa;

    public VehiculoEsencial(String codigo, String marca, String modelo, boolean nuevo, int cambios,
            double velocidadMaxima, double cilindraje, Transmision transmision, Combustible combustible,
            int numeroPasajeros, int numeroPuertas, int numeroBolsasAire, boolean aireAcondicionado, boolean abs,
            boolean camaraReversa) {
        super(codigo, marca, modelo, nuevo, cambios, velocidadMaxima, cilindraje, transmision, combustible,
                numeroPasajeros, numeroPuertas, numeroBolsasAire);
        this.aireAcondicionado = aireAcondicionado;
        this.abs = abs;
        this.camaraReversa = camaraReversa;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    @Override
    public String toString() {
        return "VehiculoEsencial:"+super.toString()+", aireAcondicionado=" + aireAcondicionado + ", abs=" + abs + ", camaraReversa=" +camaraReversa;
    }

    
}
