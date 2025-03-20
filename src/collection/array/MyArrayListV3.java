package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size =0;

	public MyArrayListV3() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV3(int capacity) {
		elementData = new Object[capacity];
	}
	//리스트의 크기 (얼마나 들어있는가 (용량 말고))
	public int size() {
		return size;
	}

	public void add(Object e) {
		//만약 크게가 꽉 찼다면 .
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}

	public void add(int index, Object e) {
		if(size == elementData.length) {
			grow();
		}
		shiftRightFrom(index);
		elementData[index] = e;
		size++;
	}

	private void shiftRightFrom(int index) {
		// 고민해보기
		for (int i =size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}
	}

	//Arrays.copyOf(기존배열, 새로운 길이); -> 새로운 길이로 배열 생성 + 기존 배열의 값을 새로운 배열에 복사
	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		elementData = Arrays.copyOf(elementData, newCapacity);
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

	public Object remove(int index) {
		Object oldValue = get(index);
		shiftLeftFrom(index);
		size--;
		elementData[size] = null;
		return oldValue;
	}

	private void shiftLeftFrom(int index) {
		for (int i = index; i< size -1; i++) {
			elementData[i] = elementData[i+1];
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
	}
}
