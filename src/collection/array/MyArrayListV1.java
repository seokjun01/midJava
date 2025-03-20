package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size;

	public MyArrayListV1() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV1(int capacity) {
		elementData = new Object[capacity];
	}
	//리스트의 크기 (얼마나 들어있는가 (용량 말고))
	public int size() {
		return size;
	}

	public void add(Object e) {
		elementData[size] = e;
		size++;
	}

	public Object get(int index) {
		return elementData[index];
	}

	public Object set(int index, Object element) {
		Object oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}

	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
	}
}
