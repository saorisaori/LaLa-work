package chap16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Book("ゲド戦記", "アーサー・Ｋ・ル＝グウィン");
		Book book2 = new Book("ナルニア国物語", "C・S・ルイス");
		Book book3 = new Book("不思議の国のアリス", "ルイス・キャロル");

		List<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		for (Book book : bookList) {
			System.out.println(book.getTitle() + ":" + book.getAuthor());
		}
	}

}
