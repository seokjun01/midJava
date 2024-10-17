package lang.string.test;

public class TestString1 {
//startsWith()를 사용해서 url이 http~ 로 시작하는지 확인하라
    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean result = url.startsWith("https://");
        System.out.println(result);
    }
}
