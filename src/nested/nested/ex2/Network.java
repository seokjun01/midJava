package nested.nested.ex2;


public class Network {

	public void sendMessage(String text) {
		NetworkMessage networkMessage = new NetworkMessage(text);
		networkMessage.print();
	}

	//네트워크 객체 안에서만 사용
	private static class NetworkMessage {

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

}
