import java.util.Scanner;

public class Project3
{
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a temperatue in degrees Fahrenheit:");
        int DegreesF = keyboard.nextInt();
        
        double DEGREES_C = 5*(DegreesF - 32)/9;
        
        System.out.println(DegreesF + " degrees Fahrenheit is " + DEGREES_C + " degrees Celsius");
 
        
    }
}