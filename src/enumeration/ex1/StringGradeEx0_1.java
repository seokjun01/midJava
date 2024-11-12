package enumeration.ex1;


public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic =discountService.discount(StringGrade.BASIC, price);
        int gold =discountService.discount(StringGrade.GOLD, price);
        int diamond =discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
    // 문자열 상수를 사용하여서 전체적으로 명확한 코드 작성에 성공
    //허나 문자열 상수를 사용하지 않고 String타입은 어떤 문자열 이든 받기때문에, 실수를 막을 방법이 없음
}
