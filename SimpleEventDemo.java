/**
* First demo of event drive programming
*/
import javax.swing.*;	   // JFrame, JButton, JOptionPane
import java.awt.event.*;	// ActionListener, MouseListener
import java.awt.*;			// FlowLayout

public class SimpleEventDemo extends JFrame
{
	public SimpleEventDemo()
	{
		JButton myButton = new JButton("First");	      // Source object
		setLayout(new FlowLayout());
		add(myButton);
		ActionListener bListener = new MyBListener();	// Listener object
		myButton.addActionListener(bListener);		      // Register listener
		
		MouseListener mListener = new MyMListener();	   // Listener object
		addMouseListener(mListener); 					      // Register listener
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new SimpleEventDemo();
		frame.setTitle("SimpleEventDemo");
		frame.setLocationRelativeTo(null);	//center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(220,80);
		frame.setVisible(true);
	}
}

class MyBListener implements ActionListener	// Listener object of interface
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Button clicked");
	}
}

class MyMListener implements MouseListener	// Listener object of interface
{
	public void mouseReleased(MouseEvent m)
	{  JOptionPane.showMessageDialog(null, "Mouse button released");  }
	public void mousePressed(MouseEvent m){}	// MouseListener is an interface
	public void mouseEntered(MouseEvent m){}	// all abstract methods must be
	public void mouseExited (MouseEvent m){}	// made concrete
	public void mouseClicked(MouseEvent m){}

}