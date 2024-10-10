package lang.string;

public class StringBasicMain {


    public static void main(String[] args) {
        String str1 = "hello"; //앞에 대문자로 시작하는 것들,, 참조형임
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
//String은 참조형인데 참조값이 아니라 다른것들이 들어감?
/*      String str1 = "hello";  자바가 이렇게 변경해서 해주는 것 예외 케이스
        String str1 = new String("hello"); */

// String 클래스 안에는 char [] value; 라는 배열을 가지고 있음
// java 9  이후 부터는 char [] -> byte[] 로 변경
// 영어와 숫자는 1byte , 문자는 2byte
// 문자열로 처리할 수 있는 다양한 기능을 제공 length() , concat(), trim() etc ...