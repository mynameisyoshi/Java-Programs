import java.util.LinkedList ;  // import Linklist class
import java.util.ListIterator;  // import ListIterator class

public class UseStacksAndQueues 
{
	public static void main(String[] args) // main method
	{
   	StacksAndQueues StnQue = new StacksAndQueues();  //declare and constructor for StackAndQueues 
      String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday","Sunday"}; // reference variable
      LinkedList Alist = new LinkedList();  // declare and call function
      LinkedList Nlist = new LinkedList(); // declare and call function
		
		// declare and assign StackAndQueues class to read loadobject with an array
		Alist = StnQue.loadobject((Object[])days);   
		System.out.println("---------------------------"); // displays this		
		System.out.println("The List of Stacks");
		StnQue.display_liststack(Alist);  // calls StackAndQueues to read display_liststack with an array
      System.out.println("---------------------------");
		System.out.println("The List of Queues");
		StnQue.display_listqueue(Alist);  // calls StackAndQueues to read display_listqueue with an array
  		System.out.println("---------------------------");
		System.out.println("The ListIterator of Stacks");
		StnQue.display_iterateS(Alist);  // calls StackAndQueues to read display_iterateS with an array
		System.out.println();  // new line
  		System.out.println("---------------------------");
		System.out.println("The ListIterator of Queues");   
		StnQue.display_iterateQ(Alist);  // calls StackAndQueues to read display_iterateQ with an array
		System.out.println();  // new line
		System.out.println("---------------------------");
		Nlist = StnQue.scancatolog();  // declare and assign StackAndQueues class to read scancatolog
  		System.out.println("---------------------------");    
		StnQue.remove_element(Nlist);  // calls StackAndQueues to read remove_element with an array
  		System.out.println("---------------------------");
		System.out.println("Sorting");    
		StnQue.sort_linkedlist(Nlist);  // calls StackAndQueues to read sort_linkedlist with an array
	}
}