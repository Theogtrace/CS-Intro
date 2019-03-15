public class Faculty extends Employee
{
	private String Title;
	public Faculty()
	{
		super();
		Title = "No title yet";
	}
	public Faculty(String initialName, int initialID, String initialDep, String initialTitle)
	{
		super(initialName, initialID, initialDep);
		Title = initialTitle;
		
	}
	public void reset(String newName, int newID, String newDep, String newTitle)
	{
		setName(newName, newID, newDep);
		Title = newTitle;
	}
	public String getTitle()
	{
		return Title;
	}
	public void setTitle(String newTitle)
	{
		Title = newTitle;
	}
	public void writeOutput()
	{
		System.out.println("Name: " + getName());
		System.out.println("Employee ID: " + getID());
		System.out.println("Employee Department: " + getDep());
		System.out.println("Employee Title: " + Title);
	}
	public boolean equals(Employee otherEmployee)
	{
		return this.hasSameName(otherEmployee) &&
				(this.ID == otherEmployee.ID);
	}
}