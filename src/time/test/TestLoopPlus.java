package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate[] array = new LocalDate[5];
        array[0] = LocalDate.of(2024, 1, 1); // 첫 번째 날짜 설정

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                // 이전 날짜에 14일 추가하여 현재 인덱스에 설정
                array[i] = array[i - 1].plusDays(14);
            }
            System.out.println(array[i]); // 현재 날짜 출력
        }
    }
}
