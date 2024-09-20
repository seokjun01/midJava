package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString() 은 Object 클래스의 메서드
        String string = child.toString(); //객체에 대한 정보 반환
        System.out.println(string);
    }
}
// 자바에서 Object 클래스가 최상위 부모 클래스