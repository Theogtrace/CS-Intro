import java.util.Scanner;
public class LOOPCF
{
   public static void main(String[] args)
    {
        double res, ex;
        String degrees, ans;

        do
        {
            System.out.println("Enter temperature:");

            Scanner kb = new Scanner(System.in);

            ex = kb.nextDouble();

            System.out.println("Enter C to convert to Celcius or F to Fahrenheit:");

            degrees = kb.next();


            if (degrees.equalsIgnoreCase("C") || degrees.equalsIgnoreCase("c"))

                {
                    res = 5 * (ex - 32) / 9;

                    System.out.println("The temperature converted to Fahrenheit is: " + res);
                }

                else if (degrees.equalsIgnoreCase("F"))

                    {
                    res = (9 * (ex) / 5) + 32;

                    System.out.println("The temperature converted to Celsius is: " + res);

                    }

                else
                    {
                        System.out.println("You have entered invalid entry. Please try again.");
                    }
                System.out.println("Would you want to re run the program? yes/no");
                kb.nextLine();
				ans = kb.nextLine();

        } while (ans.equalsIgnoreCase("yes"));

    }
}
