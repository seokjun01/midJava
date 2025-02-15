package nested.nested.ex2;

//ex1 패키지에 비해 클래스의 기능과 목적이 분명함
// 내부에서 단독으로 사용하는 클래스라고 인지할 수 있음
// 외부에서 클래스가 사용된다면 중첩보다는 밖에 빼서 사용하는 것이 더 나은 설계임

public class NetworkMain {

	public static void main(String[] args) {
		Network network = new Network();
		network.sendMessage("hello java");
	}
}
