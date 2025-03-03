package access.ex;

public class MaxCounter {
	private int max;
	private int count;

	public MaxCounter(int max) {
		this.max = max;
	}

	public void increment() {
		this.count ++;
		if (count >= max) {
			System.out.println( "최대값을 초과할 수 없습니다.");
		}
		return;
	}

	public int getCount() {
		return count;
	}

}
