public class PersonDemo
{
	public static void main(String[] args)
	{
		Person brother = new Person( );
		Person sister = new Person( );
		Person mother = new Person( );
		Person newPerson;
		System.out.println("Enter brothers information.");
		brother.readPersonData( );
		System.out.println("Enter sisters information.");
		sister.readPersonData( );
		System.out.println("Enter mothers information.");
		mother.readPersonData( );
		
		System.out.println("Your sisters name is " + sister);
		if(sister.equals(mother))
		{
			System.out.println("Your sisters name is the same as your mothers name!" );
		}
		else
		{
			System.out.println("Your sisters name is not the same as your mothers name!" );
		}
		if((mother.getAge()) == (sister.getAge())) 
		{
			System.out.println("Your Mother's age can't be the same as your sisters.");
		}
		if((brother.getAge()) >  (sister.getAge())) 
		{
			System.out.println("Your brother is older then your sister");
		}
		if((brother.getAge()) <  (sister.getAge())) 
		{
			System.out.println("Your sister is older then your brother");
		}
		if((brother.getAge()) ==  (sister.getAge())) 
		{
			System.out.println("Your brother and sister are the same age");
		}
		
		


	}
}