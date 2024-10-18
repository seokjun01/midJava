package lang.string.test;

public class TestString7 {
// 공백 제거 메서드
    public static void main(String[] args) {
        String original = "     Hello Java     ";
        String trimmed = original.trim();
        System.out.println("trimmed: " + trimmed);
        String strip = original.strip();
        System.out.println("strip: " + strip);
    }
}
