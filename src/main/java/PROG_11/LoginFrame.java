package PROG_11;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LoginFrame extends JFrame{
	private MainFrame mainFrame;
	private InregistrarePanel inregistrarePanel;
	
	@SuppressWarnings("unchecked")
	public LoginFrame() {
		super("Login");
		
		inregistrarePanel = new InregistrarePanel();
		setLayout(new BorderLayout());
		add(inregistrarePanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		
		
		inregistrarePanel.setBackground(culoare);
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		///scriere conturi in fisierul json///
		JSONObject obj1 = new JSONObject();
		obj1.put("username", "cosmin");
		obj1.put("password", "marsavina");
		
		JSONObject obj2 = new JSONObject();
		obj2.put("username", "borza");
		obj2.put("password", "alex");

		JSONObject obj3 = new JSONObject();
		obj3.put("username", "adi");
		obj3.put("password", "brisan");
		
		JSONObject obj4 = new JSONObject();
		obj4.put("username", "cata");
		obj4.put("password", "botean");

		JSONObject obj5 = new JSONObject();
		obj5.put("username", "ion");
		obj5.put("password", "constantin");
		
		JSONObject obj6 = new JSONObject();
		obj6.put("username", "Bianca");
		obj6.put("password", "Buleu");

		
		JSONArray list = new JSONArray();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		
		File file = new File("src/main/resources/users.json");
		try (FileWriter fw = new FileWriter(file)) {
			fw.write(list.toJSONString());


		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.setVisible(false);
	}
	
	public LoginFrame getLoginFrame(){
		return this;
	}
}
