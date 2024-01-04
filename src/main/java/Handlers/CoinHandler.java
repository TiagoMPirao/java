package Handlers;

import com.google.gson.Gson;
import response.CoinResponse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CoinHandler {
    public static CoinResponse sendGetRequest(String url) throws Exception {
        HttpURLConnection connection = null;

        try {
            URL requestUrl = new URL(url);
            connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                Gson gson = new Gson();
                return gson.fromJson(response.toString(), CoinResponse.class);
            } else {
                throw new RuntimeException("Failed to retrieve data. Response Code: " + responseCode);
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
