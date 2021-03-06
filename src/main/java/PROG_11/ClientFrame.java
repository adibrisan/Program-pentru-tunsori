package PROG_11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import PROG_26.ProgramareClientFrame;
import PROG_27.AgendaFrame;
import PROG_8.RecenzieFrame;

public class ClientFrame extends JFrame{
	private LoginFrame loginFrame;
	private OptiuniClientPanel optiuniClient;
	private String numeClient;
	
	public ClientFrame() {
		super("Client");
		
		setLayout(new BorderLayout());
		
		optiuniClient = new OptiuniClientPanel();
		add(optiuniClient, BorderLayout.CENTER);
		
		
		Color culoare = new Color(44, 62, 80);
		
		optiuniClient.setBackground(culoare);

		optiuniClient.getProgramareBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				ProgramareClientFrame programareFrame = new ProgramareClientFrame();
				programareFrame.setClientFrameOff(getClientFrame());
			}
		
		});
		
		optiuniClient.getRecenziiBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				RecenzieFrame recenzieFrame = new RecenzieFrame();
				recenzieFrame.setClientFrameOff(getClientFrame());
			}
			
		});
		
		optiuniClient.getVerificaOrarulBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AgendaFrame agendaFrame = new AgendaFrame();
				agendaFrame.setClientFrameOff(getClientFrame());
			}
			
		});
		
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

	public void setClientName(String userJSON) {
		this.numeClient = userJSON;
	}
	
	public String getNumeClient() {
		return numeClient;
	}
}
