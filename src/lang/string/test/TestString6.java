package lang.string.test;
//틀림
public class TestString6 {
    //str 에서 key로 주어지는 문자를 찾고 , 찾은 문자의 수를 출력하라. + indexOf() 를 반복문과 함께 풀면 된다
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index =str.indexOf(key); // 변수를 넣을수도 있는지?
        while( index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
//indexOf(key, startIndex) 메서드는 startIndex부터 문자열을 검색하여 **첫 번째로 key가 나타나는 위치(인덱스)**를 반환합니다.
    }
}
