package lang.string.method;

public class StringComparisonMain {


    public static void main(String[] args) {
        String str1 = "Hello Java!";
        String str2 = "hello java!";
        String str3 = "Hello World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str2: " + str1.equalsIgnoreCase(str2)); // 대소문자 무시하고 동등성 비교

        System.out.println(" 'b' compareTo 'a' :" + "b".compareTo("a")); //사전적으로 몇 칸 차이나는가
        System.out.println(" 'c' compareTo 'a' :" + "c".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2: " + str1.compareToIgnoreCase(str2));

        //str1 이 Hello로 시작하는가
        System.out.println("str1 start with 'Hello' : " + str1.startsWith("Hello"));

    }
}
