package PROG_27;

import java.awt.Dimension;

public class OraPanelDr extends OraPanel{
	
	public OraPanelDr() {
		super();
		
		Dimension dim = getPreferredSize();
		
		dim.width = 200;
		setPreferredSize(dim);
		
		setOra1("10:30");
		setOra2("11:30");
		setOra3("12:30");
		setOra4("13:30");
		setOra5("14:30");
		setOra6("15:30");
		setOra7("16:30");
		setOra8("17:30");
	}
}

