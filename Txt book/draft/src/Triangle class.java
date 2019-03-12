import java.util.Scanner;
 public class Triangle class

 {
     public static void main (String[] args)
     {

     		Scanner keyboard = new Scanner (System.in);
		int tri, i, j;
     		System.out.println("Enter the size you want your triangle to be:");
		tri = keyboard.nextInt();

		  

		for (i = 1; i <= tri; i++) 
		{                          
				     for (j = 1; j <= i; j++)

		                     {

		                      System.out.print("*");

		                     }

		                           System.out.println();
		}

	

		for (i = tri - 1; i >= 0; i--)
		{

				     for (j = 1; j <= i; j++)

				     {

				     System.out.print("*");

				     }

		                     System.out.println();

		}
	}
}