package TestLoginFrame;

import static org.junit.Assert.*;

import java.security.MessageDigest;

import org.junit.Test;

import PROG_11.LoginFrame;

public class TestingEncryptedFct {

	@Test
	public void test() {
	LoginFrame test = new LoginFrame();
	String output = "?6\\/q\\\\????Iz?J???A?:d?\\u001D?N????$?8??2??\\tiV??\\u000B??dA\\\\?+?8\\u001C?,??:\\u0012?";
	assertEquals(false,MessageDigest.isEqual(output.getBytes(),LoginFrame.encodePassword("adi","brisan").getBytes()));
	}

}
