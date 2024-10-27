package lang.wrapper;

public class WrapperUtilMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);// 숫자를 래퍼 객체로 변환
        Integer.valueOf("10"); //문자열 래퍼 객체 변환
        int intValue = Integer.parseInt("10");//문자열 전용, 기본형 변환


        //비교 메서드
        int compareResult = i1.compareTo(20);
        System.out.println(compareResult);

        //산술 연산
        System.out.println("Sum: " + Integer.sum(10,20));
        System.out.println("min: " + Integer.min(10,20));
        System.out.println("max: " + Integer.max(10,20));
    }
}
