package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class AutoGumaTest {
	AutoGuma a;

	@Before
	public void setUp() throws Exception {
		a=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Pirelli p zero");
		assertEquals("Pirelli p zero", a.getMarkaModel());
	}

	@Test (expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetMarkaModelPrekratakString() {
		a.setMarkaModel("aa");
	}
	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(17);
		assertEquals(17, a.getPrecnik());
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPremali() {
		a.setPrecnik(5);
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetPrecnikPreveliki() {
		a.setPrecnik(50);
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(175);
		assertEquals(175, a.getSirina());
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetSirinaPreuska() {
		a.setPrecnik(50);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetSirinaPresiroka() {
		a.setPrecnik(500);
	}
	
	@Test
	public void testSetVisina() {
		a.setVisina(60);
		assertEquals(60, a.getVisina());
	}
	
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaPrevelika() {
		a.setVisina(110);
	}
	@Test (expected=java.lang.RuntimeException.class)
	public void testSetVisinaPremala() {
		a.setVisina(20);
	}
	@Test 
	public void testToString() {
		a.setMarkaModel("MichelinPilotSuperSport");
		a.setPrecnik(19);
		a.setSirina(275);
		a.setVisina(85);
		assertEquals("AutoGuma [markaModel=MichelinPilotSuperSport, precnik=19,"
				+ " sirina=275, visina=85]", a.toString());
	}
	
	@Test 
	public void testEqualsObject() {
		a.setMarkaModel("Toyo");
		a.setPrecnik(19);
		a.setSirina(275);
		a.setVisina(85);
		AutoGuma a1=new AutoGuma();
		a1.setMarkaModel("Toyo");
		a1.setPrecnik(19);
		a1.setSirina(275);
		a1.setVisina(85);
		assertTrue( a.equals(a1) );
	}
	
	@Test 
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Toyo");
		a.setPrecnik(19);
		a.setSirina(275);
		a.setVisina(85);
		AutoGuma a1=new AutoGuma();
		a1.setMarkaModel("Toyo");
		a1.setPrecnik(19);
		a1.setSirina(285);
		a1.setVisina(85);
		assertFalse( a.equals(a1) );
	}
	
	
}