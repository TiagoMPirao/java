package coinApi;

import Handlers.CoinHandler;
import response.CoinResponse;

// MainApplication.java
public class CoinAction {
    public static void main(String[] args) {
        try {
            String initialUrl = "https://economia.awesomeapi.com.br/json/last/USD-BRL";


            CoinResponse response = CoinHandler.sendGetRequest(initialUrl);

            Double high = 0.00;
            Double low = 0.00;
            String name = "";

        if (response.USDBRL != null){
            high = response.USDBRL.high;
            low = response.USDBRL.low;
            name = response.USDBRL.name;

            System.out.println("The current currency " +name +" high value is " +(Math.round(high * 100.0) / 100) + " and the lowest value for today is " +(Math.round(low * 100.0) / 100));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
