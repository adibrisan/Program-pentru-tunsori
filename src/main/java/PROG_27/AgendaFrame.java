package PROG_27;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import PROG_11.ClientFrame;
import PROG_8.ToolBar2Btn;

public class AgendaFrame extends JFrame{
	private ClientFrame clientFrame;
	private ToolBar2Btn toolBar;
	private AgendaPanel agendaPanel;
	
	public AgendaFrame() {
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


	public void setClientFrameOff(ClientFrame clientFrame) {
		this.clientFrame = clientFrame;
		clientFrame.setVisible(false);		
	}
	
	public AgendaFrame getAgendaFrame() {
		return this;
	}
	
}
