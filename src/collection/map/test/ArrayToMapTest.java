package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

	public static void main(String[] args) {
		//2차원 배열 배열안의 배열		인덱스 0				인덱스 1					인덱스 2
		String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
		// 주어진 배열로 부터 Map 생성
		Map<String, Integer> productMap = new HashMap<>();
		// 한 줄씩 꺼낸다. 꺼내는 쪽의 왼쪽인덱스는 key, 오른쪽은 파싱하여 value값에
		for (String[] product : productArr) {
			productMap.put(product[0], Integer.valueOf(product[1]));
		}
		// Map의 모든 데이터 출력
		for (String s : productMap.keySet()) {
			System.out.println(" 제품 = " + s + ",가격 = " + productMap.get(s));

		}
	}
}
