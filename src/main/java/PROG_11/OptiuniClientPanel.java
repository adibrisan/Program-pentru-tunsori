package PROG_11;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class OptiuniClientPanel extends JPanel{
	private JButton verificaOrarulBtn;
	private JButton programareBtn;
	private JButton recenziiBtn;
	private JLabel messageLabel;
	
	public OptiuniClientPanel() {
		
		verificaOrarulBtn = new JButton("Verifica Agenda");
		programareBtn = new JButton("Fa o programare");
		recenziiBtn = new JButton("Scrie o recenzie");
		messageLabel = new JLabel("Buna ziua! Alege optiunea dorita de mai jos!");
		
	    verificaOrarulBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    programareBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    recenziiBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		Color culoareAlba = Color.white;
		Font myFont = new Font("Times", Font.PLAIN, 15);
		
		messageLabel.setForeground(culoareAlba);
		messageLabel.setFont(myFont);

		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Optiuni Client", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
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
		add(recenziiBtn, gc);
		
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
		add(verificaOrarulBtn, gc);
		
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.PAGE_START;
		gc.insets = new Insets(10,0,0,0);
		add(messageLabel, gc);	
	}

	public JButton getVerificaOrarulBtn() {
		return verificaOrarulBtn;
	}

	public JButton getProgramareBtn() {
		return programareBtn;
	}


	public JButton getRecenziiBtn() {
		return recenziiBtn;
	}


	public JLabel getMessageLabel() {
		return messageLabel;
	}

}
