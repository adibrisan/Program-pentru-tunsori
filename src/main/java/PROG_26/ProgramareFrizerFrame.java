package PROG_26;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import PROG_11.AdminFrame;
import PROG_8.ToolBar2Btn;


public class ProgramareFrizerFrame extends JFrame{
	private AdminFrame adminFrame;
	private ProgramareFrizerPanel programarePanel;
	private ToolBar2Btn toolBar;
	
	public ProgramareFrizerFrame() {
		super("Programare");
		
		setLayout(new BorderLayout());
		programarePanel = new ProgramareFrizerPanel();
		toolBar = new ToolBar2Btn();
		add(toolBar, BorderLayout.SOUTH);
		add(programarePanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		
		programarePanel.setBackground(culoare);
		toolBar.setBackground(culoare);
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}
	

	public void setAdminFrameOff(AdminFrame adminFrame2) {
		this.adminFrame = adminFrame2;
		adminFrame.setVisible(false);		
	}
	
}

