import java.text.DecimalFormat;   // Import DecimalFormat Class

public class UseNotes
{
   
    public UseNotes(){}   // A default constructor
   
    public static void main(String[] args)  // main method
    {
        DecimalFormat format = new DecimalFormat("#0.000"); // Declare and call function      
        Notes chords = new Notes();  // Declare and constructor for Notes
        chords.calculator();  // called Notes class to read calculator
        chords.display();     // called Notes class to read display
        
        String choice = new String();  //Declare string
        System.out.println("-------------------------------------------------"); // display string
        do
        {	// display string below
	        System.out.println("\nEnter a new number for Middle C......Dont enter hertz(Hz)");
	        double specialC = IO.readDouble();   // declare and assign IO class to read Double
	        chords.setMiddleC(specialC);  // call Notes class to read setMiddleC with an array
	        
	        chords.calculator();  // called Notes class to read calculator
	        chords.display();    // called Notes class to read display
			  
	        System.out.println("-------------------------------------------------"); //new line
	        
			  System.out.println("Enter tone to search \n");  //display string
	        String notes = IO.readString();   // declare and assign to IO class to read String
			  
	        double li=chords.linearsearch(notes);  // assign to Notes Class to read linearsearch
	        if(li!=0)
	        System.out.println("Value of "+notes+" note is "+format.format(li)+"\n"); // display string and value
	        
			  System.out.println("-------------------------------------------------"); // new line
			  
	        System.out.println("Enter C to continue or X to exit\n"); // display string
	        choice=IO.readString();  // declare and assign IO class to read String
        
		  	  while(choice.compareToIgnoreCase("C")==0);  //exit or continue function
        
    }
}
