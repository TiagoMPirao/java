package coinApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyExchangeRate {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://economia.awesomeapi.com.br/last/USD-BRL";
            URL url = new URL(apiUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
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

                String exchangeRate = response.toString().split(":")[5].split(",")[0];
                System.out.println("The last exchange rate for USD to BRL is: " + exchangeRate);
            } else {
                System.out.println("Failed to retrieve data. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
