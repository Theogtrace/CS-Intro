import java.util.Scanner;

public class Program4
{

  public static void main(String[] args)
  {

	  String a;
	  int case_num = 0;
	  Scanner keyboard = new Scanner(System.in);
	  System.out.println("Enter a sentence:");
	  a = keyboard.nextLine();
	  a = a.toLowerCase();

    
	  if (a.indexOf("cat ") == 0 || a.indexOf(" cat") == a.length() - 4   || a.indexOf(" cat ") != -1 )
		  case_num = 1;
	  else if (a.indexOf("dog ") == 0 || a.indexOf(" dog") == a.length() - 4   || a.indexOf(" dog ") != -1 )
		  case_num = 1;
	  else if (a.indexOf("llama ") == 0 || a.indexOf(" llama") == a.length() - 6   || a.indexOf(" llama ") != -1 )
		  case_num = 1;
	  
  
	 
   switch(case_num)       
   {

     case 1:

       System.out.println("profanity in this sentence");

       break;
       
     case 2:
    	 System.out.println("No profanity detected in the Sentence");
    	 break;

     default:

       System.out.println("No profanity detected in the Sentence");

   }

 

  }

}


  }

}
