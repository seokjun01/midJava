package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations =1_000_000_000; // 반복 횟수
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i =0; i< iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본형 실행시간 :" + (endTime - startTime) + "ms");


        //래퍼 클래스 Long 사용
        Long sumWrapper =0L;
        startTime = System.currentTimeMillis();
        for(int i =0; i< iterations; i++) {
            sumWrapper += i; //오토박싱 발생해서 ㄱㅊ
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 실행시간 :" + (endTime - startTime) + "ms");

        //기본형 > 래퍼클래스 연산속도
    }
}
