package exception.ex3;

public class NetworkClientExceptionV3  extends Exception {
    public NetworkClientExceptionV3(String message) {
        super(message);
    }

    //NetworkClient에서 발생하는 모든 예외는 위 예외를 부모로 하도록 설계
}


