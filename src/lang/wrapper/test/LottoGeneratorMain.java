package lang.wrapper.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {

        LottoGenerator2 generator = new LottoGenerator2();
        int[] lotttoNumbers = generator.generate();

        System.out.print("로또 번호: ");
        for (int lotttoNumber : lotttoNumbers) {
            System.out.print(lotttoNumber+ " ");

        }
    }
}
