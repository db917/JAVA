package part01;
class Book{
	
	private String title;
	private String author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
		
		
		
		
	}
	@Override
	public String toString() {
		return title+","+author;
	}
	
}
public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("삼국지","이문열");
		System.out.println(book);
		
		String str=new String("Hello");
		System.out.println(str);
		
		
	}

}
