package PROG_27;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import PROG_11.AdminFrame;
import PROG_8.ToolBar2Btn;

public class AgendaFrizerFrame extends JFrame{
	private AdminFrame adminFrame;
	private ToolBar2Btn toolBar;
	private AgendaPanel agendaPanel;
	public AgendaFrizerFrame() {
		super("Agenda");
		setLayout(new BorderLayout());
		toolBar = new ToolBar2Btn();
		agendaPanel = new AgendaPanel();
		add(toolBar, BorderLayout.SOUTH);
		add(agendaPanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		
		agendaPanel.setBackground(culoare);
		toolBar.setBackground(culoare);
		
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
