import java.io.*;
import java.util.*;
import javax.swing.*;
public class Company implements Cloneable
{
	//adds a car to linklist
	public static void inputEmployee(LinkedList category, Employee emp)
	{
 		  category.add((Object)emp);  		
	}
	// adds array of cars to linklist
	public static void inputEmployee(LinkedList category, Employee[] emp)
	{
	   int j = 0;
   	for(j = 0; j < emp.length; j = j + 1)     
		{                           
	 		  category.add((Object)emp[j]);
		}                        
   }
	// it displays a list of elements
	public static void listdisplay(LinkedList category, JTextArea jta)
	{
      jta.setText("");
		jta.append("\nDisplaying List\n");
  	   int j = 0;  	
		for(j = 0; j < category.size(); j = j + 1)
    	{
        	jta.append((j+1)+".  "+((Employee)category.get(j)).toString()); 
    	}                                                                   
	}
		// this fuction deletes a car from the list
	public static void removeEmployee(LinkedList category3, int a)throws Exception
	{
        category3.remove(a-1);     				         
	}
	// this fuction sorts the list
	public static void sort_Employees(LinkedList category4, JTextArea jta2)
	{
       Collections.sort(category4);        
	}
}