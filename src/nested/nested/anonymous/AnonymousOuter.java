package nested.nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

	private int outInstance = 3;

	public void process(int paramVar) {

		int localVar =1;
		// new Printer() {body} -> 클래스 본문을 정의하면서 동시에 생성
		Printer printer = new Printer() {
			int value = 0;

			@Override
			public void print() {
				System.out.println("value=" + value);
				System.out.println("localVar=" + localVar);
				System.out.println("paramVar=" + paramVar);
				System.out.println("outInstance=" + outInstance);
			}
		};
		printer.print();
		System.out.println("printer.class= " + printer.getClass());
		}

	public static void main(String[] args) {
		AnonymousOuter main = new AnonymousOuter();
		main.process(2
		);
	}
	}

