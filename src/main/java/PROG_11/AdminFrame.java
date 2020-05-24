package PROG_11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import PROG_6.RecenziiFrame;



public class AdminFrame extends JFrame{
	private LoginFrame loginFrame;
	private OptiuniFrizerPanel optiuniPanel;
	
	public AdminFrame() {
		super("Optiuni Frizer");
		
		setLayout(new BorderLayout());
		
		optiuniPanel = new OptiuniFrizerPanel();
		
		add(optiuniPanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		
		optiuniPanel.setBackground(culoare);
		
		optiuniPanel.getRecenziiBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				RecenziiFrame recenziiFrame = new RecenziiFrame();
				recenziiFrame.setAdminFrameOff(getAdminFrame());
			}
		});
		
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
