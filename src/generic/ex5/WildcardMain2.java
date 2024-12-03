package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog>  dogBox = new Box<>();
        Box<Animal>  animalBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }
    // <? extends Animal> Animal 포함 그 이하의 타입만 받을 수 있다.
    // <? super Animal>  Animal 포함 그 이상의 타입만 받을 수 있다
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
