import java.util.Scanner;
public class Pr2
{
   public static void main(String[] args)
    {
        double degrees, temp;
        String a, ans;

        do
        {
            System.out.println("Enter temperature:");

            Scanner keyboard = new Scanner(System.in);

            temp = keyboard.nextDouble();

            System.out.println("Enter C to convert to Celcius or F to Fahrenheit:");

            a = keyboard.next();


            if (a.equalsIgnoreCase("C"))

                {
                    degrees = 5 * (temp - 32) / 9;

                    System.out.println("The temperature converted to Fahrenheit is: " + degrees);
                }

                else if (a.equalsIgnoreCase("F"))

                    {
                    degrees = (9 * (temp) / 5) + 32;

                    System.out.println("The temperature converted to Celsius is: " + degrees);

                    }

                else
                    {
                        System.out.println("You have entered invalid entry. Please try again.");
                    }
                System.out.println("Would you want to re run the program? yes or no");
                keyboard.nextLine();
				ans = keyboard.nextLine();

        } while (ans.equalsIgnoreCase("yes"));

    }
}
