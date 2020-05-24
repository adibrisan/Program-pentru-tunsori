package PROG_26;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import PROG_11.ClientFrame;


public class ProgramareClientFrame extends JFrame{
	private ClientFrame clientFrame;

	
	public ProgramareClientFrame() {
		super("Programare");
		
		setLayout(new BorderLayout());
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}	
	

	public void setClientFrameOff(ClientFrame clientFrame2) {
		this.clientFrame = clientFrame2;
		clientFrame.setVisible(false);		
	}
	
}

