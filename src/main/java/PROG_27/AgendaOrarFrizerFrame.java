package PROG_27;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import PROG_6.ToolBarBackBtn;

public class AgendaOrarFrizerFrame extends JFrame{
	private AgendaFrizerFrame agendaFrizerFrame;
	private ToolBarBackBtn toolBar;
	private OraPanelSt oraPanelSt;
	private OraPanelDr oraPanelDr;
	
	public AgendaOrarFrizerFrame() {
		super("Agenda");
		
		setLayout(new BorderLayout());
		
		toolBar = new ToolBarBackBtn();
		oraPanelSt = new OraPanelSt();
		oraPanelDr = new OraPanelDr();
		add(toolBar, BorderLayout.SOUTH);
		add(oraPanelSt, BorderLayout.WEST);
		add(oraPanelDr, BorderLayout.EAST);
		
		Color culoare = new Color(44, 62, 80);
		
		oraPanelSt.setBackground(culoare);
		oraPanelDr.setBackground(culoare);
		toolBar.setBackground(culoare);
		
		toolBar.getBackBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				setAgendaFrameOn(agendaFrizerFrame);
			}
			
		});
		
		setSize(410,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public void setAgendaFrizerFrameOff(AgendaFrizerFrame agendaFrame) {
		this.agendaFrizerFrame = agendaFrame;
		agendaFrame.setVisible(false);
	}
	
	public void setAgendaFrameOn(AgendaFrizerFrame agendaFrame) {
		this.agendaFrizerFrame = agendaFrame;
		agendaFrame.setVisible(true);
		setVisible(false);
	}

	
	public OraPanelDr getOraPanelDr() {
		return oraPanelDr;
	}

	public OraPanelSt getOraPanelSt() {
		return oraPanelSt;	}
}

