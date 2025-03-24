package collection.list;

public class BatchProcessorMain {

	public static void main(String[] args) {
		//MyArrayList<Integer> list = new MyArrayList<>();
		MyLinkedList<Integer> list = new MyLinkedList<>();

		BatchProcessor processor = new BatchProcessor(list); // 의존성 주입
		processor.logic(50_000);
	}
}
