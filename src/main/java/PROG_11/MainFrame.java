package PROG_11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private FormPanel formPanel;
	private LoginPanel loginPanel;
	
	public MainFrame() {
		super("Portal Programare Tuns");
		
		setLayout(new BorderLayout());
		
		formPanel = new FormPanel();
		loginPanel = new LoginPanel();
		add(formPanel, BorderLayout.WEST);
		add(loginPanel, BorderLayout.EAST);
		
		Color culoare = new Color(44, 62, 80);
		
		formPanel.setBackground(culoare);
		loginPanel.setBackground(culoare);
		
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public MainFrame getMainFrame() {
		return this;
	}
}	

