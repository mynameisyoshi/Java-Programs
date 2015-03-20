import java.io.*;
import java.util.*;

public class UseCarLot 
{
  public static void main(String [] args) throws Exception //main method 
  {
     Car vehicle[] = new Car[5]; // declare and calls the Car class. Array of 5 cars element
	  vehicle[0] = new Car();
	  int k = 0;
	  for(k = 1; k < 5; k = k + 1)
	  { 
	  		System.out.println("Enter model, colour, year, vinNum, price: ");
	    	vehicle[k] = new Car(IO.readString(), IO.readString(), IO.readInt(), IO.readInt(), IO.readDouble());
	  }
	  LinkedList create = new LinkedList();
	  CarLot.inputCar(create, vehicle);// add arrays(5) of cars
	  CarLot.listdisplay(create);//display the list
	  CarLot.Iteratordisplay(create);//display the iterator list
	  CarLot.sort_Cars(create);// sort cars in the list
	  CarLot.removeCar(create);//remove a single car
	  System.out.println("Input the VinNumber");
	  CarLot.VinNumdisplay(create, IO.readInt());
	  CarLot.displaytwoCars(create);// displays the first 2 cars of equal models
	  CarLot.Modifier(create);// modify a car
	  CarLot.totaldisplay(create); // display total value of cars in carlot
	  LinkedList Dpclone = CarLot.DeepClone(create);//creates deep clone
	  System.out.println("Revising DeepClone\n");
	  System.out.println("Standard");
	  CarLot.listdisplay(create);
	  System.out.println("DeepClone");
	  CarLot.listdisplay(Dpclone);
	  if(create == Dpclone)
	  System.out.println("Both objects equal");
	  else
	  System.out.println("Both objects not equal");
	  try
	  {	  
		  LinkedList Shclone = CarLot.ShallowClone(create);
		  System.out.println("Revising ShallowClone\n");
		  System.out.println("Standard");
		  CarLot.listdisplay(create);
		  System.out.println("ShallowClone");
		  CarLot.listdisplay(Shclone);
		  if(create == Shclone)
	     System.out.println("Both objects are equal");
	     else
	     System.out.println("Both objects are not equal");
	  }
	  catch(CloneNotSupportedException cloneNSE)
	  {
	     System.out.println("Not possible to create Shallow Clone");
	  } 

	   
  }
  
}