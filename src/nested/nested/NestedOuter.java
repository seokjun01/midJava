package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;


    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);


            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없음

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있음! private이라도
            System.out.println(NestedOuter.outClassValue);
        }
    }
}
