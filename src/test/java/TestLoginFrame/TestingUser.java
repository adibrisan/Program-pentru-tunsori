package TestLoginFrame;

import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import PROG_11.LoginFrame;

public class TestingUser {

	@Test
	public void test() {
		LoginFrame test=new LoginFrame();
		JSONArray lista=new JSONArray();
		
		JSONObject obj1 = new JSONObject();
		obj1.put("username", "cosmin");
		obj1.put("password", LoginFrame.encodePassword("cosmin","marsavina"));
		
		JSONObject obj2 = new JSONObject();
		obj2.put("username", "borza");
		obj2.put("password",LoginFrame. encodePassword("borza","alex"));

		JSONObject obj3 = new JSONObject();
		obj3.put("username", "adi");
		obj3.put("password", LoginFrame.encodePassword("adi","brisan"));
		
		JSONObject obj4 = new JSONObject();
		obj4.put("username", "cata");
		obj4.put("password", LoginFrame.encodePassword("cata","botean"));

		JSONObject obj5 = new JSONObject();
		obj5.put("username", "ion");
		obj5.put("password", LoginFrame.encodePassword("ion","constantin"));
		
		JSONObject obj6 = new JSONObject();
		obj6.put("username", "Bianca");
		obj6.put("password", LoginFrame.encodePassword("Bianca","buleu"));
		
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		lista.add(obj4);
		lista.add(obj5);
		lista.add(obj6);
		
		assertEquals(lista,test.getListUser());
	}

}
