package TestLoginFrame;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import org.junit.Test;

import PROG_26.ProgramareFrizerPanel;

public class TestingProgramari {

	@Test
	public void test() {
		ProgramareFrizerPanel test = new ProgramareFrizerPanel();
		DefaultComboBoxModel<String> list = new DefaultComboBoxModel<String>();
		
		list.addElement("Serviciul Dorit");
		list.addElement("Tuns Barbati");
		list.addElement("Aranjat Barba");
		list.addElement("Spalat");
		list.addElement("Frectie");
		
		assertEquals(list.getSize(),test.getServiciiModel().getSize());
	}

}
