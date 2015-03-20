package caloriesburned;
import java.util.Scanner;
import javax.swing.JOptionPane; 
public class CaloriesBurned {

    static Scanner myScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //male variables
        String mage, mweight, mbpm, mmin;
        int Mage, Mweight, Mbpm, Mmin;
        //female variables
        String fage, fweight, fbpm, fmin;
        int Fage, Fweight, Fbpm, Fmin;
        //DEFAULT VARIABLES
        String gender;
        String genderF = "F";
        String genderM = "M";
        
        //CALUATION VARIBLES
        double Calories; 
        double AGE;
        double WEIGHT;
        double HEART;
        double TIME;
        gender = JOptionPane.showInputDialog(null,"Enter you gender \n M = Male \n F = Female ");
        
        if (gender.equals(genderM)){
            
            //asking the user there options    
            mage = JOptionPane.showInputDialog(null,"Enter your age");          
            mweight = JOptionPane.showInputDialog(null,"Enter your weight (lbs):");
            mbpm = JOptionPane.showInputDialog(null,"Enter your heart rate (bpm): ");
            mmin = JOptionPane.showInputDialog(null,"Enter the duration of exercise (in mins)");
            
            //converting the strings into a int
            Mage = Integer.parseInt(mage);
            Mweight = Integer.parseInt(mweight);
            Mbpm = Integer.parseInt(mbpm);
            Mmin = Integer.parseInt(mmin);
            
            AGE = Mage * 0.2017;
            WEIGHT = Mweight * 0.09036;
            HEART = 55.0969-(Mbpm * 0.6309);
            TIME = Mmin/4.184;
            
            Calories = Math.round(AGE - (WEIGHT + (HEART * TIME)));
            
            JOptionPane.showMessageDialog(null,"You burned " +  Calories + " calories.");
     
        }
            else if (gender.equals(genderF)){
               
             //Asking user for info
            fage = JOptionPane.showInputDialog(null,"Enter your age");          
            fweight = JOptionPane.showInputDialog(null,"Enter your weight (lbs):");
            fbpm = JOptionPane.showInputDialog(null,"Enter your heart rate (bpm): ");
            fmin = JOptionPane.showInputDialog(null,"Enter the duration of exercise (in mins)");
            
            Fage = Integer.parseInt(fage);
            Fweight = Integer.parseInt(fweight);
            Fbpm = Integer.parseInt(fbpm);
            Fmin = Integer.parseInt(fmin);
            
            AGE = Fage * 0.074;
            WEIGHT = Fweight * 0.05741;
            HEART = ((Fbpm * 0.4472)-20.4022);
            TIME = Fmin/4.184;
            
            Calories = Math.round(AGE - (WEIGHT + (HEART * TIME)));
            
            JOptionPane.showMessageDialog(null,"You burned" + Calories + "calories.");
            
                 }
        
    }
        
    }
    
