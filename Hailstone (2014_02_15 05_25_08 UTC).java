import java.util.Scanner;
public class HailStone {
    static Scanner MyScanner = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("This program will generate the HailStone sequence. ");
            System.out.println("Enter a number: ");
            int num = MyScanner.nextInt();    //Taking input from user
            while(num>1)
            {
                if (num%2 == 0)
                {
                    num /= 2; //Dividing num by 2 if it is even
                    System.out.print(num+"\t");
                }
                else
                {
                    num = (num*3)+ 1;    // Adding num*3 + 1 to num if the num is odd
                    System.out.print(num+"\t");
                }
            }
    }
 
}