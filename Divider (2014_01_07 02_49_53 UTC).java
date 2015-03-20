// this program calculates the voltage between two resistors using the voltage divider method
import java.io.*;

public class Divider
{
    private double VTOP;
    private double VBOTTOM;
    private double RTOP;
    private double RBOTTOM;
    private double VOUT;
	private double Icurrent;
	private double VRB;
    
     public static void main(String[] args)
    { 
      Divider results = new Divider(10, -10, 15000, 5000);
      
      results.calculate();
      results.display();
      results.setVTOP(-10);
      results.setVBOTTOM(10);
      results.setrTOP(5000);
      results.setrBOTTOM(15000);         
      results.calculate();
      results.display();
    }
    
    Divider(double v1, double v2, double r1, double r2)
    {
       VTOP = v1;
       VBOTTOM = v2;
       RBOTTOM = r2;
       RTOP = r1;
    } 
   
   // this method calculates the voltage between the top and bottom resistors
    void calculate()
    {
    
       Icurrent = (RBOTTOM+RTOP) / (VTOP-VBOTTOM);
		VRB = Icurrent * RBOTTOM;
		VOUT = VBOTTOM + VRB;
          
    }
     //this method inputs variables

    void setVTOP(double v1)
    {
       VTOP = v1;
       
    } 
     void setVBOTTOM(double v2)
     {
       VBOTTOM = v2;
     }
     
     void setrTOP(double r1)
     {
       RTOP = r1;
     }
      
     void setrBOTTOM(double r2)
      {
        RBOTTOM = r2;
      }
 

    // this method displays the results 
   void display()
   {
   
    System.out.print("the  results are: " +VOUT+ "V");
    
   }
} 