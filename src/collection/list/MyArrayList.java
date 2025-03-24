package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size =0;

	//기본 생성자
	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	@Override
	public int size()  {
		return size;
	}

	@Override
	public void add (E e) {
		if (size == elementData.length) {
			grow();
		}
		elementData[size] = e;
		size++;
	}
	// 원하는 인덱스에 어떤 타입의 데이터를 넣을 것인가
	@Override
	public void add(int index, E e) {
		if(size == elementData.length) {
			grow();
		}
		shiftRightFrom(index);
		elementData[index] = e;
		size++;
	}

	private void shiftRightFrom(int index) {
		for(int i = size; i> index; i--) {
			elementData[i] = elementData[i-1];
		}
	}


	@Override
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) elementData[index];
	}

	@Override
	public E set(int index, E element) {
		E oldValue = get(index);
		elementData[index] = element;
		return oldValue;
	}

	@Override
	public E remove(int index) {
		E oldValue = get(index);
		shiftLeftFrom(index);
		size--;
		elementData[index] = null;
		return oldValue;
	}
	// 요소의 인덱스 위치에서 부터 , 사이즈까지 (사이즈의 위치는 인덱스-1)
	private void shiftLeftFrom(int index) {
		for (int i = index; i < size-1; i++) {
			elementData[i] = elementData[i+1];
		}
	}

	@Override
	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	private void grow() {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity * 2;
		elementData = Arrays.copyOf(elementData, newCapacity); // 동적으로 용량을 2배로 키우는 메소드
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(elementData, size)) + "size=" + size + "capacity=" + elementData.length;
	}
}
