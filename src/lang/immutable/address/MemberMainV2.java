package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);


        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원b의 주소를 부산으로 변경해야함
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.adress");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }

}
