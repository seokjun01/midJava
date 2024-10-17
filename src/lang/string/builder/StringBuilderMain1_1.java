package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("A");
        s1.append("B");
        s1.append("C");
        s1.append("D");
        System.out.println(s1);

        s1.insert(4,"Java");
        System.out.println("insert = " +s1);

        s1.delete(4,8);
        System.out.println("delete = " +s1);
        // 불변객체가 아니므로 반환 객체를 생성해서 출력하지 않아도
        //StringBuilder -> String
        String string = s1.toString();
        System.out.println(string);

        // String을 더할때 가변스트링으로 연산하고끝날때, String으로 바꿔서 사용 -> 메모리 사용 줄이고 성능 향상
        //But 사이드 이펙트 주의!!


    }
}
