package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 500);
		map.put("바나나", 500);
		map.put("망고", 1000);
		map.put("딸기", 1000);

		// map에 있는 데이터중에 값이 1000인 모든 상품을 출력하라  Hmm..~
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1000) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);

	/*	for (String s : map.keySet()) { //key값들만 Set로 모아놓음
			if (map.get(s) == 1000) { // 키에 달려 있는 values를 조회할때 씀 get
				System.out.println(s);
			}

		}
*/
	}
}
