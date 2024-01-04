package response;
public class Response {
    private int statusCode;
    private String statusMsg;

    public Response(int statusCode, String statusMsg){
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
