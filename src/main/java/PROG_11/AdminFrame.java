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
				File file = new File("src/main/resources/FisierRecenzii.json");
				
				JSONParser parser = new JSONParser();
				try (Reader reader = new FileReader(file)) {
					JSONArray jsonArray = (JSONArray) parser.parse(reader);
					Iterator<JSONObject> it = jsonArray.iterator();
					while (it.hasNext()) {
						
						JSONObject obj = it.next();
						String numeClient = (String) obj.get("Nume Client");
						String recenzie = (String) obj.get("Recenzie");
						recenziiFrame.getRecenzieTextPanelFrizer().getTextArea().append(numeClient + " : ");
						recenziiFrame.getRecenzieTextPanelFrizer().getTextArea().append("\n");
						recenziiFrame.getRecenzieTextPanelFrizer().getTextArea().append(recenzie);
						recenziiFrame.getRecenzieTextPanelFrizer().getTextArea().append("\n\n");
						
					}
				} catch (IOException e1) {e1.printStackTrace();}
				  catch (ParseException e1) {e1.printStackTrace();}
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
