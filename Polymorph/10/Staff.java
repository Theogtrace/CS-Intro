public class Staff extends Faculty
{
	private int Pay;
	public Staff()
	{
		super();
		Pay = 1;
	}
	public Staff(String initialName, int initialID, String initialDep, String initialTitle, int initialPay)
	{
		super(initialName, initialID, initialDep, initialTitle);
		setPay(initialPay);
		
	}
	public void reset(String newName, int newID, String newDep, String newTitle, int newPay)
	{
		reset(newName, newID, newDep, newTitle);
		setPay(newPay);
		
	}
	public int getPay()
	{
		return Pay;
	}
	public void setPay(int newPay)
	{
		if ((1 <= newPay) && (newPay <= 20))
			Pay = newPay;
		else
		{
			System.out.println("Illegal Pay!");
			System.exit(0);
		}
	}
	public void writeOutput()
	{
		System.out.println("Name: " + getName());
		System.out.println("Employee ID: " + getID());
		System.out.println("Employee Department: " + getDep());
		System.out.println("Employee Title: " + getTitle());
		System.out.println("Employee Pay: " + Pay);
	}
	public boolean equals(Staff otherStaff)
	{
		return this.hasSameName(otherStaff) &&
				(this.ID == otherStaff.ID);
	}
}