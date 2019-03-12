import java.util.Scanner;

public class Project2 
{
	public static void main(String[] args)
    {
		int [] numbers = new int[3];
      
      Scanner lancer = new Scanner(System.in);
      
      System.out.println(" enter 3 numbers");
      
      for (int x = 0; x <=3; x++)
      {
         numbers[x] = lancer.nextInt();
      }
      
      int valueHolder = 0;
      
      for (int y = 1; y <=3; y++)
      {
         if (numbers [y] < numbers [y-1])
         {
            valueHolder = numbers[y];
            numbers[y] = numbers [y - 1];
            numbers[y - 1] = valueHolder;
            y = 0;
         }
      }
      
      for (int z = 0; z <= 3; z++)
      {
         System.out.println(numbers[z]);
      }
    }
  }
 
     
    
        