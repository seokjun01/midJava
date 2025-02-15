package nested.inner;

public class InnerOuterMain {

	public static void main(String[] args) {
		InnerOuter outer = new InnerOuter();
		InnerOuter.Inner inner = outer.new Inner(); //어떤 인스턴스를 참조하는지 알아야함 new Inner();

		inner.print();

		System.out.println("innerClass" + inner.getClass());
	}
}


// 정적 중첩 클래스와는 다르게 내부 클래스는 바깥 클래스의 소속이 된다.
// 중첩 : 어떤 다른 것이 내부에 위치
// 내부 : 나의 내부에 있는 나를 구성하는 요소