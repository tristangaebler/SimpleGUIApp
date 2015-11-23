package gui.view;


import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("If you click the button a ghost will come out of your computer");
		firstTextField = new JTextField("Type NOW!!!");
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	/**
	 * Helper method to load all the GUI components into the panel
	 */
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	/**
	 * Helper method for arranging the panel
	 * Dumping ground for layout
	 */
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -3, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 17, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 169, SpringLayout.WEST, this);
		firstButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setUpListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("The force is strong with this one");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			
			public void mouseExited(MouseEvent exited)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
		});
	}
}








