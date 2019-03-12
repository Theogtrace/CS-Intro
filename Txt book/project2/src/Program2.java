import java.util.Scanner;

public class Program2
{
	public static void main(String[] args)
	{	
		int case_num = 0;
		
		Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a temperatue in degrees:");
        int x = keyboard.nextInt();
        Scanner lancer = new Scanner(System.in);
        System.out.println("Also enter either F for Fehrenheit or C for Celsius");
        String a = lancer.nextLine();
        
        a.toUpperCase();
        
        	if (a.indexOf("F")!= -1);
        	{
        		case_num = 1;
        	}
        	if (a.indexOf("C") != -1)
        	{
        		  case_num = 2;
        	}
        	
        	switch(case_num)       
        	   {
        	     case 1:
        	    	 
        	    	 int DegreesC = 5 * (x - 32)/9;
             		System.out.println(DegreesC + "C");
             		
        	       break;
        	       
        	     case 2:
        	    	 int DegreesF = (9 * (x / 5) + 32);
        	    	 System.out.println(DegreesF + "F");
        	    	 
        	    	break;
        	   }
	}
}

