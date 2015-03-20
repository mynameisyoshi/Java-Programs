import java.util.Scanner;

public class Count{

public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	
	String s1;
	char s2;
	int count = 0;
 
 	System.out.println("Enter a String");
	s1 = in.nextLine();
	
	System.out.println("The Letter you want a count");
	s2 = in.next().charAt(0);
	
	    for(int i =0; i < s1.length(); i++){
        if(s1.charAt(i) == s2){
            count++;
            }
    }

    System.out.println("The number of letter is " + count);

} 
}	