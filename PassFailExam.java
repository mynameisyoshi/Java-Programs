/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gettter;

/**
 *
 * @author n00665092
 */
import java.util.Scanner;

public class PassFailExam extends PassFail{

    private int numQuestion;
    private double eachMark;
    private int numMissed;    
    
    public PassFailExam(int numQuestion) 
    {
        System.out.println("Enter the missing");
        Scanner a = new Scanner(System.in);   
    }

    public PassFailExam(double eachMark) {
        this.eachMark = eachMark;
    }

    public PassFailExam(int numMissed) {
        this.numMissed = numMissed;
    }
    
    
    
}
