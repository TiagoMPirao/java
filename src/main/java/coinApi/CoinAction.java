package coinApi;

import Handlers.CoinHandler;
import response.CoinResponse;

// MainApplication.java
public class CoinAction {
    public static void main(String[] args) {
        try {
            String initialUrl = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
            String response = CoinHandler.sendGetRequest(initialUrl);

            CoinResponse.processResponse(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
