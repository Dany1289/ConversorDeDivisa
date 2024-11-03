package com.conversordemonedas;

import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversorMonedas { // Asegúrate de que el nombre sea correcto

    // Listado de divisas disponibles
    private static final Map<Integer, String> DIVISAS = new HashMap<>();

    static {
        DIVISAS.put(1, "USD"); // Dólar estadounidense
        DIVISAS.put(2, "EUR"); // Euro
        DIVISAS.put(3, "GBP"); // Libra esterlina
        DIVISAS.put(4, "JPY"); // Yen japonés
        DIVISAS.put(5, "AUD"); // Dólar australiano
        DIVISAS.put(6, "CAD"); // Dólar canadiense
        // Agrega más divisas según sea necesario
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar listado de divisas
        System.out.println("Divisas disponibles para convertir:");
        for (Map.Entry<Integer, String> entry : DIVISAS.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }

        // Seleccionar moneda base
        System.out.println("Selecciona la moneda base (ingresa el número): ");
        int baseIndex = scanner.nextInt();
        String base = DIVISAS.get(baseIndex);

        // Seleccionar moneda de destino
        System.out.println("Selecciona la moneda de destino (ingresa el número): ");
        int destinoIndex = scanner.nextInt();
        String destino = DIVISAS.get(destinoIndex);

        System.out.println("Introduce la cantidad a convertir: ");
        double cantidad = scanner.nextDouble();

        ApiService apiService = new ApiService();
        JSONObject respuestaApi = apiService.obtenerTasaCambio(base, destino);
        if (respuestaApi != null) {
            double tasaCambio = respuestaApi.getJSONObject("rates").getDouble(destino);
            double resultado = cantidad * tasaCambio;
            System.out.println("Resultado: " + resultado + " " + destino);
        } else {
            System.out.println("No se pudo obtener la tasa de cambio.");
        }
    }
}

