package TestLoginFrame;

import static org.junit.Assert.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;

import PROG_27.AgendaFrizerFrame;

public class TestingFisierAgenda {

	@Test
	public void test() {
		AgendaFrizerFrame test = new AgendaFrizerFrame();
		JSONArray lista = new JSONArray();
		
		JSONObject obj1 = new JSONObject();
		obj1.put("Serviciu","Tuns Barbati");
		obj1.put("Data","25\\/05\\/2020");
		obj1.put("Nume","Borza Mircea");
		obj1.put("Ora","16:00");
		obj1.put("Nr Tel","0799141445");
		
		lista.add(obj1);
		test.readAgenda("src/test/resources/FisierProgramari.json");
		assertEquals(lista.size(),test.getList().size());
		
	}

}
