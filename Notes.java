import java.text.DecimalFormat; //import DecimalFormat Class 


public class Notes
{
	
	/**declare C, freq, and chords to stay in this file */
	private double middleC; // value variable
	private double frequencies[] = new double[13];   // reference variable with declaration
	private String chords[] = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C"}; // reference variable
	
	public Notes(double midc)  // This is my constructor
	{
		while(midc>270.00||midc<250.00)  
        {
            System.out.println("Enter value between(250.00 - 270.00).\n Please try again");
            midc = IO.readDouble();
        }

		middleC = midc;
	
	}
	public Notes() // Constructor with default frequencies
	{
		this(260.00);
	}
	public void setMiddleC(double midC) // set my middle C
	{
		while(midC>270.00||midC<250.00)
        {
            System.out.println("Enter value between(250.00 - 270.00).\n Please try again");
            midC = IO.readDouble();
        }

		middleC = midC;
		
	}
	public String[] getchords()
	{
		return chords;
	}
	public double[] getFrequency()
	{
		return frequencies;
	}
	public void calculator()  // calculates to get the frequencies and notes in the array
	{
		int i=0;
		int j=0;	
		while(i<13)
		{
			frequencies[i]=middleC*Math.pow(2.00,j/12.00);
			i++;
			j++;		
		}
			
	}
	public void display()    // display the value in the console window
	{
		DecimalFormat format = new DecimalFormat("#0.000");
		System.out.println("NOTES\tFREQUENCY\t");
		int y=0;
		while(y<=12)
			{
				System.out.println(chords[y]+"\t"+format.format(frequencies[y])+"Hz");
				y++;
			}
	}
	public double linearsearch(String str)  // search function to retrieve a particular note frequency 
														 // by the name which can be entered in upper or lower case 
	{															
        int y=0;
        while(y<=12)
        {
            if(str.compareToIgnoreCase(chords[y])==0) // compare strings in the notes
            return frequencies[y];
            y++;
        }
        System.out.println("Invalid note\n");
        return 0;
    }
	public static void main(String []args) // the main method
    {
        DecimalFormat format = new DecimalFormat("#0.000");
        Notes chords=new Notes(265.00); // create an object of this class then call necessary methods
        chords.calculator();  // call necessary methods
        chords.display();    // call necessary methods
        
        System.out.println("\nFinding G\n");   // display the string
        
        double lo=chords.linearsearch("G");  // search the frequency of note G
        if(lo!=0)        
        System.out.println(format.format(lo));  // display the frequency of note G
        
        System.out.println("\nGetting arrays\n");  // display the string
        
        double freq[] = chords.getFrequency();  
        String notes[] = chords.getchords();
        int x=0;
        while(x<=12)
        {
           System.out.println(notes[x]+"\t"+format.format(freq[x])+"Hz");
           x++;
        }
        
        System.out.println("\nSetting middle C to 255.00Hz\n");  // display the string
        chords.setMiddleC(255.00); // call necessary methods
        chords.calculator();    // call necessary methods
        chords.display();		// call necessary methods        
    }            
}

	