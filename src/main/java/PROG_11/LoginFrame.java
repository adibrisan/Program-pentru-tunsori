package PROG_11;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class LoginFrame extends JFrame{
	private MainFrame mainFrame;
	
	@SuppressWarnings("unchecked")
	public LoginFrame() {
		super("Login");
		
		setLayout(new BorderLayout());		
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.setVisible(false);
	}
	
	public LoginFrame getLoginFrame(){
		return this;
	}
}

