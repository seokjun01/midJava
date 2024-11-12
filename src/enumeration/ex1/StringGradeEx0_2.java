package enumeration.ex1;


// 문자열 상수가 어디에 있는지 `discount()` 를 호출하는 개발자가 어떻게 알 수 있을까?
public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int vip =discountService.discount("VIP", price);
        System.out.println("VIP등급의 할인 금액 :" + vip);


        int basic =discountService.discount("BASIC", price);
        System.out.println("BASIC 등급의 할인 금액: " + basic);

        int gold =discountService.discount("GOLD", price);
        System.out.println("GOLD 등급의 할인 금액: " + gold);

        int diamond =discountService.discount("DIAMOND", price);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

;

    }
}
