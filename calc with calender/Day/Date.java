import java.util.Scanner;
public class Date 
{	
	public static void main(String[] args)
    {
        Date clerk = new Date( );

        try
        {
            System.out.println("Enter Data starting with MM/DD:");
            clerk.RunCalander();
        }
        catch(MonthException e)
        {
            clerk.handleMonthException(e);
        }
        catch(DayException e)
        {
            clerk.handleDayException(e);
        }
    }

    private void RunCalander() throws MonthException,DayException
    {
        String NameofMonth ="";
        Scanner keyboard = new Scanner(System.in);
        String thedata = keyboard.next();
        String delimiter = "/";
        String [] datasplit = thedata.split(delimiter);
        int month = Integer.parseInt(datasplit[0]);
        int day = Integer.parseInt(datasplit[1]);
        if(month > 12)
        {
            throw new MonthException();
        }
        if(day > 31)
        {
            throw new DayException();
        }
        else
        {
            NameofMonth = testData(month, day);
            System.out.println(""+ NameofMonth +" "+ day);
        }


    }
    public String testData(int x, int y) throws MonthException,DayException
    {
        String Realmonth ="";
        switch(x)
        {
        case 1:
            Realmonth = "January";
            break;
        case 2:
            if(y > 28)
            {
                System.out.println("February is only 28 days");
                throw new DayException();
            }
            else
            {
                Realmonth = "February";
            }
            break;
        case 3:
            Realmonth = "March";
            break;
        case 4:
            if(y > 30)
            {
                System.out.println("April is only 30 days");
                throw new DayException();
            }
            else
            {
                Realmonth = "April";
            }
            break;
        case 5:
            Realmonth = "May";
            break;
        case 6:
            if(y > 30)
            {
                System.out.println("June is only 30 days");
                throw new DayException();
            }
            else
            {
                Realmonth = "June";
            }
            break;
        case 7:
            Realmonth = "July";
            break;
        case 8:
            Realmonth = "August";
            break;
        case 9:
            if(y > 30)
            {
                System.out.println("September is only 30 days");
                throw new DayException();
            }
            else
            {
                Realmonth = "September";
            }
            break;
        case 10:
            Realmonth = "October";
            break;
        case 11:
            if(y > 30)
            {
                System.out.println("November is only 30 days");
                throw new DayException();
            }
            else
            {
                Realmonth = "November";
            }
            break;
        case 12:
            Realmonth = "December";
            break;
        }
        return Realmonth;
    }
    public void handleMonthException(MonthException e)
    {
        System.out.println(e.getMessage( ));
        System.out.println("Try again from the beginning:");
    }
    public void handleDayException(DayException e)
    {
        System.out.println(e.getMessage( ));
        System.out.println("Try again from the beginning:");
    }
}