package nested.nested.test.ex1;

public class Library {
	//코드 작성
	private int maxCount;
	private int count =0;
	Book[] books;


	public Library(int maxCount) {
		this.maxCount = maxCount;
		this.books = new Book[maxCount+1];
	}

	public void addBook(String title, String author) {
		if (count >= maxCount) {
			System.out.println("도서관 저장 공간이 부족합니다.");
		}
		else {
			books[count++] = new Book(title, author);
		}
	}

	public void showBooks() {

		for (Book book : books) {
			if(book != null) {
			System.out.println("도서이름 : " + book.title + ", 저자 : " + book.author);
		}
			}
	}

	private class Book {
		private String title;
		private String author;

		private Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}
}
