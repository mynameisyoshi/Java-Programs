
public class SalesMan extends Employee
{
	private String territory;
	private double S_target$;

	public SalesMan()
	{
		super("Joshi",00000);
		S_target$ = 2550.00;
		territory = new String("Peru");
	}
	// the contructor
	public SalesMan(String name, int number, double S_tar$, String terri)
	{
		super(name, number);
		S_target$ = S_tar$;
		territory = terri;
	}
	//toString method for displaying
	public String toString()
	{
		return "S" + super.toString() + "," + S_target$ + "," + territory + "\n";
	}
	// getters and setters 
	public String GetTerro()
	{
		return territory;
	}
	public double GetS_Target()
	{
		return S_target$;
	}
		public void SetTerro(String terro)
	{
		territory = terro;
	}
	public void SetS_Target(double target)
	{
		S_target$ = target;
	}
	public static void main(String []args)//main method
	{	
		//display the message
		System.out.println("-------------------------------------------");
		SalesMan Tar = new SalesMan("Harsh Joshi",5678,999.00,"Department");
		System.out.println(Tar);
		System.out.println("-------------------------------------------");
	}
}