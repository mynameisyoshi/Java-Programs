/*
Project Name: UseRecord
Use Record class to test the Record class.

*/

 import java.util.Arrays;  // import Arrays class
 import java.util.*;  // import everything in util class
 
 public class UseRecords
 {
 	public static void main(String []args)  // main method
    {
	 	  // declare and constructor for Record with an array
		  Record loadlist[] = new Record[5];  
        int i = 0;
        for(i = 0; i < 5; i = i + 1) 
        { // picks a random number from 0 to 20 and rounds it off.
            loadlist[i] = new Record((int)Math.round(Math.random()*20)); 
		  }
        
		  System.out.println();  // new line      
		  for(i = 0; i < 5; i = i + 1)   
        		System.out.println(loadlist[i]);  // displays 5 random number 
        
		  System.out.println("---------------------------");
        Arrays.sort((Object[])loadlist); // sorts the list of the 5 random numbers 
		  System.out.println("RANDOM VALUES");
		  LinkedList list = new LinkedList(); // declare and call function
		  System.out.println();  // new line
		  for(i = 0; i < 5; i = i + 1)  
        list.add(loadlist[i]);  //loads the list of the 5 random numbers 
		  System.out.println();
		  for(i = 0; i < 5; i = i + 1)
		  // displays the list of the 5 random numbers
		  System.out.println(((Record)list.get(i)).getvalue());     
		  int sum = 0;
		  for(i = 0; i < 5; i = i + 1)
		  sum += ((Record)list.get(i)).getvalue(); // sums up the 5 values
		  System.out.println();  // new line
		  System.out.println("---------------------------");
		  System.out.println("The Sum is = " + sum); // displays the results						
   	  System.out.println("---------------------------");
		  System.out.println();  // new line
		  for(int k = 0; k < 5; k = k + 1)
		  {
		    for(int j = k + 1; j < 5; j = j + 1) 
				{
						if(loadlist[k].compareTo(loadlist[j])==0)  // Compares two values
							// displays each value
							System.out.println("Index " + (k+1) + " matches Index " + (j+1));  
		      }
		  }
	  }
}
  
