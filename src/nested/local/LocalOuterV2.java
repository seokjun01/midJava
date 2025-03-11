package nested.local;

public class LocalOuterV2 {

	private int outInstanceVar = 3;

	public void process(int paramVar) {

		int localVar =1;

		class LocalPrinter implements Printer {
			int value =0;

			@Override
			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("paramVar = " + paramVar);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
 		}
		 Printer printer = new LocalPrinter();
		 printer.print(); // 부모는 자식을 담을 수 있다 + 오버라이딩 해서 자식의 메서드 사용
	}

	public static void main(String[] args) {
		LocalOuterV2 localOuter =  new LocalOuterV2();
		localOuter.process(2);
	}
}
