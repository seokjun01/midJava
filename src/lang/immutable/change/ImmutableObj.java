package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue; //값이 불변이므로 객체를 생성해서 연산 후 반환
       return  new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}
