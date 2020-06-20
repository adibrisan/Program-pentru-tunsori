package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.OptiuniFrizerPanel;

public class TestingAgendaBtn {
	OptiuniFrizerPanel ofp1 = new OptiuniFrizerPanel();
	@Test
	public void test() {
		ofp1.getAgendaBtn().doClick();
		assertEquals(true,ofp1.isOK4());
	}

}
