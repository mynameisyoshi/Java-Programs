import java.util.LinkedList ;
import java.util.ListIterator;
import java.util.*;

public class StacksAndQueues
{	
	/*
		Loads an array of String objects into 
		a LinkedList starting with array[0]
	*/
	public LinkedList loadobject(Object[] length1)
	{
  		 LinkedList catalog = new LinkedList();
    	 int i = 0;
		 for(i = 0; i < length1.length; i = i + 1)
    		{
     			   catalog.add(length1[i]);
    		}
    	 return catalog;
   }
 	/* Displays a list of variables as a Stack from last to first*/
	public void display_liststack(LinkedList stack)
	{
   	 int i = 0; 	 
		 for(i = stack.size() - 1; i >= 0; i = i - 1)
 		   {
      		  System.out.println((stack.size() - 1) + ".  " + stack.get(i));
		   }  
	}
    // Displays a list of variables as a Queue from first to last
	public void display_listqueue(LinkedList queue)
	{
    	 int i = 0;
	 	 for(i = 0; i < queue.size(); i = i + 1)
    		{
      		  System.out.println((i+1) + ".  " + queue.get(i));
    		}  
	}
	 // Displays list iterator of variable as a Stack from first to last
	public void display_iterateQ(LinkedList forward)
	{
       ListIterator iterator1 = forward.listIterator();
       while(iterator1.hasNext())
               System.out.print( " " + iterator1.next() + "  " );
	}
	 // Displays list iterator of variable as a Queue fro last to first
	public void display_iterateS(LinkedList reverse)
   { 
      ListIterator iterator2 = reverse.listIterator(reverse.size());
      while(iterator2.hasPrevious())
               System.out.print( " " + iterator2.previous() + "  " );
	}
	 /* 
	    loads string from the keyboard into the linklist 
		 then display it.
	 */ 
	public LinkedList scancatolog()
	{            
		  Scanner keyboard_1 = new Scanner(System.in);   
        System.out.println("Input a number of strings to be entered");
		  int number;
        number = keyboard_1.nextInt();
        System.out.println();	       
        String length[] = new String[number];        
    	  System.out.println();    
		  System.out.println("Input String(s)\n");
		  int string = 0;
        for(string = 0; string < number; string = string + 1)
        length[string] = keyboard_1.next();
        return loadobject((Object[])length);
              
	}
	  /* 
	     Displays a list of strings then the users chooses which
	  	  element to remove then displays again.
	  */ 
	public void remove_element(LinkedList eliminate)
	{		 
			 System.out.println("STRINGS");
			 System.out.println();
          display_listqueue(eliminate);
          System.out.println();
			 System.out.println("---------------------------");
          System.out.println("Enter index you want to eliminate");
          Scanner keyboard_2=new Scanner(System.in);
          int element;
			 element = keyboard_2.nextInt();
          eliminate.remove(element = element - 1);     
          System.out.println();
			 System.out.println("---------------------------");
          System.out.println("Selected index eliminated");
          display_listqueue(eliminate);

	}
    // Sort the linklist then displays it.
	public void sort_linkedlist(LinkedList sort_order)
	{
       Collections.sort(sort_order);
   	 System.out.println();    
       display_listqueue(sort_order);      
	}
}