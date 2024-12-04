package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {

        Service service = new Service();
        service.callThrow();
        System.out.println(" 정상 종료 ");

    }
}

// 예외가 main() 밖으로 던져지면 프로그램이 종료된다.
// 스택 트레이스 정보를 활용하면 예외가 어디서 발생했는지 알 수 있다.