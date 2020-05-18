package PROG_11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class LoginPanel extends JPanel{
	private JButton loginBtn;
	
	public LoginPanel() {
		Dimension dim = getPreferredSize();
		
		dim.width = 250;
		setPreferredSize(dim);	
		Color culoareAlba = Color.white;
		Font myFont = new Font("Arial", Font.PLAIN, 15);
		
		Border innerBorder = BorderFactory.createTitledBorder(null, "Accesare", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, myFont, culoareAlba);
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		loginBtn = new JButton("Login");
	    loginBtn.setBorder(BorderFactory.createEmptyBorder(10, 21, 10, 21));
	    
	    Image image = null;
		try {
			image = ImageIO.read(new File("src/main/resources/login.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    JLabel imageLabel = new JLabel();
	    Image dimg = image.getScaledInstance(120,150,Image.SCALE_SMOOTH);
	    ImageIcon imageIcon = new ImageIcon(dimg);
	    imageLabel.setIcon(imageIcon);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		
		///First Row///
		gc.weightx = 1;
		gc.weighty = 0.2;
				
		gc.gridx = 0;
		gc.gridy = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.PAGE_START;
		gc.insets = new Insets(0,0,0,0);
		add(imageLabel, gc);
		
		///Button Row///
		gc.weightx = 1;
		gc.weighty = 0.2;
				
		gc.gridx = 0;
		gc.anchor = GridBagConstraints.CENTER;
		gc.insets = new Insets(30,0,0,0);
		add(loginBtn, gc);
				
	}

	
	public JButton getLoginButton() {
		return loginBtn;
	}
}
