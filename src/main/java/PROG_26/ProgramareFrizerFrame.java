package PROG_26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
		
		toolBar.getOKBtn().addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {			
				
				String telefon = programarePanel.getTelefonField().getText();
				String oraText = programarePanel.getOraField().getText();
				String nume = programarePanel.getNumeField().getText();
				String combo = (String)programarePanel.getComboBox().getSelectedItem();
				String data = programarePanel.getDataField().getText();							

				if(telefon.length() == 0 || oraText.length() == 0 || nume.length() == 0 || combo.equals("Serviciul Dorit")) {
					programarePanel.getErrorLabel().setText("Toate campurile sunt obligatorii");
					return;
				}
				
				String ziS = data.substring(0,2);
				String lunaS = data.substring(3,5);
				String anS = data.substring(6,10);
				
				if(ziS.trim().isEmpty() == true || lunaS.trim().isEmpty() == true || anS.trim().isEmpty() == true ||
						ziS.length() < 2 || lunaS.length() < 2 || anS.length() < 4) {
	    			programarePanel.getErrorLabel().setText("Introdu ziua,luna si anul");
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
					programarePanel.getErrorLabel().setText("Anul ales este gresit!");
					return;
                }
                
                else if(luna > 12 || luna < lunaCurenta) {
					programarePanel.getErrorLabel().setText("Luna aleasa este gresita!");
					return;
				}
                
                else if(luna == lunaCurenta && (luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12)) {
                	if(zi < ziCurenta || zi > 31) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
                
                else if(luna == lunaCurenta && (luna == 4 || luna == 6 || luna == 9 || luna == 11)) {
                	if(zi < ziCurenta || zi > 30) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
                
                else if(luna == lunaCurenta && luna == 2) {
                	if(zi < ziCurenta || zi > 28) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
                	}
                }
			    
				else if(luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12) {
		    		if(zi < 1 || zi > 31) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
		    	else if(luna == 4 || luna == 6 || luna == 9 || luna == 11) {
		    		if(zi < 1 || zi > 30) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
		    	else if(luna == 2) {
		    		if(zi < 1 || zi > 28) {
		    			programarePanel.getErrorLabel().setText("Ziua aleasa este gresita!");
						return;
		    		}
		    	}
			  
			    
				
				if(programarePanel.getOraField().getText().length() < 5) {
					programarePanel.getErrorLabel().setText("Ora nevalida");
					return;
				}
				
				String[] ora_parts = oraText.split(":");
				String ora1 = ora_parts[0];
				String ora2 = ora_parts[1];
				int ora_Mare = Integer.parseInt(ora1);
				int ora_mica = Integer.parseInt(ora2);
				
				if(ora_Mare > 17 || ora_Mare < 10 || (ora_mica != 30 && ora_mica != 0)) {
				   	 programarePanel.getErrorLabel().setText("Ora nu corespunde programului!");
				}
				
				else if(telefon.length() < 10) {
					programarePanel.getErrorLabel().setText("Numarul trebuie sa aiba 10 cifre!");
				}

				else {					
					
					File file = new File("src/main/resources/FisierProgramari.json");
					
					JSONParser parser = new JSONParser();
					
					JTextField dataField = programarePanel.getDataField();
	                JTextField oraField = programarePanel.getOraField();
	                JTextField numeField = programarePanel.getNumeField();
	                JComboBox comboBox = programarePanel.getComboBox();
	                JTextField telefonField = programarePanel.getTelefonField();

					try (Reader reader = new FileReader(file)) {
						JSONArray jsonArray = (JSONArray) parser.parse(reader);
						if(jsonArray.isEmpty()) {
							JSONObject obj1 = new JSONObject();
							obj1.put("Data", data);
							obj1.put("Ora", oraText);
							obj1.put("Nume", nume);
							obj1.put("Nr Tel", telefon);
							obj1.put("Serviciu", combo);

							JSONArray listObjects = new JSONArray();
							listObjects.add(obj1);

							try (FileWriter fw = new FileWriter(file)) {
								fw.write(listObjects.toJSONString());
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							
							programarePanel.getErrorLabel().setText("Programare inregistrata cu succes");
			                dataField.setText("");
			                oraField.setText("");
			                numeField.setText("");
			                telefonField.setText("");
			                comboBox.setSelectedIndex(0);
							return;
						}
						else {
							JSONParser parser2 = new JSONParser();
							try (Reader reader2 = new FileReader(file)) {
								JSONArray jsonArray2 = (JSONArray) parser2.parse(reader2);
								
								Iterator<JSONObject> it = jsonArray2.iterator();
								///verificare ora///
								while (it.hasNext()) {
									JSONObject obj = it.next();
									String dataF = (String) obj.get("Data");
									String oraF = (String) obj.get("Ora");
									if(dataF.equals(data)) {
										if(oraF.equals(oraText)) {
											programarePanel.getErrorLabel().setText("Ora este ocupata!");
		                    				return;
										}
									}
								}
								
								
								JSONObject obj1 = new JSONObject();
								obj1.put("Data", data);
								obj1.put("Ora", oraText);
								obj1.put("Nume", nume);
								obj1.put("Nr Tel", telefon);
								obj1.put("Serviciu", combo);

								jsonArray2.add(obj1);

								try (FileWriter fw = new FileWriter(file)) {
									fw.write(jsonArray2.toJSONString());
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								
								programarePanel.getErrorLabel().setText("Programare inregistrata cu succes");
				                dataField.setText("");
				                oraField.setText("");
				                numeField.setText("");
				                telefonField.setText("");
				                comboBox.setSelectedIndex(0);
								
								

							} catch (IOException e1) {
								e1.printStackTrace();
							} catch (ParseException e1) {
								e1.printStackTrace();
							}
						}
					}catch (IOException e1) {
						e1.printStackTrace();
					}catch (ParseException e1) {
						e1.printStackTrace();
					}	
				}
			}
			
		});
		
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

