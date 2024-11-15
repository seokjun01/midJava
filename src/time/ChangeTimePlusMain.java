package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS); //정석
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime PlusDt2 = dt.plusYears(10); //편의 메서드
        System.out.println("PlusDt2 = " + PlusDt2);

        Period period = Period.ofYears(10); //불변이므로 값을 받아야함
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);
    }
}
