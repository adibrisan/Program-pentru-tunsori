package PROG_27;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import PROG_11.ClientFrame;
import PROG_8.ToolBar2Btn;

public class AgendaFrame extends JFrame{
	private ClientFrame clientFrame;
	private ToolBar2Btn toolBar;
	private AgendaPanel agendaPanel;
	
	public AgendaFrame() {
		super("Agenda");
		setLayout(new BorderLayout());
		toolBar = new ToolBar2Btn();
		agendaPanel = new AgendaPanel();
		add(toolBar, BorderLayout.SOUTH);
		add(agendaPanel, BorderLayout.CENTER);
		
		Color culoare = new Color(44, 62, 80);
		
		agendaPanel.setBackground(culoare);		
		toolBar.setBackground(culoare);
		toolBar.getOKBtn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String data = agendaPanel.getDataField().getText();
				
				String ziS = data.substring(0,2);
				String lunaS = data.substring(3,5);
				String anS = data.substring(6,10);
				
				if(ziS.trim().isEmpty() == true || lunaS.trim().isEmpty() == true || anS.trim().isEmpty() == true ||
						ziS.length() < 2 || lunaS.length() < 2 || anS.length() < 4) {
	    			agendaPanel.getErrorLabel().setText("Introdu ziua,luna si anul");
	    			return;
					
				}
				
			    int zi = Integer.parseInt(data.substring(0, 2));
			    int luna = Integer.parseInt(data.substring(3, 5));
			    int an = Integer.parseInt(data.substring(6,10));					    			
				
				Date date = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
                String strDate = dateFormat.format(date);
                int anCurent = Integer.parseInt(strDate.substring(0,4));
                int lunaCurenta = Integer.parseInt(strDate.substring(5,7));
                int ziCurenta = Integer.parseInt(strDate.substring(8,10));
                
                if(an < anCurent || an > anCurent) {
                	agendaPanel.getErrorLabel().setText("Anul ales este gresit!");
					return;
                }
                
                else if(luna > 12 || luna < lunaCurenta) {
                	agendaPanel.getErrorLabel().setText("Luna aleasa este gresita!");
					return;
				}
                
                else if(luna == lunaCurenta && (luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12)) {
                	if(zi < ziCurenta || zi > 31) {
                		agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
                
                else if(luna == lunaCurenta && (luna == 4 || luna == 6 || luna == 9 || luna == 11)) {
                	if(zi < ziCurenta || zi > 30) {
                		agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
                
                else if(luna == lunaCurenta && luna == 2) {
                	if(zi < ziCurenta || zi > 28) {
                		agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
			    
				else if(luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12) {
		    		if(zi < 1 || zi > 31) {
		    			agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
                
		    	else if(luna == 4 || luna == 6 || luna == 9 || luna == 11) {
		    		if(zi < 1 || zi > 30) {
		    			agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
                
		    	if(luna == 2) {
		    		if(zi < 1 || zi > 28) {
		    			agendaPanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
                
		    	else {
	    			agendaPanel.getErrorLabel().setText("");
	    			AgendaOrarFrame agendaOrar = new AgendaOrarFrame();
	    			agendaOrar.setAgendaFrameOff(getAgendaFrame());

	    			File file = new File("src/main/resources/FisierProgramari.json");
	    			
	    			JSONParser parser = new JSONParser();
	    			try (Reader reader = new FileReader(file)) {
	    				JSONArray jsonArray = (JSONArray) parser.parse(reader);
	    				Iterator<JSONObject> it = jsonArray.iterator();
	    				while (it.hasNext()) {
	    					JSONObject obj = it.next();
							String dataF = (String) obj.get("Data");
							String oraF = (String) obj.get("Ora");
							String serviciuF = (String) obj.get("Serviciu");
							
							if(data.equals(dataF)) {
								JLabel[] labelS = agendaOrar.getOraPanelSt().getLabeluri();
	                    		JLabel[] labelD = agendaOrar.getOraPanelDr().getLabeluri();
	                    		
	                    		for(int i = 0; i < 8; i++) {
	                    			if(oraF.equals(labelS[i].getText())) {
	                    				JTextField[] fieldS = agendaOrar.getOraPanelSt().getFielduri();
	                    				fieldS[i].setText(serviciuF);
	                    				break;
	                    			}
	                    			else if(oraF.equals(labelD[i].getText())) {
	                    				JTextField[] fieldD = agendaOrar.getOraPanelDr().getFielduri();
	                    				fieldD[i].setText(serviciuF);
	                    				break;
	                    			}
	                    		}
							}
	    				}
	    			} catch (IOException e1) {e1.printStackTrace();} 
	    			  catch (ParseException e1) {e1.printStackTrace();}
                }
			}			
		});
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		
	}


	public void setClientFrameOff(ClientFrame clientFrame) {
		this.clientFrame = clientFrame;
		clientFrame.setVisible(false);		
	}
	
	public AgendaFrame getAgendaFrame() {
		return this;
	}
	
}
