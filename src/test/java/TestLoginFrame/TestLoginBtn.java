package TestLoginFrame;

import static org.junit.Assert.*;
import org.junit.Test;
import PROG_11.LoginPanel;


public class TestLoginBtn {
	LoginPanel mf = new LoginPanel();
	@Test
	public void test() {
		new LoginPanel();
		mf.getLoginButton().doClick();		
		
		assertEquals(true,mf.isOK());
	}

}
