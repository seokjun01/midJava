package collection.set;

public class MyHashSetV0Main {

	public static void main(String[] args) {
		MyHashSetV0 set = new MyHashSetV0();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set);

		boolean result = set.add(4);
		System.out.println("중복 데이터 저장 결과 = " + result);
		System.out.println(set);

		System.out.println("set.contains(3): " + set.contains(3)); // O(n)
		System.out.println("set.contains(99): " + set.contains(99)); // O(n)
	}
}
/*
데이터를 추가할 때 마다 중복이 있는지 확인해야하므로 그렇게 효율적이지 못하다.
*/
