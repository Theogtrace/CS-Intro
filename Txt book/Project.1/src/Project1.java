import java.util.Scanner;

public class Project1 
{
	public static void main(String[] args)
    {
		int n1 = 1998;
		String n2 = Integer.toString(n1);
		String first = n2.substring(0,1);
		String second = n2.substring(1,2);
		String third = n2.substring(2,3);
		String fourth = n2.substring(3);
		
		
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a random four digit number:");
        n1 = keyboard.nextInt();
      
        System.out.println("You entered:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        
    }
}