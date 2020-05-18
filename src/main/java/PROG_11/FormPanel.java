package PROG_11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class FormPanel extends JPanel{
	private JLabel titlu1;
	private JLabel titlu2;
	private JLabel zileLuc;
	private JLabel zileInchise;
	private JLabel telefon;
	private JLabel email;
	
	public FormPanel() {
		Dimension dim = getPreferredSize();
		
		dim.width = 250;
		setPreferredSize(dim);	
		Font myFont = new Font("Times", Font.PLAIN, 15);
		
		titlu1 = new JLabel("PROGRAM DE LUCRU");
		titlu2 = new JLabel("DATE DE CONTACT");
		zileLuc = new JLabel("L-S : 10:00-18:00");
		zileInchise = new JLabel("D : INCHIS");
		telefon = new JLabel("Nr. Telefon : 031 023 01 52");
		email = new JLabel("Email : tunsorishop@upt.ro");
		
		titlu1.setForeground(Color.white);
		titlu1.setFont(myFont);
		
		titlu2.setForeground(Color.white);
		titlu2.setFont(myFont);
		
		zileInchise.setForeground(Color.white);
		telefon.setForeground(Color.white);
		email.setForeground(Color.white);
		zileLuc.setForeground(Color.white);
		
		Color culoareAlba = Color.white;
		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Detaliile Firmei", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		///First Row///
		gc.weightx = 1;
		gc.weighty = 0.01;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.CENTER;
		add(titlu1, gc);
		
		
		
		///Next row///
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.01;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(zileLuc, gc);
		
		
		///Next row///
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.01;
			
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(zileInchise, gc);

		
		///Next row///
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.01;
					
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		add(titlu2, gc);
		
		///Next row///
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.01;
					
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(telefon, gc);
	
		///Next row///
		
		gc.gridy++;
		gc.weightx = 1;
		gc.weighty = 0.01;
							
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(email, gc);		
	}
}

