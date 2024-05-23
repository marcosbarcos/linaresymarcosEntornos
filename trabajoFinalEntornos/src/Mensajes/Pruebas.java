package Mensajes;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Pruebas {
	private Persona p;
	private Persona a;
	
	@Before
	public void crearPersonas() {
	p = new Persona(123456789, "Marcos");
	a = new Persona(987654321);
	}
	
	@After
	public void limpiarPersonas() {
		p = null;
		a = null;
	}
	
	@Test
	public void testTelefono() {
		assertEquals(123456789, p.getNumPersona());
	}
	
	@Test
	public void testPersona() {
		assertTrue(p.getNombre().equals("Marcos"));
	}
	
	@Test
	public void testAñadirContacto() {
		p.anadirContacto(a);
		assertTrue(p.getContactos().contains(a));
	}
	
	@Test
	public void testBuscarPersonaContacto() {
		assertFalse(p.getContactos().contains(a));
	}
	
	@Test
	public void testMensajeVacio() {
		Texto t = new Texto(p, a, null);
		assertNull(t.getSSM());
	}
	
	@Test
	public void testMensaje() {
		Texto t = new Texto(p, a, "Hola");
		assertNotNull(t.getSSM());
	}
	
	@Test
	public void compararPersonas1() {
		Persona b = new Persona(123333789, "pepe");
		Persona c = new Persona(123456789, "pepe");
		assertNotSame(b,c);
	}
	

	
}
