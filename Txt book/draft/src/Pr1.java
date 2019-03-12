
import java.util.Scanner;

public class Pr1
{
    
    public static final double INTEREST_RATE = 0.02;
	
    public static void main(String[] args)
    {
        double balance, interest, balance2;
    	int case_num = 0;
		
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Enter your saving account balance: $");
        balance = keyboard.nextDouble( );
        
        System.out.println("Do you want to withdrawl or make a deposet?");
        String a = keyboard.next();
       
        System.out.println("Your current balance is " + balance);
        interest = INTEREST_RATE * balance;
        System.out.println("and you balance will go up by " + interest + " each month." );
        if (a.indexOf("withdrawl") == 0)
    	{
    		case_num = 1;
    	}
    	if (a.indexOf("deposet") == 0)
    	{
    		  case_num = 2;
    	}
    	
    	switch(case_num)       
    	   {
    	     case 1:
    	    	 
    	    	 System.out.println("How much do you want to withdrawl?");
    	         int b = keyboard.nextInt();
    	         
    	    	 balance = balance - b;
    	    	 
    	    	
    	    	
    	    	balance2 = balance + (INTEREST_RATE * balance)/12;
    	    	
    	    	
    	    	System.out.println("This months balance is " + balance2);
    	    	
    	       break;
    	       
    	     case 2:
    	    	 
    	    	 System.out.println("How much do you want to deposet?");
    	         int c = keyboard.nextInt();
    	    	 
    	    	 balance = balance + c;
    	    	 
     	    	
     	    	
     	    	balance2 = balance + (INTEREST_RATE * balance)/12;
     	    	
     	    	
     	    	System.out.println("This months balance is " + balance2);
     	    	
    	    	break;
    	   }
}
}

