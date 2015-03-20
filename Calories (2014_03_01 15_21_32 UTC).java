package calories;
import java.util.Scanner;
import javax.swing.JOptionPane; 
public class Calories {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

 		String foodItem, foodWeight, foodFat, foodCarbs, foodProp;
 		int FoodWeight;
 		int FoodCarbs;
                int FoodFat;
 		int FoodProp;
		int TotalCalories;
                int totalCarbs;
                int totalfat;
                int totalprop;
                
 		
 		//Gets the input
 		foodItem = JOptionPane.showInputDialog(null,"What is the food item?");
 		foodWeight = JOptionPane.showInputDialog(null,"Enter the weight of the dish (in grams)");
 		foodFat = JOptionPane.showInputDialog(null, "Enter the presentage of fat (without the % sign):");	
		foodCarbs = JOptionPane.showInputDialog(null, "Enter the presentage of carbohydrates (without the % sign):");		
                foodProp = JOptionPane.showInputDialog(null, "Enter the presentage of protein (without the % sign):");
		
                //convert string into int values
                FoodWeight = Integer.parseInt(foodWeight);
                FoodCarbs = Integer.parseInt(foodCarbs);
                FoodFat = Integer.parseInt(foodFat);
                FoodProp = Integer.parseInt(foodProp);
                
                totalfat = FoodFat * 9;
                totalCarbs = FoodCarbs * 4;
                totalprop = FoodProp * 4;
                TotalCalories = (totalfat + totalCarbs + totalprop);
                
                
                
                JOptionPane.showMessageDialog(null,"The food is "+ foodItem + "\n Weight of the dish " + FoodWeight + " grams \n Calculated calories in the dish is: " + TotalCalories);
    }
    
}
