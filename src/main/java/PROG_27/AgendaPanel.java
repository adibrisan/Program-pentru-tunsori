package PROG_27;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class AgendaPanel extends JPanel{
	private JLabel infoLabel;
	private JLabel errorLabel;
	private JFormattedTextField dataField;
	
	public AgendaPanel() {
		
		infoLabel = new JLabel("Introduceti data in care doriti sa vedeti programul");
		dataField = new JFormattedTextField(15);
		errorLabel = new JLabel();
		
		Font myFont = new Font("Times", Font.PLAIN, 15);
		
		infoLabel.setForeground(Color.white);
		errorLabel.setForeground(Color.white);
		infoLabel.setFont(myFont);
		
	    dataField = null;
	      try {
	         dataField = new JFormattedTextField(
	            new MaskFormatter("##/##/####")); 
	         dataField.setColumns(10);
	      } catch (ParseException e) {
	         e.printStackTrace();
	      }
		
	    Color culoareAlba = Color.white;

			
		Border innerBorder = BorderFactory.createTitledBorder(null, "Agenda", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		///First row//
		
		gc.weighty = 0.5;
		gc.weightx = 0.5;
		gc.gridy = 0;
		
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		add(infoLabel, gc);
		
		///Second row///
		
		gc.weighty = 0.5;
		gc.weightx = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0,0,40,0);
		add(dataField, gc);
		
		///ErrorLabel///
		
		gc.weighty = 0.5;
		gc.weightx = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(0,0,0,0);
		add(errorLabel, gc);
		
	}
	
	public JFormattedTextField getDataField() {
		return dataField;
	}

	public JLabel getErrorLabel() {
		return errorLabel;
	}
}

