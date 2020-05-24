package PROG_27;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import PROG_11.AdminFrame;

public class AgendaFrizerFrame extends JFrame{
	private AdminFrame adminFrame;
	
	public AgendaFrizerFrame() {
		super("Agenda");
		
		setLayout(new BorderLayout());
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		
	}
	
	public AgendaFrizerFrame getAgendaFrame() {
		return this;
	}
	
	public void setAdminFrameOff(AdminFrame admin) {
		this.adminFrame = admin;
		adminFrame.setVisible(false);
	}
	
}
