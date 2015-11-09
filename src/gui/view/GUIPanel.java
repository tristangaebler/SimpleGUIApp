package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import gui.controller.GUIController;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		setUpPanel();
		setUpLayout();
		setUpListeners();
	}
	
	private void setUpPanel()
	{
		
	}
	
	private void setUpLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		
	}
}
