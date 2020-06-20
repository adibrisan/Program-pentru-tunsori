package TestLoginFrame;

import static org.junit.Assert.*;

import org.junit.Test;

import PROG_26.ProgramareFrizerFrame;
import PROG_26.ProgramareFrizerPanel;

public class TestingErrorMsgInProgramareFrizerSide {
	
	ProgramareFrizerPanel pff = new ProgramareFrizerPanel();
	@Test
	public void test1() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Ora Nevalida");
		
		assertEquals("Ora Nevalida",pff.getErrorLabel().getText());
		
	}
	@Test
	public void test2() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Ziua aleasa este gresita!");
		assertEquals("Ziua aleasa este gresita!",pff.getErrorLabel().getText());
	}
	
	@Test
	public void test3() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Luna aleasa este gresita!");
		assertEquals("Luna aleasa este gresita!",pff.getErrorLabel().getText());
	}
	@Test
	public void test4() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Anul ales este gresit!");
		assertEquals("Anul ales este gresit!",pff.getErrorLabel().getText());
	}
	@Test
	public void test5() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Introdu ziua,luna si anul");
		assertEquals("Introdu ziua,luna si anul",pff.getErrorLabel().getText());
		
	}
	@Test
	public void test6() {
		new ProgramareFrizerFrame();
		pff.getErrorLabel().setText("Toate campurile sunt obligatorii");
		assertEquals("Toate campurile sunt obligatorii",pff.getErrorLabel().getText());
	}
}
