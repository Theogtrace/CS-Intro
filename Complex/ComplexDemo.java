
public class ComplexDemo
{
	public static void main(String[] args) 
	{
		Complex c = new Complex(4,  5);
		Complex d = new Complex(3, -2);
		System.out.println ("First ComplexNumber number: " + c); 
		System.out.println ("Second ComplexNumber number: " + d); 
		if (c.equals(d)) 
			System.out.println ("cn1 and cn2 are equal."); 
		else 
			System.out.println ("cn1 and cn2 are NOT equal."); 
		System.out.println(c + " + " + d + " = " + c.add(d));
		System.out.println(c + " - " + d + " = " + c.subtract(d));
		System.out.println(c + " * " + d + " = " + c.multiply(d));
		System.out.println(c + " / " + d + " = " + c.divide(d));

	}
}

