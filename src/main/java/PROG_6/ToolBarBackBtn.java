package PROG_6;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBarBackBtn extends JPanel{
	private JButton goBackBtn;
	
	public ToolBarBackBtn() {
		goBackBtn = new JButton("Inapoi");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Color rosu = new Color(207,0,15);
		
		goBackBtn.setBackground(rosu);
		goBackBtn.setForeground(Color.white);

		add(goBackBtn);
	}
	
	public JButton getBackBtn() {
		return goBackBtn;
	}
}
