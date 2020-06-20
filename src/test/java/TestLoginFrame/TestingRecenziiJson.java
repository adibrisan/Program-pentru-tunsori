package TestLoginFrame;

import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import PROG_8.RecenzieFrame;

public class TestingRecenziiJson {

	@Test
	public void test() {
		JSONArray lista = new JSONArray();
		RecenzieFrame test = new RecenzieFrame();
		
		
		
		
		JSONObject obj1 = new JSONObject();
		obj1.put("Nume Client", "borza");
		obj1.put("Recenzie", "asta da");
		JSONObject obj2 = new JSONObject();
		obj2.put("Nume Client", "borza");
		obj2.put("Recenzie", "tot eu dau recenzii");
		JSONObject obj3 = new JSONObject();
		obj3.put("Nume Client", "adi");
		obj3.put("Recenzie", "o recenzie de la mine");
		JSONObject obj4 = new JSONObject();
		obj4.put("Nume Client", "adi");
		obj4.put("Recenzie", "tare");
		JSONObject obj5 = new JSONObject();
		obj5.put("Nume Client", "cosmin");
		obj5.put("Recenzie", "Eu am fost aici si mi-a placut");
		
		lista.add(obj1);
		lista.add(obj2);
		lista.add(obj3);
		lista.add(obj4);
		lista.add(obj5);
		
		
		assertEquals(test.readRecenzii("src/test/resources/FisierRecenzii.json"),lista);
	}

}
