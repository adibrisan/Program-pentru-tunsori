package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_6.ToolBarBackBtn;

public class TestingBackBtnRecenziiFrizerSide {
	ToolBarBackBtn bckfr = new ToolBarBackBtn();
	@Test
	public void test() {
		
		bckfr.getBackBtn().doClick();
		
		assertEquals(true,bckfr.isOK6());
		
	}

}
