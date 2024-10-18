package lang.string.test;

public class TestString10 {
// split을 사용해서 fruits를 분리하고 join을 사용해서 분리한 문자들을 하나로 합쳐라
    public static void main(String[] args) {
        String fruits = "apple, banana, mango";

        String[] fruitsArray = fruits.split(", ");
        for (String s : fruitsArray) {
            System.out.println(s);
        }
        // 합치기
        String joinedString = String.join("-> ", fruitsArray);
        System.out.println("joinedString: " + joinedString);
    }
}
