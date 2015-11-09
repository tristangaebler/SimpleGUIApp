package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setSize(400,400);
		this.setResizable(false);
		this.setVisible(true);
	}

}





























