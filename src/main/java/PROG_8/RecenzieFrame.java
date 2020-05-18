package PROG_8;

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
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import PROG_11.ClientFrame;

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
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RecenzieFrame extends JFrame{
	private RecenzieTextPanel textPanel;
	private ClientFrame clientFrame;

	
	public RecenzieFrame() {
		super("Recenzie");
		
		setLayout(new BorderLayout());
		textPanel = new RecenzieTextPanel();
		add(textPanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		Color culoareAlba = Color.white;
		
		textPanel.setBackground(culoare);
		
		ToolBar2Btn toolBar = textPanel.getToolBar();
		toolBar.setBackground(culoare);
		
		toolBar.getOKBtn().addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("src/main/resources/FisierRecenzii.json");
				
				String recenzie = textPanel.getTextArea().getText();
				String numeClient = clientFrame.getNumeClient();
				
				JSONParser parser = new JSONParser();

				try (Reader reader = new FileReader(file)) {
					JSONArray jsonArray = (JSONArray) parser.parse(reader);
					if(jsonArray.isEmpty()) {
						
						JSONObject obj1 = new JSONObject();
						obj1.put("Nume Client", numeClient);
						obj1.put("Recenzie", recenzie);


						JSONArray list = new JSONArray();
						list.add(obj1);


						try (FileWriter fw = new FileWriter(file)) {
							fw.write(list.toJSONString());
						} catch (IOException e1) {e1.printStackTrace();}
						
						JTextArea textArea = textPanel.getTextArea();
						textArea.setText("");
						
						return;
					}
					else {
						JSONParser parser2 = new JSONParser();
						try (Reader reader2 = new FileReader(file)) {
							JSONArray jsonArray2 = (JSONArray) parser.parse(reader2);
							JSONObject obj1 = new JSONObject();
							obj1.put("Nume Client", numeClient);
							obj1.put("Recenzie", recenzie);

							jsonArray2.add(obj1);

							try (FileWriter fw = new FileWriter(file)) {
								fw.write(jsonArray2.toJSONString());
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							
							JTextArea textArea = textPanel.getTextArea();
							textArea.setText("");
							
						} catch (IOException e1) {e1.printStackTrace();}
						  catch (ParseException e1) {e1.printStackTrace();}
					}

					}catch (IOException e1) {e1.printStackTrace();}
					 catch (ParseException e1) {e1.printStackTrace();}
            }
			
		});
		

		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	

	
	public void setClientFrameOn(ClientFrame client) {
		this.clientFrame = client;
		clientFrame.setVisible(true);
		setVisible(false);
	}
	
	public RecenzieFrame getRecenzieFrame() {
		return this;
	}
	

	public void setClientFrameOff(ClientFrame clientFrame2) {
		this.clientFrame = clientFrame2;
		clientFrame.setVisible(false);
	}


}

