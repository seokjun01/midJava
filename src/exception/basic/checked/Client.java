package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }

    //throw 예외라고 하면, 새로운 예외를 발생시킬 수 있다.
    //예외도 객체이므로 new로 생성하고 발생시킨다.
    //throw와 throws는 다르다. throws는 발생시킨 예외를 밖으로 던질 때 사용하는 키워드
}
