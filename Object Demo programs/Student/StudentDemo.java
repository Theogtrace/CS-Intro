import java.util.Scanner; 
public class StudentDemo 
{ 
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in); 
		Student person = new Student ();// one Student 
		int numberOfStudents, i; 
		System.out.println("Enter number of Students:"); 
		numberOfStudents = scan.nextInt( ); 

		for(i = 0; i < numberOfStudents; i++) 
		{ 
			person.readInput(); 
			person.calculate(); 
			person.output(); 

		} 

	} 
} 
