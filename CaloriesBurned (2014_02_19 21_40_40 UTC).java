package caloriesburned;
import java.util.Scanner;
import javax.swing.JOptionPane; 
public class CaloriesBurned {

    static Scanner myScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //male variables
        String mage, mweight, mbpm, mmin;
        double Mage, Mweight, Mbpm, Mmin;
        //female variables
        String fage, fweight, fbpm, fmin;
        double Fage, Fweight, Fbpm, Fmin;
        //DEFAULT VARIABLES
        String gender;
        String genderF = "Female";
        String genderM = "Male";
        
        gender = JOptionPane.showInputDialog(null,"Enter you gender \n M = Male \n F = Female ");
        
        if (gender.equals(genderM)){
               
            JOptionPane.showMessageDialog(null,"you have entered in Male");  
            
            //asking the user there options    
            mage = JOptionPane.showInputDialog(null,"Enter your age");          
            mweight = JOptionPane.showInputDialog(null,"Enter you weight");
            mbpm = JOptionPane.showInputDialog(null,"Enter your heart rate");
            mmin = JOptionPane.showInputDialog(null,"Enter your heart rate");
            
            //converting the strings into a int
            Mage = Integer.parseInt(mage);
            Mweight = Integer.parseInt(mweight);
            Mbpm = Integer.parseInt(mbpm);
            Mmin = Integer.parseInt(mmin);
 
            else if (gender.equals(genderF)){
             
             JOptionPane.showInputDialog(null,"you have entered in Female"); 
             
             //Asking user for info
             
            fage = JOptionPane.showInputDialog(null,"Female Enter your age");          
            fweight = JOptionPane.showInputDialog(null,"Female Enter you weight");
            fbpm = JOptionPane.showInputDialog(null,"Female Enter your heart rate");
            fmin = JOptionPane.showInputDialog(null,"Female Enter your heart rate");
                 }
            
            else {
                    
                    }
    }
        
    }
    
}
