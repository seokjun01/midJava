package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

	private int outInstanceVar = 3;

	public Printer process(int paramVar) {

		int localVar =1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

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
		 return printer;
	}

	public static void main(String[] args) {
		LocalOuterV3 localOuter =  new LocalOuterV3();
		Printer printer = localOuter.process(2);
		printer.print();

		System.out.println("필드 확인");
		Field[] fields = printer.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println("field = " + field);
		}
	}
}
