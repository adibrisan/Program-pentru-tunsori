package PROG_27;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

abstract public class OraPanel extends JPanel{
	private JLabel ora1;
	private JLabel ora2;
	private JLabel ora3;
	private JLabel ora4;
	private JLabel ora5;
	private JLabel ora6;
	private JLabel ora7;
	private JLabel ora8;
	private JTextField ora1Field;
	private JTextField ora2Field;
	private JTextField ora3Field;
	private JTextField ora4Field;
	private JTextField ora5Field;
	private JTextField ora6Field;
	private JTextField ora7Field;
	private JTextField ora8Field;
	private JLabel[] labeluri;
	private JTextField[] fielduri;
	
	public OraPanel() {
		ora1 = new JLabel("");
		ora2 = new JLabel("");
		ora3 = new JLabel("");
		ora4 = new JLabel("");
		ora5 = new JLabel("");
		ora6 = new JLabel("");
		ora7 = new JLabel("");
		ora8 = new JLabel("");
		
		ora1.setForeground(Color.white);
		ora2.setForeground(Color.white);
		ora3.setForeground(Color.white);
		ora4.setForeground(Color.white);
		ora5.setForeground(Color.white);
		ora6.setForeground(Color.white);
		ora7.setForeground(Color.white);
		ora8.setForeground(Color.white);

		ora1Field = new JTextField(13);
		ora1Field.setEditable(false);
		ora2Field = new JTextField(13);
		ora2Field.setEditable(false);
		ora3Field = new JTextField(13);
		ora3Field.setEditable(false);
		ora4Field = new JTextField(13);
		ora4Field.setEditable(false);
		ora5Field = new JTextField(13);
		ora5Field.setEditable(false);
		ora6Field = new JTextField(13);
		ora6Field.setEditable(false);
		ora7Field = new JTextField(13);
		ora7Field.setEditable(false);
		ora8Field = new JTextField(13);
		ora8Field.setEditable(false);
		
		ora1Field.setText("liber");
		ora2Field.setText("liber");
		ora3Field.setText("liber");
		ora4Field.setText("liber");
		ora5Field.setText("liber");
		ora6Field.setText("liber");
		ora7Field.setText("liber");
		ora8Field.setText("liber");

		
		labeluri = new JLabel[8];
		fielduri = new JTextField[8];
		labeluri[0] = ora1;
		labeluri[1] = ora2;
		labeluri[2] = ora3;
		labeluri[3] = ora4;
		labeluri[4] = ora5;
		labeluri[5] = ora6;
		labeluri[6] = ora7;
		labeluri[7] = ora8;
		
		fielduri[0] = ora1Field;
		fielduri[1] = ora2Field;
		fielduri[2] = ora3Field;
		fielduri[3] = ora4Field;
		fielduri[4] = ora5Field;
		fielduri[5] = ora6Field;
		fielduri[6] = ora7Field;
		fielduri[7] = ora8Field;

		
		Border innerBorder = BorderFactory.createTitledBorder("");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		
		///First Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy = 0;
		
		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0,0,0,5);
		add(ora1, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora1Field, gc);
		
		///Second Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora2, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora2Field, gc);
		
		///Third Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora3, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora3Field, gc);
		
		///Fourth Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora4, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora4Field, gc);
		
		///Fifth Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora5, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora5Field, gc);
		
		///Sixth Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora6, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora6Field, gc);
		
		///Seventh Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora7, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora7Field, gc);
		
		///Eight Row///
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.gridy++;
		
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(ora8, gc);
		
		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(ora8Field, gc);
	}
	
	public JLabel[] getLabeluri() {
		return labeluri;
	}
	
	public JTextField[] getFielduri() {
		return fielduri;
	}

	public void setOra1(String ora) {
		ora1.setText(ora);
	}

	public void setOra2(String ora) {
		ora2.setText(ora);
	}

	public void setOra3(String ora) {
		ora3.setText(ora);
	}

	public void setOra4(String ora) {
		ora4.setText(ora);
	}

	public void setOra5(String ora) {
		ora5.setText(ora);
	}

	public void setOra6(String ora) {
		ora6.setText(ora);
	}

	public void setOra7(String ora) {
		ora7.setText(ora);
	}

	public void setOra8(String ora) {
		ora8.setText(ora);
	}

	public void setOra1Field(String ora1) {
		this.ora1Field.setText(ora1);
	}

	public void setOra2Field(String ora2) {
		this.ora2Field.setText(ora2);
	}

	public void setOra3Field(String ora3) {
		this.ora3Field.setText(ora3);
	}

	public void setOra4Field(String ora4) {
		this.ora4Field.setText(ora4);
	}

	public void setOra5Field(String ora5) {
		this.ora5Field.setText(ora5);
	}

	public void setOra6Field(String ora6) {
		this.ora6Field.setText(ora6);
	}

	public void setOra7Field(String ora7) {
		this.ora7Field.setText(ora7);
	}

	public void setOra8Field(String ora8) {
		this.ora8Field.setText(ora8);
	}
	
	
}
