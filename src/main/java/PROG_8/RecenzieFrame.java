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
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	
	public RecenzieFrame getRecenzieFrame() {
		return this;
	}
	

	public void setClientFrameOff(ClientFrame clientFrame2) {
		this.clientFrame = clientFrame2;
		clientFrame.setVisible(false);
	}


}
