package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
       int result= adder.add(1).add(2).add(3).getValue();
        //x001.add(1) 이런식으로 연쇄적으로 메서드 호출
        //반환된 참조값을 즉시 바로 사용하여 메서드 호출

        System.out.println("result = " + result);

    }
}
