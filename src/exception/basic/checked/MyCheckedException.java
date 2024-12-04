package exception.basic.checked;

public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message);
    }

    //예외 클래스는 예외를 상속 받으면 됨
    //Exception을 상속받은 예외는 체크 예외가 됨
    //super(message) 로 전달한 메시지는 Throwable에 있는 detailMessage에 보관된다.
    // getMessage() 를 통해 조회 가능
}
