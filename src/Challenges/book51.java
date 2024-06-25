package Challenges;

class book51 {

	static int totalBook;
	String title;
	String author;
	String ISBN;
	boolean isborrowed;
	
	static {
		totalBook = 0;
	}
	{
		totalBook++;
	}
	 book51(String ISBN , String author , String title){
		this.ISBN = ISBN;
		this.author = author;
		this.title = title;
	}
	 

	public book51() {
		// TODO Auto-generated constructor stub
	}


	static int gettotalbook() {
		return totalBook;
	}
	void borrowbook() {
		if(isborrowed) {
			System.out.println("the book is already borrowed");
		}else {
			this.isborrowed = true;
			System.out.println("Enjoy the book");
		}
	}
	void returnbook() {
		if(isborrowed) {
		this.isborrowed = false;
		System.out.println("hope you are enjoy the book , please review the book");
	}else {
		System.out.println("this book is already in library");
	}
	}
	public static void main(String []args) {
		book51 computerbook = new book51();
		book51 computedesign = new book51();
		
		System.out.println(book51.gettotalbook());
		
	}
}
