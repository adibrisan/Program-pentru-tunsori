package PROG_6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import PROG_11.AdminFrame;

public class RecenziiFrame extends JFrame{
	private RecenzieTextPanelFrizer textPanel;
	private AdminFrame adminFrame;
	private ToolBarBackBtn toolBar;
	
	public RecenziiFrame() {
		super("Recenzii");
		
		textPanel = new RecenzieTextPanelFrizer();
		toolBar = new ToolBarBackBtn();

		setLayout(new BorderLayout());
		add(textPanel, BorderLayout.CENTER);
		add(toolBar, BorderLayout.SOUTH);	
		
		Color culoare = new Color(44, 62, 80);
		
		textPanel.setBackground(culoare);
		toolBar.setBackground(culoare);

		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
	}

	public void setAdminFrameOff(AdminFrame adminFrame2) {
		this.adminFrame = adminFrame2;
		adminFrame.setVisible(false);
	}
	
	
	public RecenzieTextPanelFrizer getRecenzieTextPanelFrizer() {
		return textPanel;
	}
	
}

