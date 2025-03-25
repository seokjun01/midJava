package collection.list.test.ex1;

public class ArrayEx1 {

	// 위 코드를 배열 대신에 list를 사용하도록 변경하기
	// 사용할 리스트 클래스 만들기
	public static void main(String[] args) {
		int[] students = {90, 80, 70, 60, 50};
		int total = 0;
		for (int i = 0; i < students.length; i++) {
			total += students[i];
		}
		double average = (double) total / students.length;
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average);
	}
}
