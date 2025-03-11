package nested.local;

//지역 클래스
//지역 클래스는 자신이 속한 코드 블럭의 변수에 접근 가능하나, 접근 제어자를 사용할 수는 없다.
public class LocalOuterV1 {
	private int outInstanceVar = 3;

	public void process(int paramVar) {
		int localVar = 1;

		class LocalPrinter {
			int value = 0;

			public void printData() {
				System.out.println("value= " + value);
				System.out.println("localVar= " + localVar);
				System.out.println("paramVar= " + paramVar);
				System.out.println("outInstanceVar= " + outInstanceVar);
			}
		}

		LocalPrinter printer = new LocalPrinter();
		printer.printData();
	}

	public static void main(String[] args) {
		LocalOuterV1 localOuter= new LocalOuterV1();
		localOuter.process(2);
	}
}
