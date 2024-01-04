package coinApi;

import Handlers.CoinHandler;
import response.CoinResponse;

// MainApplication.java
public class CoinAction {
    public static void main(String[] args) {
        try {
            String initialUrl = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
           //TODO FIX THIS ISSUE
            CoinResponse response = CoinHandler.sendGetRequest(initialUrl);

            Double high = 0.00;
            Double low = 0.00;
            String name = "";

        if (response.UsdBrl != null){
            high = response.UsdBrl.high;
            low = response.UsdBrl.low;
            name = response.UsdBrl.name;

            System.out.println("The current" +name +" value high is" +high + "and the low value is" +low);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
