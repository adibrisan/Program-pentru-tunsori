package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.OptiuniClientPanel;
import PROG_11.OptiuniFrizerPanel;

public class TestingFrizerProgramareSide {
	OptiuniFrizerPanel ofp = new OptiuniFrizerPanel();
	@Test
	public void test() {
		ofp.getProgramareBtn().doClick();
		assertEquals(true,ofp.isOK4());
	}
															// combo test programare btn si recenzii btn
	@Test
	public void test2() {
		ofp.getRecenziiBtn().doClick();
		assertEquals(true,ofp.isOK4());
	}

}
