package PROG_6;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import PROG_11.AdminFrame;

public class RecenziiFrame extends JFrame{
	private AdminFrame adminFrame;
	
	public RecenziiFrame() {
		super("Recenzii");
		
		setLayout(new BorderLayout());
		
		Color culoare = new Color(44, 62, 80);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
	}

	public void setAdminFrameOff(AdminFrame adminFrame2) {
		this.adminFrame = adminFrame2;
		adminFrame.setVisible(false);
	}
	
}
