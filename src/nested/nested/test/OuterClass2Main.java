package nested.nested.test;

public class OuterClass2Main {
	public static void main(String[] args) {
		//여기에서 내부클래스의 메서드 호출
		OuterClass2 oc = new OuterClass2();
		OuterClass2.InnerClass ic = oc.new InnerClass();
		ic.hello();

	}
}

// static이 아니기 때문에 또한, 바깥 클래스를 구성하기 떄문에 바깥 클래스의 인스턴스를 생성하고 생성하여야함