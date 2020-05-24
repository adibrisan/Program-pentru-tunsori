package PROG_26;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import PROG_11.AdminFrame;


public class ProgramareFrizerFrame extends JFrame{
	private AdminFrame adminFrame;


	
	public ProgramareFrizerFrame() {
		super("Programare");
		
		setLayout(new BorderLayout());
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	

	public void setAdminFrameOff(AdminFrame adminFrame2) {
		this.adminFrame = adminFrame2;
		adminFrame.setVisible(false);		
	}
	
}

