package exception.ex2;

public class NetworkServiceV2_2 {

    public void snedMessage(String data) throws NetworkClientExceptionV2 {

        String adrress = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(adrress);
        client.initError(data);

       try {
           client.connect();
       } catch (NetworkClientExceptionV2 e) {
           System.out.println("[오류] 코드 : " + e.getErrorCode() + ",메시지: " + e.getMessage());
           return;
       }

       try {
           client.send(data);
       } catch (NetworkClientExceptionV2 e) {
           System.out.println("[오류] 코드 : " + e.getErrorCode() + ",메시지: " + e.getMessage());
           return;
       }
       client.disconnect();
    }
}
