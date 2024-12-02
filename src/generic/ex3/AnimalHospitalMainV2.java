package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> dogHospital2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> dogHospial2 = new AnimalHospitalV2<>();
    }
}
