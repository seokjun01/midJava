package exception.basic.checked;

public class Service {

    Client client = new Client();
    // 예외를 잡아서 처리하는 코드

    public void callCatch() {
        try {
            client.call(); // 여기서 예외가 발생할 수 있음
        } catch (MyCheckedException e) {
            // 예외 발생시 이 블록으로 흐름이 넘어옴
            System.out.println("예외 처리, message= " + e.getMessage());
        }
        // 예외가 발생하던 안하던 이 부분은 실행
        System.out.println("정상 흐름");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
// 만약 try에서 잡은 예외가 catch의 대상에 없으면 예외를 잡을 수 없다. 이때 예외를 밖으로 던진다.
// catch는 해당 타입과 그 하위 타입을 모두 잡을 수 있다.
// 체크 예외와 언체크 예외가 뭐가 다른지..