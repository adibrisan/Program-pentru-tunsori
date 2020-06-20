package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_26.ProgramareClientFrame;
import PROG_8.ToolBar2Btn;

public class TestingOkBtnClientSide {
	ToolBar2Btn okbtn = new ToolBar2Btn();
	@Test
	public void test() {
		new ProgramareClientFrame();
		okbtn.getOKBtn().doClick();
		assertEquals(true,okbtn.isOK5());
	}

}
