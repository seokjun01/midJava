package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // 기본형 -> 래퍼

        int value = 7;
        Integer boxedValue = value; // 오토박싱 (Integer.valueOf()) 생략
        // 래퍼 -> 기본형

        int unboxedValue = boxedValue; //오토 언박싱 .intValue() 생략

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
