package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		//배열의 값 출력할때 Arrays.toString
		System.out.println(Arrays.toString(arr));

		//배열의 첫번째 인덱스에 값을 추가
		//기본 배열의 데이터를 한 칸씩 뒤로 밀고 공간 만든 후, 추가
		System.out.println("배열의 첫번째 위치에 3 추가 O(n)");
		int newValue =3;
		addFirst(arr, newValue);
		System.out.println(Arrays.toString(arr));

		System.out.println("배열 index(2) 위치에 4 추가 O(n)");
		int index =2;
		int value =4;
		addAtIndex(arr, index, value);
		System.out.println(Arrays.toString(arr));

		System.out.println("배열 마지막 위치에 5 추가 O(1)");
		addLast(arr, 5);
		System.out.println(Arrays.toString(arr));
	}

	private static void addFirst(int[] arr, int newValue) {
		//왜 마지막 인덱스에서 부터 시작할까 -> 처음 인덱스 부터하면 값이 계속 덮여쓰이기 때문
		for (int i= arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = newValue;
	}

	private static void addAtIndex(int[] arr, int index, int newValue) {
		// 넣고자 하느 인덱스 뒤부터 값을 뒤로 미루면 된다.
		for (int i=arr.length-1; i>index; i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = newValue;
	}

	private static void addLast(int[] arr, int newValue) {
		arr[arr.length-1] = newValue;
	}
}
