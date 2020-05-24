package PROG_6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class RecenzieTextPanelFrizer extends JPanel{
	private JTextArea textArea;
	
	public RecenzieTextPanelFrizer() {
		
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		textArea.setEditable(false);
		
		Color culoareAlba = Color.white;
		Font myFont = new Font("Times", Font.PLAIN, 15);

		Border innerBorder = BorderFactory.createTitledBorder(null, "Recenzii", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}

}

