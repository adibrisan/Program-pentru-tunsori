package PROG_26;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import PROG_11.ClientFrame;
import PROG_8.ToolBar2Btn;


public class ProgramareClientFrame extends JFrame{
	private ProgramareFrizerPanel programarePanel;
	private ClientFrame clientFrame;
	private ToolBar2Btn toolBar;
	
	public ProgramareClientFrame() {
		super("Programare");
		
		setLayout(new BorderLayout());
		programarePanel = new ProgramareFrizerPanel();
		toolBar = new ToolBar2Btn();
		add(toolBar, BorderLayout.SOUTH);
		add(programarePanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		Color culoareAlba = Color.white;
		
		programarePanel.setBackground(culoare);
		toolBar.setBackground(culoare);
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

	}	
	

	public void setClientFrameOff(ClientFrame clientFrame2) {
		this.clientFrame = clientFrame2;
		clientFrame.setVisible(false);		
	}
	
}

