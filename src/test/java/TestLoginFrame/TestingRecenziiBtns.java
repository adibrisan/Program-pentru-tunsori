package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_8.ToolBar2Btn;

public class TestingRecenziiBtns {
	ToolBar2Btn back = new ToolBar2Btn();
					//Testing btn back
	@Test
	public void test1() {
		
		back.getBackBtn().doClick();
		
		assertEquals(true,back.isOK5());
		
	}
			//Testing btn ok
	ToolBar2Btn ok = new ToolBar2Btn();
	@Test
	public void test2() {
		
		ok.getOKBtn().doClick();
		
		assertEquals(true,ok.isOK5());
		
	}

}
