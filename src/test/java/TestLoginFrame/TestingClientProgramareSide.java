package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.OptiuniClientPanel;

public class TestingClientProgramareSide {
	OptiuniClientPanel ocp1 = new OptiuniClientPanel();
	@Test
	public void test() {
		
		ocp1.getProgramareBtn().doClick();
		assertEquals(true,ocp1.isOK3());
	}

}
