package org.apache.beam.examples;

public class Aire {
    private final String nombreEstacion;
    private final String fechaDatos;
    private final String temperaturaMinima;
    private final String horaTemperaturaMinima;
    private final String temperaturaMaxima;
    private final String horaTemperaturaMaxima;

    public Aire(String nombreEstacion, String fechaDatos, String temperaturaMinima, String horaTemperaturaMinima,
                String temperaturaMaxima, String horaTemperaturaMaxima) {
        this.nombreEstacion = nombreEstacion;
        this.fechaDatos = fechaDatos;
        this.temperaturaMinima = temperaturaMinima;
        this.horaTemperaturaMinima = horaTemperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.horaTemperaturaMaxima = horaTemperaturaMaxima;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public String getFechaDatos() {
        return fechaDatos;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public String getHoraTemperaturaMinima() {
        return horaTemperaturaMinima;
    }

    public String getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public String getHoraTemperaturaMaxima() {
        return horaTemperaturaMaxima;
    }
}
