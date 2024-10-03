package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);


        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원b의 주소를 부산으로 변경해야함
        /*따라서, new ImmutableAddress("부산")는 객체를 만든 후 그 참조값을 setAddress로 전달하는 것이고,
         이는 "변수 없이 바로 참조 위치에 있는 값을 전달"한다고 이해하는 게 맞습니다. setAddress(참조값)로 생각하면 됩니다.
         */
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.adress");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }

}
