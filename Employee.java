

import java.io.*;

public class Employee implements Comparable, Serializable
{
	// variables for Name and Number of Employees
	private String name;			
	private int number;			
	//Constructor to create the superclass
	public Employee(String nom, int number )
	{
		name = nom;
		this.number = number;
	}
	// getters and setters
	public String NameGetter()	
	{ 
		return this.name;
	}
	public Number NumberGetter()
	{ 
		return this.number;
	}
	public void NameSetter(String name)	
	{ 
		this.name = name;
	}
	public void NumberSetter(int number)
	{ 
		this.number = number;
	}
	//compareTo method for comparison of objects
	public int compareTo(Object o)
	{
		 return NameGetter().compareTo(((Employee)o).NameGetter());
	}	
	//toString method for displaying
	public String toString()
	{
		return "," + this.name + "," + this.number;
	}
}
