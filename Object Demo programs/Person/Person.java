import java.util.Scanner;
public class Person
{
	private String Name;
	private int age;
	public void readPersonData( )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter  name?");
		Name = keyboard.nextLine( );
		System.out.println("Enter Age");
		age = keyboard.nextInt();
	}
	public String getName( )
	{
		return Name;
	}
	public  int getAge( )
	{ 
		return age;
	}

	public void setName(String Name, int Age)
	{	
		this.Name = Name;
		this.age = age;
	}
	public void setName(Person n)
	{	
		this.Name = n.Name;
		this.age = n.age;
	}

	public String getPersonInfo( )
	{	
		return Name + " " + age;
	}
	public Person add(Person other)
	{
		Person answer = new Person();
		answer.Name = other.Name;
		answer.age = other.age;
		return answer;
	}
	
	public boolean equals(Person p) 
	{ 
		return this.Name.equalsIgnoreCase(p.Name) 
		&& this.age == p.age; 
	} 
	
	
	public boolean hasSameName(Person p) 
	{ 
		return this.Name.equalsIgnoreCase(p.Name); 
	} 
	
	public boolean hasSameAge(Person other) 
	{ 
		return this.age == other.age; 
	} 

	public boolean isOlderThan(Person other) 
	{ 
		return this.age > other.age; 
	}
	
	public String toString()
	{	
		return Name + " ";
	}
	
}

