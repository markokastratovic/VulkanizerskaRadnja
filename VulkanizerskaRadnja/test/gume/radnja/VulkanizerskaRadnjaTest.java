package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v;
	AutoGuma a;
	@Before
	public void setUp() throws Exception {
		v=new VulkanizerskaRadnja();
		a=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		v=null;
		a=null;
	}

	@Test
	public void testDodajGumu() {
		a.setMarkaModel("Pirelli P Zero");
		a.setPrecnik(21);
		a.setSirina(300);
		a.setVisina(80);
		v.dodajGumu(a);
		assertEquals(a, v.getGume().getFirst());
	}

	@Test (expected= java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	@Test (expected= java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		a.setMarkaModel("Pirelli P Zero");
		a.setPrecnik(21);
		a.setSirina(300);
		a.setVisina(80);
		v.dodajGumu(a);
		AutoGuma a1=new AutoGuma();
		a1.setMarkaModel("Pirelli P Zero");
		a1.setPrecnik(21);
		a1.setSirina(300);
		a1.setVisina(80);
		v.dodajGumu(a1);
	}
	
	@Test
	public void testPronadjiGumu() {
		a.setMarkaModel("Pirelli P Zero");
		a.setPrecnik(21);
		a.setSirina(300);
		a.setVisina(80);
		v.dodajGumu(a);
		assertEquals(1, v.pronadjiGumu("Pirelli P Zero").size());
	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, v.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumuNePostojeca() {
		a.setMarkaModel("Pirelli P Zero");
		a.setPrecnik(21);
		a.setSirina(300);
		a.setVisina(80);
		v.dodajGumu(a);
		assertEquals(0, v.pronadjiGumu("Tigar").size());
	}
	
	@Test
	public void testPronadjiGumuNekoliko() {
		a.setMarkaModel("Pirelli P Zero");
		a.setPrecnik(21);
		a.setSirina(225);
		a.setVisina(80);
		AutoGuma a1=new AutoGuma();
		a1.setMarkaModel("Pirelli P Zero");
		a1.setPrecnik(21);
		a1.setSirina(300);
		a1.setVisina(80);
		v.dodajGumu(a);
		v.dodajGumu(a1);
		assertEquals(2, v.pronadjiGumu("Pirelli P Zero").size());
	}
	
}
