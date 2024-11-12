package lang.wrapper.test;

import static java.lang.Integer.parseInt;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int value1 = parseInt(str1);
        int value2 = parseInt(str2);
        int sum =value2+value1;
        System.out.println("두 수의 합 :" + sum);
    }
}
