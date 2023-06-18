package org.apache.beam.examples;

import org.apache.beam.examples.Aire;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JsonUrlReader2 {

    public static void main(String[] args) throws IOException {
        String url = "https://climatologia.meteochile.gob.cl/application/productos/boletinClimatologicoDiario/?query=Chacalluta,%20Arica%20Ap.";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new URL(url));

        List<Aire> Aaire = new ArrayList<>();

        if (rootNode.isArray()) {
            for (JsonNode node : rootNode) {
                JsonNode metaDatosNode = node.get("metaDatos");
                JsonNode estacionNode = metaDatosNode.get("estacion");
                JsonNode nombreEstacionNode = estacionNode.get("nombreEstacion");
                JsonNode fechaDatosNode = metaDatosNode.get("fechaDatos");
                JsonNode datosNode = node.get("datos");
                JsonNode temperaturaMinimaNode = datosNode.get("temperaturaMinima");
                JsonNode horaTemperaturaMinimaNode = datosNode.get("horaTemperaturaMinima");
                JsonNode temperaturaMaximaNode = datosNode.get("temperaturaMaxima");
                JsonNode horaTemperaturaMaximaNode = datosNode.get("horaTemperaturaMaxima");

                if (nombreEstacionNode != null) {
                    String nombreEstacion = nombreEstacionNode.asText();
                    String fechaDatos = fechaDatosNode.asText();
                    String temperaturaMinima = temperaturaMinimaNode.asText();
                    String horaTemperaturaMinima = horaTemperaturaMinimaNode.asText();
                    String temperaturaMaxima = temperaturaMaximaNode.asText();
                    String horaTemperaturaMaxima = horaTemperaturaMaximaNode.asText();

                    Aire aire = new Aire(nombreEstacion, fechaDatos, temperaturaMinima, horaTemperaturaMinima, temperaturaMaxima, horaTemperaturaMaxima);
                    Aaire.add(aire);
                }
            }
        }

        // Utiliza Aaire para realizar las operaciones deseadas con los objetos guardados
        for (Aire aire : Aaire) {
            System.out.println("Nombre estacion: " + aire.getNombreEstacion());
            System.out.println("Fecha datos: " + aire.getFechaDatos());
            System.out.println("Temperatura mínima: " + aire.getTemperaturaMinima());
            System.out.println("Hora Temperatura mínima: " + aire.getHoraTemperaturaMinima());
            System.out.println("Temperatura máxima: " + aire.getTemperaturaMaxima());
            System.out.println("Hora Temperatura máxima: " + aire.getHoraTemperaturaMaxima());
            System.out.println();
            
            //int conteo = Aaire.size();

            //System.out.println("Conteo de objetos en el ArrayList Aaire: " + conteo);
        }
    }
}
