package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 없어짐
        Integer integerObj = Integer.valueOf(10); // -128~127 자주 사용하는 값 재사용 , 불변

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        // == 으로 비교하면 false , equals로 비교하면 true
    }
}
