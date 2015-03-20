/*
Project Name: Record
Record class sorts arrays and prints them.

*/

import java.util.*;  // import everything in util class

public class Record implements Comparable  // implements the Comparable interface
{
	private int value; // declare the varaible
	
	public Record(int y) // my constructor 
	{
		value = y;
	}
	
	public Record() // my contructor with default number
	{
		this(20);
	}
	
	public void setb(int x)
	{
		this.value = x;
	}
	public int getvalue()
	{
		return value;
	}
	public String toString() // return string representation of this object  
	{
		return "The integer value = " + value;
	}
	
	//Implement the compareTo method define in Comparable
	public int compareTo(Object o)  
	{
		if (getvalue() > ((Record)o).getvalue())
			return 1;	//greater than
		else if  (getvalue() < ((Record)o).getvalue())
			return -1;	// less than
		else
			return 0;	//equal
	}
}	