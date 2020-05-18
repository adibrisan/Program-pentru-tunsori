package PROG_11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class AdminFrame extends JFrame{
	private LoginFrame loginFrame;
	
	
	public AdminFrame() {
		super("Optiuni Frizer");
		
		setLayout(new BorderLayout());
		
		
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}
	
	public void setLoginFrameOff(LoginFrame login) {
		this.loginFrame = login;
		loginFrame.setVisible(false);
	}
	
	public AdminFrame getAdminFrame() {
		return this;
	}
}
