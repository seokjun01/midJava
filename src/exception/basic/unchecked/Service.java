package exception.basic.unchecked;


import exception.basic.checked.MyCheckedException;

// uncheck에외는 예외를 잡거나 던지지 않아도 된다. 잡지 않으면 알아서 밖으로 던진다.
public class Service {

    Client client = new Client();

    //필요한 경우 예외를 잡아서 처리하면 된다.
    public void callCatch() {
        try{
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    public void callThrow() {
        client.call();
    }

}
