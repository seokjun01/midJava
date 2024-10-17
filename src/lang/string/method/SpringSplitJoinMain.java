package lang.string.method;

public class SpringSplitJoinMain {

    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        String[] split = str.split(","); // ,을 기준으로 분할
        for (String s : split) {
            System.out.println(s);
        }


        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        //문자열 배열 연결
        String result = String.join("-", split);
        System.out.println(result);
    }
}
