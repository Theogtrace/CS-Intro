import java.util.Scanner;
public class Book
{
	private String title;
	private String category;
	private double cost;
	private int pageNumber;
	public Book( String title, String category, double cost, int pageNumber)
	{
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.pageNumber = pageNumber;
	}
	public void readBookData( )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the title of the Book?");
		title = keyboard.nextLine( );
		System.out.println("What is the category?");
		category = keyboard.nextLine( );
		System.out.println("What is the cost of the book?");
		cost = keyboard.nextDouble( );
		while (cost <0)
		{
				System.out.println("Cost cannot be negative");
				System.out.println("Please enter valid cost of book");
			    cost = keyboard.nextDouble( );
		}

		System.out.println("How many pages does the book have?");
		pageNumber = keyboard.nextInt();
		if (pageNumber <=0)
			{
				System.out.println("That can't be negative or zero");
				System.out.println("Valid pageNumber should be greater than 0");
			}
		else
			{
			System.out.println("let's move on");
			}

	}
	public String getcurrentitle( )
	{
		return title;
	}
	public String getCategory( )
	{ 
		return category;
	}
	public double getcost( )
	{ 
		return cost;
	}
	public int getpageNumber( ) 
	{
		return pageNumber;
	}
	public void Settitle(String title)
	{ 
		this.title = title;
	}
	public void setcategoryString(String category )
	{ 
		this.category = category;
	}
	public void setCost(double cost)
	{ 
		this.cost = cost;
	}
	public void setPageNumber(int pageNumber)
	{
		this.pageNumber = pageNumber;
	}
	public void setBook(String title, String category, double cost, int pageNumber )
	{	
		this.title = title;
		this.category = category;
		this.pageNumber = pageNumber;
		this.cost = cost;
	}
	public void setBook(Book n)
	{	
		this.title = n.title;
		this.category = n.category;
		this.cost = n.cost;
		this.pageNumber = n.pageNumber;
	}

	public String getBookInfo( )
	{	return title + " " + category + " " + cost;
	}
	public Book add(Book other)
	{
		Book answer = new Book();
		answer.title = other.title;
		answer.category = other.category;
		//result.cost = this.cost + "-" + other.cost;
		return answer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getCost() {
		return cost;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBookInfoUpperCase( )
	{	String temp = title + " " + category + " ";
	return temp.toUpperCase();
	}
	public String toString()
	{	return title + " " + category;
	}
	public boolean equals(Book n)
	{	return this.title.equalsIgnoreCase(n.title)
			&& this.category.equalsIgnoreCase(n.category);
	}
}
