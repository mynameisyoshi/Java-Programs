import java.util.Scanner;

public class Factorial{

public static void main(String[] args){
	// intializing my varibales
	int n;
	int c = 1;	
	int fact = 1;

	System.out.println("enter the number"); //printing command to enter a number
	Scanner in = new Scanner(System.in); //getting the number
	
	n = in.nextInt(); //taking the input and inputting in the n varible
	
	if( n < 0) //if number is a negative number print error message
		System.out.println("The number cannot be a negative number"); //error message
		
	else //starting for for loop
		for ( c = 1; c <= n ; c++) //for loop begains
			fact = fact * c; //muliplying the number
		
	while (c <= n) {		
	fact = fact * c;
   c++;
	}
	
		System.out.println("Factorial of "+n+" is = "+fact);
		
		}
	}
