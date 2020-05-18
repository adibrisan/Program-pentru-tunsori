package PROG_11;

import java.awt.BorderLayout;



import javax.swing.JFrame;

public class ClientFrame extends JFrame{
	private LoginFrame loginFrame;
	
	
	public ClientFrame() {
		super("Client");
		
		setLayout(new BorderLayout());
		
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public void setLoginFrameOff(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
		loginFrame.setVisible(false);
	}
	
	public ClientFrame getClientFrame() {
		return this;
	}

}
