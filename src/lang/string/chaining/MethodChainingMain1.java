package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1); //자기자신의 참조값을 반환해서 adder1에 저장
        ValueAdder adder2 = adder1.add(2); //마찬가지
        ValueAdder adder3 = adder2.add(3); // 결국은 하나의 객체의 참조값


        int result = adder3.getValue();
        System.out.println("result = " + result);

    }
}
