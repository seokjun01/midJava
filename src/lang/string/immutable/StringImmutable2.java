package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {

        String str1 ="hello";
        String str2 =str1.concat("java"); // new String (" hello java ")라는 객체 만들어서 반환
        System.out.println("str1 = :" + str1);
        System.out.println("str2 = :" + str2);
    }
}

//String은 불변객체이기 때문에 반환된 값을 변수에 받지 않으면 변화가 적용되지 X
// 불변객체 Part 복습 필요
/* 왜 불변으로 설계 했을까?
문자열 풀에 있는 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참조하는 다른 변수의 값도 함께 변경됨
 */