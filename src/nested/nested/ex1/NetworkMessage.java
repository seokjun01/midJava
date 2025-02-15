package nested.nested.ex1;


//네트워크 객체 안에서만 사용
public class NetworkMessage {

	private String content;

	//메시지를 만들고
	public NetworkMessage(String content) {
		this.content = content;
	}

	//출력하는 기능
	public void print() {
		System.out.println(content);
	}



}
