package nested;

// 가까운 순으로 우선순위가 매겨짐
// 애초에 변수명을 달리하면 안 헷갈림
public class ShadowingMain {

	public int value = 1;


	class Inner {
		public int value = 2;

		void go() {
			int value = 3;
			System.out.println("value =" + value);
			System.out.println("this.value =" + this.value);
			System.out.println("shadowingMain.value =" + ShadowingMain.this.value);
		}
	}

	public static void main(String[] args) {
		ShadowingMain shadowingMain = new ShadowingMain();
		Inner inner = shadowingMain.new Inner();
		inner.go();
	}
}
