package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.InregistrarePanel;

public class TestLoginAccount {
	InregistrarePanel ip = new InregistrarePanel();
	@Test
	public void test() {
		new InregistrarePanel();
		ip.getLoginBtn().doClick();
		
		assertEquals(true,ip.isOK2());
	}

}
