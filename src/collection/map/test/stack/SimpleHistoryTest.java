package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
//스택은 데이터 삽입 : push
//데이터 삭제 : pop
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();

		stack.push("youtube.com");
		System.out.println(stack);
		stack.push("google.com");
		System.out.println(stack);
		stack.push("facebook.com");
		System.out.println(stack);


		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());


	}
}
