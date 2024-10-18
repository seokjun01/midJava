package lang.string.test;

public class TestString9 {
 //split 틀림
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@"); // @부터 기준 앞뒤로 나눔
        String ID = parts[0];
        String Domain = parts[1];

        System.out.println("ID: " + ID);
        System.out.println("Domain: " + Domain);
    }
}
