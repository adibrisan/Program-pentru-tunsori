package PROG_11;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class OptiuniFrizerPanel extends JPanel{
	private JButton verificaAgendaBtn;
	private JButton programareBtn;
	private JButton recenziiBtn;
	private JLabel messageLabel;
	
	public OptiuniFrizerPanel() {
		
		verificaAgendaBtn = new JButton("Verifica Agenda");
		programareBtn = new JButton("Fa o programare");
		recenziiBtn = new JButton("Vezi Recenziile");
		messageLabel = new JLabel("Buna ziua! Sa ai o zi buna si cat mai multe programari!");
		
		Font myFont = new Font("Times", Font.PLAIN, 15);
		
	    verificaAgendaBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    programareBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    recenziiBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		messageLabel.setForeground(Color.white);
		messageLabel.setFont(myFont);
		
		Color culoareAlba = Color.white;
		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Optiuni Frizer", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		////First Row/////
		
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(30,0,0,0);
		add(verificaAgendaBtn, gc);
		
		////Second Row/////
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0,0,0,0);
		add(programareBtn, gc);
		
		////Third Row/////
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0,0,40,0);
		add(recenziiBtn, gc);
		
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.PAGE_START;
		gc.insets = new Insets(10,0,0,0);
		add(messageLabel, gc);
	}
	
	public AbstractButton getProgramareBtn() {
		return programareBtn;
	}

	public AbstractButton getRecenziiBtn() {
		return recenziiBtn;
	}

	public AbstractButton getAgendaBtn() {
		return verificaAgendaBtn;
	}
	
	
}
