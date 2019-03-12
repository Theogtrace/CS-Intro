public class BookDemo 
{ 
	public static void main(String[] args) 
	{ 

		Book schoolBook = new Book("BookeT", "Fiction", 20.10, 10); 
		Book bedReadingBook = new Book("BookeT", "Fiction", 20.10, 10); 
		Book cookBook = new Book("BookeT", "Fiction", 20.10, 10); 
		Book newBook; 
		System.out.println("Enter school book information."); 
		schoolBook.readBookData( ); 
		System.out.println("Enter bed reading book information."); 
		bedReadingBook.readBookData( ); 
		System.out.println("Enter cookbook information."); 
		cookBook.readBookData( ); 
		System.out.println("The cost of your school book is $" 
				+ schoolBook.getcost()); 
		System.out.println("Your bed reading book is " + 
				bedReadingBook); 
		if(schoolBook.equals(bedReadingBook)) 
		{ 
			System.out.println("Your school book is the same as your bed reading book!" ); 
		} 
		else 
		{ 
			System.out.println("Your school book is not the same as your bed reading book!" ); 
		} 
		newBook = bedReadingBook.add(cookBook); 
		




	} 
}