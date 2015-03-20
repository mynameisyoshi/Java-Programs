import java.io.*;
import java.util.*;

public class Car implements Comparable, Cloneable 
{
		private String carColor, carModel;
		private int vinNumber, makeYear;
		private double carPrice;

	public Car(String model, String color, int mYear, int vNum, double price) //my constructor
	{
 		  this.carModel = model;
		  this.carColor = color;
		  this.makeYear = mYear;
		  this.vinNumber = vNum;
		  this.carPrice = price;
	}
	public Car() // a default constructor
	{
 		  this("Go Kart","red",1989,78923,500.00);
	}

   // setters for all the private variable
	public void setCarColor(String carColor) 
	{
		this.carColor = carColor;
	}
	public void setCarModel(String carModel)
	{
		this.carModel = carModel;
	}
	public void setVinNumber(int vinNumber)
	{	
		this.vinNumber = vinNumber;
	}
	public void setMakeYear(int makeYear)
	{
		this.makeYear = makeYear;
	}
	public void setCarPrice(double carPrice)
	{
		this.carPrice = carPrice;

   }
	// getters for all the private variable
	public String getCarColor()
	{
		return carColor;
	}
	public String getCarModel()
	{
		return carModel;
	}
	public int getVinNumber()
	{
		return vinNumber;
	}
	public int getMakeYear()
	{
		return makeYear;
	}
	public double getCarPrice()
	{
		return carPrice;
	}

	public String toString() // Displays this fuction when it is called by System.out
	{
		return "Model: " + carModel + "\tcolour:" + carColor + "\tyear: " + makeYear +
             "\tVin number: " + vinNumber + " \tprice :" + carPrice;
   }
   public int compareTo(Object obj) // to sort cars
	{ 
		return getCarModel().compareTo(((Car)obj).getCarModel());
	}
	// Uses shallow clone and throws exception as well
	public Car clone() throws CloneNotSupportedException
	{
		return (Car)super.clone();
	}

}
