package lang.string.chaining;

import com.sun.jdi.Value;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this; //나의 참조를 반환
    }
    public int getValue() {
        return value;
    }
}
