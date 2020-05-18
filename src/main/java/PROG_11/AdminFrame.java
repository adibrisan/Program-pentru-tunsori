package PROG_11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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