import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exceptions extends JApplet 
{
   App register = new App();
   
	JRadioButton tarantula, piranha;
	JCheckBox ugly,fat,shortt,hairless;
	JButton cute;
    
	public Exceptions()
	{
		
		    cute = new JButton("cute");		
	        cute.addActionListener(register);
	        
	        
			JPanel panel1 = new JPanel(new FlowLayout());
			JPanel panel2 = new JPanel(new BorderLayout());
			JPanel panel3 = new JPanel(new FlowLayout());
			tarantula = new JRadioButton("tarantula");
			piranha = new JRadioButton("piranha");
			
			ugly = new JCheckBox("ugly");
			fat =new JCheckBox("fat");
			hairless = new JCheckBox("hairless");
			shortt = new JCheckBox("short");
			panel1.add(cute);
			panel1.add(tarantula);
			panel1.add(piranha);
			panel3.add(ugly);
			panel3.add(fat);
			panel3.add(hairless);
			panel3.add(shortt);
			
		    panel2.add(panel1, BorderLayout.NORTH);
		    panel2.add(panel3, BorderLayout.SOUTH);
		    
		    add(panel2, BorderLayout.NORTH);		
			
	}	
	public static void main(String[] args)
	{
		Exception display = new Exception();		
	}
	
	public class App implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{					
					if(event.getSource() == cute)
					{
						JOptionPane.showMessageDialog(null,"Perfect pet,", "perfect pet",JOptionPane.PLAIN_MESSAGE);
					}
				}
			}
}