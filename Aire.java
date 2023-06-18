package com.mycompany.mavenproject1;

public class Aire {
    private String nombreEstacion;
    private String fechaDatos;
    private String temperaturaMinima;
    private String horaTemperaturaMinima;
    private String temperaturaMaxima;
    private String horaTemperaturaMaxima;

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
