/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gettter;

/**
 *
 * @author n00665092
 */
public class ClassA {
   
    public ClassA() {
       
    }

    public String getGrade(int mark)
    {
        if (mark >= 90)
        {
            return "A";
        }
        
        if (mark >= 80)
        {
            return "B";
        }
        
        if (mark >= 70)
        {
            return "C";
        }
        
        if (mark >= 60)
        {
            return "D";
        }
        
        if (mark < 60)
        {
            return "F";
        }
        
        else return null;
    }
    
}
