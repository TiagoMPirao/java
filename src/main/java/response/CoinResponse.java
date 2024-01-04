package response;

public class CoinResponse extends Response {

    public float errorCode;
    public String errorMsg = null;
    public float httpStatusCode;


    public CoinApiResponsePayload USDBRL;

    public CoinResponse(int statusCode, String statusMsg) {
        super(statusCode, statusMsg);
    }
}


   /*
    public static void processResponse(String response) {


        System.out.println("Processing response: " + response);

        String exchangeRate = response.toString().split(":")[5].split(",")[0];
        String currency = response.toString().split(":")[2].split(",")[0];
        System.out.println("The last exchange rate for USD to BRL is: " + exchangeRate.replace("\n", "") + " " + currency);


    }
*/