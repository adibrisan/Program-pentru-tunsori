package PROG_27;

import java.awt.Dimension;

public class OraPanelSt extends OraPanel{
	
	public OraPanelSt() {
		super();
		
		Dimension dim = getPreferredSize();
		
		dim.width = 200;
		setPreferredSize(dim);	
		
		setOra1("10:00");
		setOra2("11:00");
		setOra3("12:00");
		setOra4("13:00");
		setOra5("14:00");
		setOra6("15:00");
		setOra7("16:00");
		setOra8("17:00");
	}
}
