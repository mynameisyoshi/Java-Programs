
public class Technician extends Employee
{
	private String department;
	private int levels;
	
	public Technician()
	{
 		 super("NULL",0000);
  		 levels = 0;
  		 department = new String("null");
	}
	//the constructor
	public Technician(String name, int number, int lvl, String dept)
	{
		super(name, number);
		this.levels = lvl;
		this.department = dept;
	}
	//toString method for displaying
	public String toString()
	{
		return "T" + super.toString() + "," + levels + "," + department + "\n";
	}
	//getters and setters 
	public String GetDept()
	{
		return department;
	}
	public double GetLevel()
	{
		return levels;
	}
		public void SetDept(String depts)
	{
		department = depts;
	}
	public void SetLevel(int lvl)
	{
		levels = lvl;
	}
}