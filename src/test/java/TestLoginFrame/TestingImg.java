package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.LoginPanel;

public class TestingImg {

	@Test
	public void test() {
		LoginPanel test = new LoginPanel();
		
		assertEquals(true,test.getPhoto());
	}

}
