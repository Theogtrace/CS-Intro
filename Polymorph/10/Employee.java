public class Employee extends Person
{
	protected int ID;
	private String Dep;
	public Employee()
	{
		super();
		ID = 0;
		Dep = "No Dep yet";
		
	}
	public Employee(String initialName, int initialID, String initialDep)
	{
		super(initialName);
		ID = initialID;
		Dep = initialDep;
	}
	public void setName(String newName, int newID, String newDep)
	{
		setName(newName);
		ID = newID;
		Dep = newDep;
	}
	public int getID()
	{
		return ID;
	}
	public String getDep()
	{
		return Dep;
	}
	public void writeOutput()
	{
		System.out.println("Name: " + getName());
		System.out.println("ID: " + ID);
		System.out.println("Department: " + Dep);
	}
	
	public boolean equals(Employee otherEmployee)
	{
		return this.hasSameName(otherEmployee) &&
				(this.ID == otherEmployee.ID);
	}
}