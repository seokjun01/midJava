package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // add 가 Immutable 타입으로 반환하기 때문


        System.out.println("obj1 = " + obj1.getValue());
        // return 값을 안 받았기 때문에 불변이 유지됨
        // 받지 않는다면 연산 후의 값은 그냥 버리는 것
    }
}
