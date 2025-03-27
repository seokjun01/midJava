package collection.map.test.stack;

import java.util.*;

public class BrowserHistory {

	private	Deque<String> page = new ArrayDeque<>();
	private String currentPage = null;

	public void visitPage (String url) {
		if (currentPage != null) {
			page.push(url);
		}
		currentPage = url;
		System.out.println("방문 : " + url);
	}

	public String goBack () {
		if (!page.isEmpty()) {
			page.pop();
			System.out.println("뒤로 가기 : " + currentPage);
			return currentPage;
		}
		return null;
	}


}
