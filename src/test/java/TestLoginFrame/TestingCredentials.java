
package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_11.LoginFrame;

public class TestingCredentials {

	@Test
	public void test() {
		LoginFrame testing = new LoginFrame();
		boolean output = testing.checkCredentials("adi","?6\\/q\\\\????Iz?J???A?:d?\\u001D?N????$?8??2??\\tiV??\\u000B??dA\\\\?+?8\\u001C?,??:\\u0012?","adi","brisan");
		assertEquals(false,output);
	}

}
