package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }



    private static void action(Object obj) {
        //객체에 맞는 다운캐스팅을 해야 자식의 메서드 사용가능
        //메서드 오버라이딩 말고는 밑으로 찾아가는 방법 x
        //다형성 활용을 위해선 다형적 참조 + 메서드 오버라이딩
        // Object에는 자식 객체 메서드가 정의되어 있지 않으므로 , 다운 캐스팅을 통해 호출해야함
        if(obj instanceof Dog dog) {
            dog.sound();
        }else if(obj instanceof Car car) {
            car.move();
        }

    }
}
