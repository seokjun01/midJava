package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);


        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.<Double>numberMethod(20.0);
        /***제네릭 타입**
         정의: `GenericClass<T>`
         타입 인자 전달: 객체를 생성하는 시점
         예) `new GenericClass<String>`
         **제네릭 메서드**
         정의: `<T> T genericMethod(T t)` 타입 인자 전달: 메서드를 호출하는 시점
         */
    }
}
