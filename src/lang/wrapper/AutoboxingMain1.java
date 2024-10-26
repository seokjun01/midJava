package lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        // 기본형 -> 래퍼

        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        // 래퍼 -> 기본형

        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
