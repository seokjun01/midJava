package nested.inner;

public class InnerOuter {

	private static int outClassValue = 3;
	private int outInstancevalue =2;

	class Inner { // static이 붙지 않는다 -> 인스턴스 멤버가 된다
		private int innerInstanceValue =1;

		public void print() {

			//자기 자신에 접근 가능
			System.out.println(innerInstanceValue);

			// 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
			System.out.println(outInstancevalue);

			// 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
			System.out.println(outClassValue);
		}
	}
}
