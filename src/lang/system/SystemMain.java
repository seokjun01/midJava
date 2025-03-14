package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //  현재 시간(밀리초)로 가져옴
        long startMillisTime = System.currentTimeMillis();
        System.out.println("startMillisTime = " + startMillisTime);

        // 현재 시간 (나노초)로 가져옴
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        //환경 변수를 읽는다
        System.out.println("getenv= " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties= " + System.getProperties());
        System.out.println("Java Version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
