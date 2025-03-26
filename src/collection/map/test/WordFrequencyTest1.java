package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
	public static void main(String[] args) {
		String text ="orange banana apple apple banana apple";

		Map<String, Integer> result = new HashMap<>();

		String[] words = text.split(" "); // 구분자로 분리하는 메소드

		for (String word : words) {
			Integer count = result.get(word); // 기존에 단어가 몇 번 반복되었는지 불러오기
			if (count == null) { // 없으면 0으로 초기화
				count = 0;
			}
			count++; // 1증가하고
			result.put(word, count); //key-value에 넣는다
		}
		System.out.println(result);


		//각각의 단어가 나타난 수를 출력하라
		// 실행 결과 ->   {orange=1, banana=2, apple=3}
	}
}
