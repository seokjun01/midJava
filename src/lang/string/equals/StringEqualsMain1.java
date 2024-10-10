package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String s1 = new String("abc"); //x001
        String s2 = new String("abc");//x002
        System.out.println("new String() == 비교 : " + (s1 == s2)); //참조값을 비교하므로 다름 동일성 비교 실패
        System.out.println("new String() equals 비교 : " + (s1.equals(s2))); //동등성 비교 성공

        String s3 = "hello"; //x003
        String s4 = "hello"; //x004
        System.out.println("리터럴 == 비교 " +(s3 == s4) );
        System.out.println("리터럴 == 비교 " +(s3.equals(s4)) );
    }
}
// 문자열 리터럴과, 문자열 풀에 대하여 ..
// 객체 생성 없이 ,바로  String  s1 = "hello" 이렇게 리터럴로 만들면 문자열 풀을 사용함
// 프로그램 로딩이 될 때, 리터럴 문자열 풀에 넣고  사용할 때 문자열 풀에서 찾아옴,
// 메모리 사용도 줄이고, 문자 만드는 시간도 줄어듬 -> 성능 최적화! ㅅ
// Pool 이란 ? 자원이 모여 있는 . (힙 영역을 사용)