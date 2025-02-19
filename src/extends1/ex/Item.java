package extends1.ex;

public class Item {

	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("이름 : " + "가격 : ");
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
