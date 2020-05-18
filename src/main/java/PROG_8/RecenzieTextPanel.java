package PROG_8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class RecenzieTextPanel extends JPanel{
	private JTextArea textArea;
	private ToolBar2Btn toolBar;
	private JLabel errorLabel;
	
	public RecenzieTextPanel() {
		
		textArea = new JTextArea();
		toolBar = new ToolBar2Btn();
		errorLabel = new JLabel();
		setLayout(new BorderLayout());
		
		Color culoareAlba = Color.white;
		Font myFont = new Font("Times", Font.PLAIN, 15);
		errorLabel.setForeground(culoareAlba);
		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Scrie o recenzie", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		add(toolBar, BorderLayout.SOUTH);
		add(errorLabel, BorderLayout.NORTH);		
	}

	public ToolBar2Btn getToolBar() {
		// TODO Auto-generated method stub
		return toolBar;
	}

	public JTextArea getTextArea() {
		// TODO Auto-generated method stub
		return textArea;
	}
	
	public JLabel getErrorLabel() {
		return errorLabel;
	}

}
