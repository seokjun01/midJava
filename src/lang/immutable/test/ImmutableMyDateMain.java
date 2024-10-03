package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("data1 = " + date1);
        System.out.println("data2 = " + date2);

        System.out.println("2025 -> date1");
       date1= date1.withYear(2025); //불변 객체에 변동이 생길 시, 반환 값을 받아줘야 변화를 적용 가능함
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
