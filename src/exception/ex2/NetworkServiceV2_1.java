package exception.ex2;

public class NetworkServiceV2_1 {

    public void snedMessage(String data) throws NetworkClientExceptionV2 {

        String adrress = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(adrress);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
