package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str ="100";

        Integer i = Integer.valueOf(str);
        System.out.println(i);
        int intvalue = i.intValue();
        System.out.println(intvalue);
        Integer integer2 =Integer.valueOf(intvalue);
        System.out.println(integer2);

    }
}
