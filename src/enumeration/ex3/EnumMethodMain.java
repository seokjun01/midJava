package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        Grade[] values = Grade.values();  // enum값 반환에서 배열에 담아줌
        System.out.println("values = " + Arrays.toString(values)); //담은 값 출력
        for (Grade value : values) {
            System.out.println("name= " + value.name() + ", ordinal= " + value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
