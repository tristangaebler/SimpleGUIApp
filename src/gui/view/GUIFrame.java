package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
/**
 * 
 * @author Tristan Gaebler
 * @version 0.2 Nov 9,2015 updated the setUpFrame to load the contentPanel with a GUIPanel
 */
public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel); //Must be the first line of the method
		this.setSize(400,400); //Window size
		this.setResizable(false);
		this.setVisible(true); //Must be last line of the method
	}
	
	public GUIController getBaseController()
	{
		return baseController;
	}

}





























