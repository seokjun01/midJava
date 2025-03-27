package collection.map.test.queue;

import java.util.*;

// doc1, doc2, doc3 순서대로 입력하고 입력된 순서대로 출력하자
public class PrinterQueueTest {

	public static void main(String[] args) {
		Queue<String> printQueue = new ArrayDeque<>();

		printQueue.offer("doc1");
		printQueue.offer("doc2");
		printQueue.offer("doc3");

		System.out.println("출력 : "  + printQueue.poll());
		System.out.println("출력 : "  + printQueue.poll());
		System.out.println("출력 : "  + printQueue.poll());

	}
}
