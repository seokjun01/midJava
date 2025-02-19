package extends1.ex;

public class Album extends Item{

	private String artist;


	public Album(String name, String artist, int price) {
		super(name, price);
		this.artist = artist;

	}

	@Override
	public void print() {
		System.out.println("이름 : " + getName()+  "가격 : " + getPrice());
		System.out.println("아티스트: " + artist);
	}
}
