import java.util.Scanner;

public class Program1 
{
	public static void main(String[] args)
    {
	
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three nonnegative numbers in a list:");
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int n3 = keyboard.nextInt();
        
        if (n1 < n2 && n1 < n3 && n2 < n3)
        	
        {
        	System.out.println(n1);
        	System.out.println(n2);
        	System.out.println(n3);
        }
        else if (n1 < n2 && n1 < n3 && n2 > n3)
        	
        {
        	System.out.println(n1);
        	System.out.println(n3);
        	System.out.println(n2);
        }
        
        if (n2 < n1 && n2 < n3 && n1 < n3)
        	
        {
        	System.out.println(n2);
        	System.out.println(n1);
        	System.out.println(n3);
        }
        
        else if (n2 < n1 && n2 < n3 && n1 > n3)
        	
        {
        	System.out.println(n2);
        	System.out.println(n3);
        	System.out.println(n1);
        }
        
        if (n3 < n1 && n3 < n2 && n1 < n2)
        	
        {
        	System.out.println(n3);
        	System.out.println(n1);
        	System.out.println(n2);
        }
        
        else if (n3 < n1 && n3 < n2 && n1 > n2)
        	
        {
        	System.out.println(n3);
        	System.out.println(n2);
        	System.out.println(n1);
        }
    }
}