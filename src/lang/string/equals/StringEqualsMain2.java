package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String s1 = new String("abc"); //x001
        String s2 = new String("abc");//x002
        System.out.println("메서드 호출 비교1: " + isSame(s1,s2));

        String s3 = "hello";
        String s4 = "hello";
        System.out.println("메서드 호출 비교1: " + isSame(s3,s4));

    }
//문자열의 비교를 항상 equals로 해줘야 하는 이유
    // 문자열을 비교할 때, 객체로 만든게 들어올지, 리터럴로 만든게 들어올지 모르기 때문
    //즉, 동일성 비교보단 동등성 비교를 해야함
    private static boolean isSame(String x, String y) {
        return x.equals(y);
    }
}
