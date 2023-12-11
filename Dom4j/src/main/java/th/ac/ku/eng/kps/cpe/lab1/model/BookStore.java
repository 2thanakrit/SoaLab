package th.ac.ku.eng.kps.cpe.lab1.model;

public class BookStore {
	public String isbn;
	public String title;
	public String author;
	public String catagory;
	public int year;
	public byte edition;
	public double price;

	
	public static void main(String[] args) {
		BookStore b = new BookStore() ;
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setCatagory("Programming");
		b.setYear(2009);
		b.setEdition((byte)7);
		b.setPrice(19.99);


	}
	

	
	private void setPrice(double newPrice) {
		this.price = newPrice;
		
	}



	private void setEdition(byte newEdition) {
		this.edition = newEdition;
	}



	private void setCatagory(String newCatagory) {
		this.catagory = newCatagory;
		
	}

	private void setYear(int newYear) {
		this.year = newYear;
		
	}

	private void setAuthor(String newAuthor) {
		this.author = newAuthor ;
		
	}

	private void setTitle(String newTitle) {
		this.title = newTitle;
		
	}

	private void setIsbn(String newIsbn) {
		this.isbn = newIsbn;
		
	}

}
