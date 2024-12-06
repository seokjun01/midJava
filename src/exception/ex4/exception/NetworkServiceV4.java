package exception.ex4.exception;

public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
 // 언체크 예외는 잡아도 오류들을 복구할 수 없음, 따라서 예외를 밖으로 던짐. 허나 언체크이므로 알아서 던지므로 throws안씀