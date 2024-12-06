package exception.ex4.exception;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    // 언체크 예외이므로 throws 로 넘기지 않아도 자동으로 넘긴다.
    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExcepetionV4(address, address+ " 서버 연결 실패");
        }
        System.out.println("서버 연결 성공");
    }


    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + "서버에 데이터 전송 실패" + data);
        }
        System.out.println(address + "서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address+ "서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }
        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
