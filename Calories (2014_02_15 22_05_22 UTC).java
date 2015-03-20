/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calories;
import java.util.Scanner;
public class Calories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputString;
 		String foodItem;
 		Double fatGrams;
 		Double carbGrams;
 		Double proteinGrams;
 		Double totalCalories;
 		Double percentFat;
 		Double fatCal;
 		Double carbCal;
 		Double proteinCal;
 		
 		Scanner keyboard = new Scanner(System.in);
 		
 		System.out.print("What is the food item?");
 		foodItem = keyboard.nextLine();
 		
 		System.out.print("What are the grams of fat of " + foodItem + "?");
 		fatGrams = keyboard.nextDouble();
 		
 		System.out.print("What are the grams of carbs of " + foodItem + "?");
 		carbGrams = keyboard.nextDouble();
 		
 		System.out.print("What are the grams of protein of " + foodItem + "?");
 		proteinGrams = keyboard.nextDouble();
 		
 		fatCal = fatGrams * 9;
 		carbCal = carbGrams * 4;
 		proteinCal = proteinGrams * 4;
 		
 		totalCalories = fatCal + carbCal + proteinCal;
 		
 		percentFat = (fatCal / totalCalories) * 100;
 		
 		System.out.println("Total Calories of " + foodItem + " are " + totalCalories + ".");
 		System.out.println("Total Fat Calories of " + foodItem + " are " + fatCal + ".");
 		System.out.println("Total Percentage of fat is " + percentFat + "%.");
    }
    
}
