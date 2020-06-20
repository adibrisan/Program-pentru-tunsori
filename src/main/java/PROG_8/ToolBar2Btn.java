package PROG_8;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ToolBar2Btn extends JPanel{
	private JButton goBackBtn;
	private JButton trimiteBtn;
	private boolean ok=false;
	public ToolBar2Btn() {
		goBackBtn = new JButton("Inapoi");
		trimiteBtn = new JButton("OK");
		
		Color verde = new Color(51,153,0);
		Color rosu = new Color(207,0,15);
		ok=true;
		trimiteBtn.setBackground(verde);
		trimiteBtn.setForeground(Color.white);
		goBackBtn.setBackground(rosu);
		goBackBtn.setForeground(Color.white);

		
		setLayout(new FlowLayout());
		add(goBackBtn);
		add(trimiteBtn);
	}
	
	public JButton getBackBtn() {
		return goBackBtn;
	}


	public JButton getOKBtn() {
		return trimiteBtn;
	}
	public boolean isOK5() {
		return ok;
	}
}
