package nested.nested.test;

public class AnonymousMain {

	public static void main(String[] args) {
	//여기서 Hello의 익명 클래스를 생성하고 hello를 호출해라.

		Hello hi = new Hello() {
			@Override
			public void hello() {
				System.out.println("Hellp.hello");
			}
		};
		hi.hello();
	}
}
