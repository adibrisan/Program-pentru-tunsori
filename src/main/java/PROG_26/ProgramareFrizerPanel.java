package PROG_26;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;
import javax.swing.text.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.awt.*;
import java.util.*;

public class ProgramareFrizerPanel extends JPanel{
	private JLabel dataLabel;
	private JFormattedTextField dataField;
	private JLabel oraLabel;
	private JTextField oraField;
	private JLabel numeLabel;
	private JTextField numeField;
	private JLabel telefonLabel;
	private JTextField telefonField;
	private JComboBox serviciuCombo;
	private JLabel serviciuLabel;
	private JLabel errorLabel;


	public ProgramareFrizerPanel() {
		
		serviciuCombo = new JComboBox<String>();
		serviciuLabel = new JLabel("Serviciu:");
		dataLabel = new JLabel("Data:");
		dataField = new JFormattedTextField(15);
        dataField.setToolTipText("DD/MM/YYYY"); 
		oraLabel = new JLabel("Ora:");
		oraField = new JTextField(15);
        oraField.setToolTipText("Program : 10:00-18:00"); 
		numeLabel = new JLabel("Nume:");
		numeField = new JTextField(15);
		telefonLabel = new JLabel("Nr Tel:");
		telefonField = new JTextField(15);
		errorLabel = new JLabel();
		
		serviciuLabel.setForeground(Color.white);
		dataLabel.setForeground(Color.white);		
		oraLabel.setForeground(Color.white);
		numeLabel.setForeground(Color.white);		
		telefonLabel.setForeground(Color.white);
		errorLabel.setForeground(Color.white);
		
	    dataField = null;
	      try {
	         dataField = new JFormattedTextField(
	            new MaskFormatter("##/##/####")); 
	         dataField.setColumns(10);
	      } catch (ParseException e) {
	         e.printStackTrace();
	      }
	      
		
		oraField.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void keyPressed(KeyEvent e) {
				String ora = oraField.getText();
				int length = ora.length();
				
				char c = e.getKeyChar();
				
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9' || e.getExtendedKeyCode() == KeyEvent.VK_SHIFT || e.getKeyChar() == ':') {
					if(length < 5) {
						oraField.setEditable(true);
					}
					else {
						oraField.setEditable(false);
					}
				}
				else {
					///allow for keys 'back space and delete' for editing
					if(e.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
						oraField.setEditable(true);
					}
					else {
						oraField.setEditable(false);
					}
				}		
			}

			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		telefonField.addKeyListener(new KeyListener() {


			public void keyPressed(KeyEvent evt) {
				String phoneNumber = telefonField.getText();
				int length = phoneNumber.length();
					
				char c = evt.getKeyChar();
					
				if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
					if(length < 10) {
						telefonField.setEditable(true);
					}
					else {
						telefonField.setEditable(false);
					}
				}
				else {
					///allow for keys 'back space and delete' for editing
					if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
						telefonField.setEditable(true);
					}
					else {
						telefonField.setEditable(false);
					}
				}		
			}

			public void keyTyped(KeyEvent e) {
				
			}

			public void keyReleased(KeyEvent e) {
				
			}

			
		});
		
		Color culoareAlba = Color.white;
		Font myFont = new Font("Times", Font.PLAIN, 15);

		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Programeaza", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		
		DefaultComboBoxModel<String> serviciiModel = new DefaultComboBoxModel<String>();
		serviciiModel.addElement("Serviciul Dorit");
		serviciiModel.addElement("Tuns Barbati");
		serviciiModel.addElement("Aranjat Barba");
		serviciiModel.addElement("Spalat");
		serviciiModel.addElement("Frectie");
		serviciuCombo.setModel(serviciiModel);
		serviciuCombo.setSelectedIndex(0);
		serviciuCombo.setEditable(false);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		////First row////
		
		gc.weightx = 0.5;
		gc.weighty = 1;
		gc.gridy = 0;
		
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(20,0,0,5);
		add(dataLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(20,0,0,60);
		add(dataField, gc);

		////Second row////
		
		gc.weightx = 0.5;
		gc.weighty = 1;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(oraLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(oraField, gc);
		
		////Third row////
		
		gc.weightx = 0.5;
		gc.weighty = 1;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(numeLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(numeField, gc);
		
		////Fourth row////
		
		gc.weightx = 0.5;
		gc.weighty = 1;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(telefonLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(telefonField, gc);
		
		////Fifth row////
		
		gc.weightx = 0.5;
		gc.weighty = 1;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(serviciuLabel, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(serviciuCombo, gc);
		
		////Error////
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0,0,0,0);
		add(errorLabel,gc);
	}
	
	public JTextField getTelefonField() {
		return telefonField;
	}

	public JTextField getDataField() {
		return dataField;
	}

	public JTextField getOraField() {
		return oraField;
	}

	public JTextField getNumeField() {
		return numeField;
	}
	
	public JComboBox getComboBox() {
		return serviciuCombo;
	}


	public JLabel getErrorLabel() {
		return errorLabel;
	}

}
