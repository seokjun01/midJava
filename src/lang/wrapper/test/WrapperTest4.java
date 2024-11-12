package lang.wrapper.test;

import static java.lang.Integer.parseInt;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str ="100";

        Integer i = Integer.valueOf(str);
        System.out.println(i);
        int intValue = i;
        System.out.println(intValue);
        Integer i2 = intValue;
        System.out.println(i2);
    }
}
