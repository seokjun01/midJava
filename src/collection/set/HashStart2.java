package collection.set;

import java.util.Arrays;

//사고의 틀을 바꾸어서 인덱스 번호에 맞는 값으로 넣으면 어떨까?
public class HashStart2 {

	public static void main(String[] args) {
		//입력: 1, 2, 5, 8
		//[null, 1, 2, null, null, 5, null, null, 8, null]
		Integer[] inputArray = new Integer[10];
		inputArray[1] = 1;
		inputArray[2] = 2;
		inputArray[5] = 5;
		inputArray[8] = 8;
		System.out.println("inputArray = " + Arrays.toString(inputArray));

		int searchValue = 8;
		Integer result = inputArray[searchValue];
		System.out.println(result);

	}
}
