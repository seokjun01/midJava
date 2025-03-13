package nested.nested.test;

public class OuterClass3Main {

	public static void main(String[] args) {
		OuterClass3 o = new OuterClass3();
		o.myMethod();
		// OuterClass3 객체를 만들어서 myMethod를 호출하면 내부 클래스 객체만들고 메서드 호출까지!
	}
}
