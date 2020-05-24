package PROG_27;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import PROG_11.ClientFrame;

public class AgendaFrame extends JFrame{
	private ClientFrame clientFrame;
	
	public AgendaFrame() {
		super("Agenda");
		
		setLayout(new BorderLayout());
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		
	}


	public void setClientFrameOff(ClientFrame clientFrame) {
		this.clientFrame = clientFrame;
		clientFrame.setVisible(false);		
	}
	
	public AgendaFrame getAgendaFrame() {
		return this;
	}
	
}
