public class Undergradute extends Student
{
	private int level; //1 for freshman, 2 for sophomore
	//3 for junior, or 4 for senior.
	public Undergradute()
	{
		super();
		level = 1;
	}
	public Undergradute(String initialName,int initialStudentNumber, int initialLevel)
	{
		super(initialName, initialStudentNumber);
		setLevel(initialLevel); 
	}
	public void reset(String newName, int newStudentNumber,
			int newLevel)
	{
		reset(newName, newStudentNumber); 
		setLevel(newLevel); 
	}
	public int getLevel()
	{
		return level;
	}
	public void setLevel(int newLevel)
	{
		if ((1 <= newLevel) && (newLevel <= 4))
			level = newLevel;
		else
		{
			System.out.println("Illegal level!");
			System.exit(0);
		}
	}
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("StudentLevel: " + level);
	}
	public boolean equals(Undergradute otherUndergraduate)
	{
		return this.hasSameName(otherUndergraduate) &&
				(this.level == otherUndergraduate.level);
	}
}