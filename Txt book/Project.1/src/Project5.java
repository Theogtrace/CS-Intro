import java.util.Scanner;

public class Project5
{
	public static void main(String[] args)
	{
		int amount, originalAmount, quarters, dimes, nickels;
		
		Scanner get = new Scanner(System.in);
		System.out.println("Enter price of an iteam from 25 to a doller with increments of 5:");
		originalAmount = get.nextInt();
		System.out.println("You bought an item for " + originalAmount + " cents and gave me a doller");
		
		amount = 100 - originalAmount; 
		quarters = amount/25;
		amount = amount % 25;
		dimes = amount/10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		
		System.out.println("so your change is :");
		System.out.println(quarters + " quarters ");
		System.out.println(dimes + " dimes ");
		System.out.println(nickels + " nickels ");
		
	}
}