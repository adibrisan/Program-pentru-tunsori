package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.OptiuniClientPanel;

public class TestingClientRecenziiSide {
	OptiuniClientPanel ocp = new OptiuniClientPanel();
	@Test
	public void test() {
		
		new OptiuniClientPanel();
		ocp.getRecenziiBtn().doClick();
		
		assertEquals(true,ocp.isOK3());
		
	}

}
