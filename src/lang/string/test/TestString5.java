package lang.string.test;

public class TestString5 {
// 이 문제 틀림
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String filename = str.substring(0, extIndex); // 0부터 .txt까지 자르기
        String extName = str.substring(extIndex); // .txt부터 자르기
        System.out.println("filename : " + filename);
        System.out.println("extName : " + extName);
    }
}
