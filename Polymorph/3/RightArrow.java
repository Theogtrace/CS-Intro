package assignment4;

public class RightArrow extends ShapeBase implements ShapeInterface
{
	private int base;
	private int tailLength;

    public RightArrow( )
    {
        super( );
        base = 0;
        tailLength = 0;
    }
    public RightArrow(int theOffset, int theBase)
    {
        super(theOffset);
        base = theBase;
    }
    
	public void set(int newbase) {
		if ((newbase % 2) != 0)
		base = newbase;
		else 
		base = newbase +1;
	}

	
	public void tail(int length) {
		tailLength = length;
		
	}
	public int getTail()
	{
		return tailLength;
	}
	

	public void drawHere() {
		 
		 drawBase();
		
		
	}
	private void drawBase()
	{
		int halfbase = (base + 1)/2;
		int number = 0;
		int insideWidth = 1;
			for (int count = 0; count < (base - 1)/2; count++)
			{
				skipSpaces(getOffset( )); 
			 	skipSpaces(getTail()); 
	            System.out.print('*');
	            if (number > 0)
	            {
	            	skipSpaces(insideWidth);
	            	System.out.println("*");
	            	insideWidth = insideWidth + 2;
	            }
	            else if(number ==0)
	            {
	            	System.out.println();
	            }
	            number ++;
			}
			 skipSpaces(getOffset( )); 
		        for (int count = 0; count < getTail() + 1; count++)
		        {
		            System.out.print('*');
		        }
		        skipSpaces(insideWidth);
		        insideWidth = insideWidth -2;
		        System.out.print('*');
		        System.out.println( );
			for (int count = 0; count < (base - 1)/2; count++)
			{
				skipSpaces(getOffset( )); 
			 	skipSpaces(getTail()); 
	            System.out.print('*');
	            if (number > 0)
	            {
	            	skipSpaces(insideWidth);
	            	System.out.println("*");
	            	insideWidth = insideWidth - 2;
	            }
	            else if(number ==0)
	            {
	            	System.out.println();
	            }
	            number --;
			}
		
	}
	
	 private static void skipSpaces(int number)
	    {
	        for (int count = 0; count < number; count++)
	            System.out.print(' ');
	    }
	
/*
	private void drawHorizontalLine( )
    {
        skipSpaces(getOffset( )); 
        for (int count = 0; count < Length; count++)
            System.out.print('*');
        System.out.println( );        
    }
    */
}
