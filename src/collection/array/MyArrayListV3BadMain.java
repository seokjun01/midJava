package collection.array;

public class MyArrayListV3BadMain {

	public static void main(String[] args) {
		MyArrayListV3 numberList = new MyArrayListV3();

		numberList.add(1);
		numberList.add(2);
		numberList.add("이번엔 문자");
		System.out.println(numberList);

		//object를 반환하므로 다운 캐스팅 필요
		Integer num1 = (Integer)numberList.get(0);
		Integer num2 = (Integer)numberList.get(1);
		//문자는 캐스팅 불가능
	}
}
