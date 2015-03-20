import java.io.*;
import java.util.*;

public class CarLot implements Cloneable
{
	//adds a car to linklist
	public static void inputCar(LinkedList category, Car ccar)
	{
 		  category.add((Object)ccar);  		
	}
	// adds array of cars to linklist
	public static void inputCar(LinkedList category, Car[] vehicle)
	{
	   int j = 0;
   	for(j = 0; j < vehicle.length; j = j + 1)     
		{                           
	 		  category.add((Object)vehicle[j]);
		}                        
   }
	// it displays a list of elements
	public static void listdisplay(LinkedList category)
	{
   	//System.out.println("\nDisplaying List\n");
  	   int j = 0;  	
		for(j = 0; j < category.size(); j = j + 1)
    	{
        	System.out.println((j+1)+".  "+(Car)category.get(j)); 
    	}                                                                   
	}
	// it displays a list of elements using stack iterators
	public static void Iteratordisplay(LinkedList category2)
	{    
     //System.out.println("\nDisplaying List Iterator\n");
     ListIterator iterator = category2.listIterator(); 
                                                      
     while(iterator.hasNext())
         System.out.println(" " + ((Car)iterator.next()) + "  ");
   }
	// this fuction deletes a car from the list
	public static void removeCar(LinkedList category3)
	{
          listdisplay(category3);
          System.out.println("\n\nEnter index you want to eliminate\n");
          Scanner input = new Scanner(System.in);
          int k = input.nextInt();
          
          try 
			 {       
			   	category3.remove(k-1);     
			 }
			 catch (Exception ex) 
			 {
			   	System.out.println("Array Index Out of Bound");
			 }
          System.out.println("\nElimination");
          listdisplay(category3);
	}
	// this fuction sorts the list
	public static void sort_Cars(LinkedList category4)
	{
       Collections.sort(category4); 
       System.out.println("\nSort");  
       listdisplay(category4);
	}
	// this fuction searches the list using vin number
	public static void VinNumdisplay(LinkedList category5, int vNum)
	{
	   int j = 0;
		for(j = 0; j < category5.size(); j = j + 1)
		{  Car momentary = (Car)category5.get(j); 
		 	if(momentary.getVinNumber() == vNum)
		 	System.out.println(momentary);}

	}
	
	public static void displaytwoCars(LinkedList category6)
	{
	   int k = 0;
 	 	for(k = 0; k < category6.size(); k = k + 1)
  		{
		  int i = 0;
        for(i = k + 1; i < category6.size(); i = i + 1)
     	  {
		  //compares both elements(object) 
	   	if(((Car)category6.get(k)).compareTo(category6.get(i))==0) 
		 	{  // it prints both elements                  
		   	System.out.println("Two equal model cars \n" + (k+1) + "." + (Car)category6.get(k)+"\n(j+1)." + (Car)category6.get(i));
			}
			   else 
					System.out.println("Invalid keep going!");
			     
        }
       }
    }
	 // this function modifies a car
	public static void Modifier(LinkedList category7)
   {
 		 listdisplay(category7);// displays list
  		 System.out.println("\n\nEnter index you want to modify\n"); 
       int k = IO.readInt();
		 // prints out previous value of the variable. New value printed out
		 // and the changing value to verify
       Car momentary = (Car)category7.get(k);
       System.out.println("Input a key to modify");
	    System.out.print("PreModel :" + momentary.getCarModel() + ",\t NewModel :");
	    momentary.setCarModel(IO.readString());
	    System.out.println("Model :" + momentary.getCarModel()); 
	    System.out.print("PreColour :" + momentary.getCarColor() + ",\t NewColour :");
	    momentary.setCarColor(IO.readString());
	    System.out.println("Colour :" + momentary.getCarColor());
	    System.out.print("PreYear :" + momentary.getMakeYear() + ",\t NewYear :");
	    momentary.setMakeYear(IO.readInt());
	    System.out.println("Year :" + momentary.getMakeYear());
	    System.out.print("PreVinNumber :" + momentary.getVinNumber() + ",\t NewVinNumber :");
	    momentary.setVinNumber(IO.readInt());
	    System.out.println("Model :" + momentary.getVinNumber());
	    System.out.print("PrePrice :" + momentary.getCarPrice() + ",\t New Price :");
	    momentary.setCarPrice(IO.readDouble());
	    System.out.println("Model :" + momentary.getCarPrice());
	    System.out.println("\n\nModification\n");
 	    listdisplay(category7);
	 }
	 // display the sum value of cars in the list when price is added 
	public static void totaldisplay(LinkedList category8)
	{  
	   double sum = 0.00;
	   int j = 0;
	   for(j = 0; j < category8.size(); j = j + 1)
		sum+= ((Car)category8.get(j)).getCarPrice();	                                   
	   System.out.println("The Total value of cars in the lot " + sum + "\n"); 
   }
	//this fuction creates a shallow clone of the object
   public static LinkedList ShallowClone(LinkedList category9) throws CloneNotSupportedException
   {
   	 return (LinkedList)category9.clone();
 	}                                      
	// this fuction creates a deep clone of the objects
   public static LinkedList DeepClone(LinkedList category10)
   {
      LinkedList myclone = new LinkedList();
      int k = 0;    
		for(k = 0; k < category10.size(); k = k + 1)
	   {
	     Car momentary = (Car)category10.get(k);
		    try // it trys to shallow clone the element k
		  	 {		  
		    myclone.add((Object)momentary.clone());
		    }
		    catch(CloneNotSupportedException cloneNSE)// if fails, it catches the error
		    {
             System.out.println("Not possible to clone car number " + k);
		    }
	   }
	   return myclone;
   }
}
