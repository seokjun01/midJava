package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a= " + a );
        System.out.println("b= " + b );

       // b.setValue("부산"); //b의 값을 부산으로 변경
        b = new ImmutableAddress("서울");
        System.out.println("부산 -> b");
        System.out.println("a= " + a );
        System.out.println("b= " + b );
        //참조값을 복사하였기 때문, 같은 인스턴스를 참조한다
    }
}
