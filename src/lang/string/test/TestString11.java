package lang.string.test;

public class TestString11 {
//str 문자열을 반대로 뒤집어라. StringBuilder에 있는 reverse()를 사용
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        String str1 = strBuilder.toString();
        System.out.println(str1);
        /*
        String str = "Hello Java";
String reversed = new StringBuilder(str).reverse().toString(); System.out.println(reversed); // 출력: "avaJ olleH"
         */
    }
}
