package lang.wrapper.test;

import java.util.Random;
// 위 처럼 풀어도 되나,, 문제의 요건에 맞지 않음.
public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();


        int randomNum1 = random.nextInt(44)+1;
        int randomNum2= random.nextInt(44)+1;
        int randomNum3 = random.nextInt(44)+1;
        int randomNum4 = random.nextInt(44)+1;
        int randomNum5 = random.nextInt(44)+1;
        int randomNum6 = random.nextInt(44)+1;
        System.out.println("로또 번호 :"+ randomNum1 + " "+ randomNum2+" "+randomNum3+" "+randomNum4+" "+ randomNum5+" "+randomNum6);

    }
}

