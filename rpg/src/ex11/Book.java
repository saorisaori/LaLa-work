package ex11;

public class Book extends TangibleAsset {
	String isbn;
	public Book
		(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn() { return this.isbn; }
	@Override
	public void setWeight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
