import java.io.*;
import java.util.*;

public class Menu
{
	// display the Menu of choices
	public static int choiceMenu()
	{   
		System.out.println("\n\n\nMenu");
		System.out.println("1.Vehicle addition");
		System.out.println("2.Display VehicleList");
		System.out.println("3.Display VehicleList Iteration");
		System.out.println("4.Remove Vehicle");
		System.out.println("5.Sort Vehicle");
		System.out.println("6.Display Vehicle using VinNumber");
		System.out.println("7.Display the first two Vehicle with the same model");
		System.out.println("8.Car Modifier");
		System.out.println("9.Show the total");
		System.out.println("10.ShallowClone");
		System.out.println("11.DeepClone");
		System.out.println("12.Cars addition from the file");
		System.out.println("13.Close");
		return IO.readInt();
	}// it checks if 2 objects are the same or not
	public static void Revise(LinkedList origin, LinkedList thecopy)
	{
       if(origin == thecopy)
	    System.out.println("Both objects are equal");
	    else
	    System.out.println("Both objects are not equal");

	}// Uses the CarLot class	
	public static void main(String []args)throws Exception
	{
		int j = 0;
		Car vehicle[] = new Car[5];
		vehicle[0] = new Car();  
  	   int i = 0;	   
		for(i = 1; i < 5; i = i + 1)
	   {  // Creates an array of cars
			System.out.println("Enter model, colour, year, vinNum, price: ");	
			vehicle[i] = new Car(IO.readString(), IO.readString(), IO.readInt(), IO.readInt(), IO.readDouble());  
	   }
		LinkedList create = new LinkedList();
 	   while (true)
	   {
	     j = choiceMenu(); // displays a menu and stores it in j element
		  switch(j)
		  {
			 case 1: 
			 System.out.println("\n\nInput CarModel, CarColour, Year, VinNumber and CarPrice\n");
	       //create a new car and add to the list    
			 CarLot.inputCar(create, new Car(IO.readString(), IO.readString(), IO.readInt(), IO.readInt(), IO.readDouble()));
			 break;
				
			 case 2: 
			 CarLot.listdisplay(create);// it displays the linklist
		    break;
						  
		    case 3: 
			 CarLot.Iteratordisplay(create);// it displays the car iterator list
		    break;
						  
			 case 4: 
			 CarLot.removeCar(create);// removes a specific car
			 break;
						  
			 case 5: 
			 CarLot.sort_Cars(create);// sorts the list
			 break;
						  
			 case 6: 
			 System.out.println("Input VinNumber to search");
			 //Search the carlist for VinNumber
		    CarLot.VinNumdisplay(create, IO.readInt());
			 break;
						  
			 case 7:
			 //displays the first two car equal model number 
			 CarLot.displaytwoCars(create);
		    break;
						  
		    case 8: 
			 CarLot.Modifier(create);//modify a car
			 break;
				
			 case 9: 
			 //display the total cost of cars in carlot
			 CarLot.totaldisplay(create);
		    break;
			 
			 case 10: 
			 try //try to create shallowClone 
		    {
		       LinkedList Shclone = CarLot.ShallowClone(create);
				 CarLot.listdisplay(Shclone);
				 Revise(create,Shclone);
		    }
			 catch(Exception ex)//if an error, display the following
			 {
				 System.out.println("Cannot Make shallow clone");
			 }         
			 break;
							
			 case 11: 
			 //create deepclone
			 LinkedList dpclone = CarLot.DeepClone(create);
		    CarLot.listdisplay(create);// display deepclone list
		    Revise(create,dpclone);//check if it's deepclone
			 break;
							
			 case 12:
			 //add arrays of cars 
			 CarLot.inputCar(create, vehicle);
			 //show the list of cars
			 CarLot.listdisplay(create);
			 break;
							
			 case 13:
			 return;//exit
			 default :System.out.println("Invalid");
			}
	  }
   }
}