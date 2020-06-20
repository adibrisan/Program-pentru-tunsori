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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class InregistrarePanel extends JPanel{
	private JLabel numeLabel;
	public JTextField numeField;
	private JLabel parolaLabel;
	public JPasswordField parolaField;
	public JButton loginBtn;
	private GridBagConstraints gc;
	private JLabel errorLabel;
	private boolean ok=false;
	
	public InregistrarePanel() {
		ok=true;
		Color culoareAlba = Color.white;
		Font myFont = new Font("Times", Font.PLAIN, 15);
		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Autentificare", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		numeLabel = new JLabel("Username:");
		numeField = new JTextField(10);
		parolaLabel = new JLabel("Parola:");
		parolaField = new JPasswordField(10);
		loginBtn = new JButton("Login");
		errorLabel = new JLabel();
		
		numeLabel.setForeground(Color.white);
		parolaLabel.setForeground(Color.white);
		errorLabel.setForeground(Color.white);
		loginBtn.setForeground(Color.white);
		
		Color verde = new Color(51,153,0);
		
		loginBtn.setBackground(verde);
	    loginBtn.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));


		
		setLayout(new GridBagLayout());
		gc = new GridBagConstraints();
		
		///First row///
				
		gc.gridy = 0;
		gc.weightx = 0.5;
		gc.weighty = 1;
			
				
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(numeLabel, gc);
				
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		add(numeField, gc);
				
				
		///Second row///
				
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.5;
				
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(parolaLabel, gc);
				
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0,0,0,0);
		add(parolaField, gc);
				

		///Third row///
				
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 1;
				
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(loginBtn, gc);
		
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		add(errorLabel,gc);
		
	}
	
	public JButton getLoginBtn() {
		return loginBtn;
	}

	public JPasswordField getPasswordField() {
		return parolaField;
	}


	public JLabel getErrorLabel() {
		return errorLabel;
	}

	public JTextField getNameField() {
		return numeField;
	}
	public boolean isOK2() {
		return ok;
	}
}
