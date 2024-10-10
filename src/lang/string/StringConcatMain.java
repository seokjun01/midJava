package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
            String a = "hello";
            String b = "java";

            String result1 = a.concat(b);
            String result2 = a + b; //참조형이므로 참조값끼리의 연산은 원래는 안됨
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
// BUT 자바에서 문자열을 너무 자주 다루기 때문에,, +연산을 허용해줌