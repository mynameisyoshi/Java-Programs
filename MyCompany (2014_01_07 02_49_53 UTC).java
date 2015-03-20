


import javax.swing.*;	// JTextField, JPanel, JApplet
import javax.swing.border.TitledBorder;
import java.awt.*;		// GridLayout, FlowLayout, BorderLayout
import java.awt.event.*;	// ActionListener
import java.text.DecimalFormat;
import java.util.*;

public class MyCompany extends JApplet  //CompanyApplet extends JApplet; 
{
	//the Data field
   JPanel Jpanel1, Jpanel2, Jpanel3, Jpanel4, Jpanel5, Jpanel6;
	JButton Clear, Display, Sort, Add , Delete;
	JTextArea Text;
	JScrollPane pane;
	JLabel Name, Number, Territory, Department, Sales, Level;
	JTextField text1, text2, text3, text4, text5, text6;
	JRadioButton radio1, radio2; 	
	ButtonGroup classType;
   AppletIn app;
	LinkedList emp1;
		
	public MyCompany() //My constructor
	{
		emp1 = new LinkedList();
		app = new AppletIn();
	   setLayout(new BorderLayout());
		/*
		  Display buttons in the Panel 
	     like Clear, Display, etc...
		*/ 
		Clear = new JButton("Clear");
		Clear.addActionListener(app);
		Display = new JButton("Display");
		Display.addActionListener(app);
		Sort = new JButton("Sort");
		Sort.addActionListener(app);
		Add = new JButton("Add");
		Add.addActionListener(app);
		Delete = new JButton("Delete");
		Delete.addActionListener(app);
		
		Jpanel1 = new JPanel(new FlowLayout());
		Jpanel1.add(Clear);
		Jpanel1.add(Display);
		Jpanel1.add(Sort);
		Jpanel1.add(Add);
		Jpanel1.add(Delete);
		add(Jpanel1, BorderLayout.NORTH);
		
		/*
			Display the Text Area where the 
		   string is inputed
		*/
		Jpanel2 = new JPanel(new FlowLayout());
		Text = new JTextArea(10, 40);
		pane = new JScrollPane(Text);
		Jpanel2.add(pane);
		add(Jpanel2, BorderLayout.CENTER);
		
		/*
			Display the Labels like Name, Territory, etc..
			Textfield and RadioButton in Panel 
		*/		
		Jpanel3 = new JPanel(new BorderLayout());
		
		Jpanel4 = new JPanel(new FlowLayout());
		
		Name = new JLabel("Name");
		Number = new JLabel("Number");
		
		text1 = new JTextField(15);
		text2 = new JTextField(10);
		
		Jpanel4.add(Name);
		Jpanel4.add(text1);
		Jpanel4.add(Number);
		Jpanel4.add(text2);	
		
		Jpanel3.add(Jpanel4,BorderLayout.NORTH);

		Jpanel5 = new JPanel(new FlowLayout());
		Jpanel5.setPreferredSize(new Dimension(180,130));
		
		radio1 = new JRadioButton("                SalesMan");
		radio1.addActionListener(app);
		Territory = new JLabel("Territory");
		text3 = new JTextField(10);
		Sales = new JLabel("Sales");		
		text4 = new JTextField(10);
				
		Jpanel5.add(radio1);
		Jpanel5.add(Territory);
		Jpanel5.add(text3);
		Jpanel5.add(Sales);
		Jpanel5.add(text4);	
		
		Jpanel3.add(Jpanel5,BorderLayout.WEST);
		
		Jpanel6 = new JPanel(new FlowLayout());
		Jpanel6.setPreferredSize(new Dimension(200,130));
		
		radio2 = new JRadioButton("                Technician");
		radio2.addActionListener(app);
		Department = new JLabel("Department");
		text5 = new JTextField(10);
		Level = new JLabel("Level");		
		text6 = new JTextField(10);
				
		Jpanel6.add(radio2);
		Jpanel6.add(Department);
		Jpanel6.add(text5);
		Jpanel6.add(Level);
		Jpanel6.add(text6);	
		
		Jpanel3.add(Jpanel6,BorderLayout.EAST);

		classType=new ButtonGroup();
		classType.add(radio1);
		classType.add(radio2);		
				
		add(Jpanel3,BorderLayout.SOUTH);
		
		radio1.setSelected(true);      
	   text5.setEditable(false);
		text6.setEditable(false);
		text3.setEditable(true);
		text4.setEditable(true);		 		
	}		
	public static void main(String[] args) //main method
	{
         MyCompany compy = new MyCompany(); 			
	}
	public class AppletIn implements ActionListener //AppletIn implements ActionListener
	{
		/*
			It uses the Clear method, the Add method, etc..
			to modify it in the panel when making the string
			and value and after it as well.
		*/
		public void actionPerformed(ActionEvent event)
		{
				if(event.getSource()==Add)
				{				
				if(radio1.isSelected())
					{
						SalesMan sm = new SalesMan(text1.getText(), Integer.parseInt(text2.getText()), Double.parseDouble(text4.getText()), text3.getText());
						Company.inputEmployee(emp1, sm);
						Company.listdisplay(emp1,Text);						
					}						
				else if(radio2.isSelected())
					{
						Technician sm = new Technician(text1.getText(), Integer.parseInt(text2.getText()), Integer.parseInt(text4.getText()), text3.getText());
						Company.inputEmployee(emp1, sm);
						Company.listdisplay(emp1,Text);						
					}									
				}
				if(event.getSource()==Sort)
				{
					Company.sort_Employees(emp1,Text);
				 	Company.listdisplay(emp1,Text);
				}
				if(event.getSource()==Clear)
				{
					Text.setText("");
				}
				if(event.getSource()==Delete)
				{	
					String str = JOptionPane.showInputDialog(null,"Enter the index you want to remove", "Delete",JOptionPane.PLAIN_MESSAGE);	
					try
					{
						Company.removeEmployee(emp1,Integer.parseInt(str));
					}
					catch(Exception ex){}
					Company.listdisplay(emp1,Text);					
				}
				if(event.getSource()==Display)
				{
					Company.listdisplay(emp1,Text);
				}
				if(event.getSource()==radio1)
				{
					text5.setEditable(false);
					text6.setEditable(false);
					text3.setEditable(true);
					text4.setEditable(true);
				}
				if(event.getSource()==radio2)
				{
					text5.setEditable(true);
					text6.setEditable(true);
					text3.setEditable(false);
					text4.setEditable(false);
				}		
		}	
	}
}