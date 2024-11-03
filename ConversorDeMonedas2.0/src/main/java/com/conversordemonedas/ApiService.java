package com.conversordemonedas; // Asegúrate de usar minúsculas

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class ApiService {
    private static final String API_URL = "https://openexchangerates.org/api/latest.json?app_id=ca53fc2e9c99496094d6ead7eb50b08b";

    public JSONObject obtenerTasaCambio(String base, String destino) {
        String urlCompleta = API_URL + "?base=" + base + "&symbols=" + destino;

        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(urlCompleta);
            String resultado = EntityUtils.toString(client.execute(request).getEntity());
            return new JSONObject(resultado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

