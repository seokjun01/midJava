package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
    // Grade내부에 discount메서드를 만들어서 할인율을 스스로 계산한다
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
