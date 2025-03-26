package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		Map<String, Integer> studentMap = new HashMap<>();

		studentMap.put("studentA", 90);
		studentMap.put("studentB", 80);
		studentMap.put("studentC", 80);
		studentMap.put("studentD", 100);
		System.out.println(studentMap);

		Integer result = studentMap.get("studentD"); //Key값을 넣은것임
		System.out.println(result);

		System.out.println("keySet활용");
		Set<String> keySet = studentMap.keySet(); //keySet은 key를 set 형태로 반환

		for (String s : keySet) {
			Integer value = studentMap.get(s);
			System.out.println("key= " + s + " value= " + value );
		}

		System.out.println("entrySet활용");
		Set<Map.Entry<String, Integer>> entires = studentMap.entrySet();
		for (Map.Entry<String, Integer> entire : entires) {
			String key = entire.getKey();
			Integer value = entire.getValue();
			System.out.println("key= " + key + " value= " + value );
		}

		System.out.println("values 활용");
		Collection<Integer> values = studentMap.values(); // Integer의 묶음으로 반환
		for (Integer value : values) {
			System.out.println("value= " + value );
		}
	}
}
