package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address); //위의 주소가 들어간 객체 생성
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
