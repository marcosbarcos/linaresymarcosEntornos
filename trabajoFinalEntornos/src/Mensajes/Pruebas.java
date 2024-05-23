package Mensajes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase de pruebas para la aplicación de mensajería.
 */
public class Pruebas {
    private Persona p;
    private Persona a;

    /**
     * Crea las instancias de Persona antes de cada prueba.
     */
    @Before
    public void crearPersonas() {
        p = new Persona(123456789, "Marcos");
        a = new Persona(987654321);
    }

    /**
     * Limpia las instancias de Persona después de cada prueba.
     */
    @After
    public void limpiarPersonas() {
        p = null;
        a = null;
    }

    /**
     * Prueba para verificar el número de teléfono de la persona.
     */
    @Test
    public void testTelefono() {
        assertEquals(123456789, p.getNumPersona());
    }

    /**
     * Prueba para verificar el nombre de la persona.
     */
    @Test
    public void testPersona() {
        assertTrue(p.getNombre().equals("Marcos"));
    }

    /**
     * Prueba para añadir un contacto a la lista de contactos de la persona.
     */
    @Test
    public void testAnadirContacto() {
        p.anadirContacto(a);
        assertTrue(p.getContactos().contains(a));
    }

    /**
     * Prueba para verificar que un contacto no está en la lista de contactos de la persona.
     */
    @Test
    public void testBuscarPersonaContacto() {
        assertFalse(p.getContactos().contains(a));
    }

    /**
     * Prueba para verificar que el mensaje de texto vacío no tiene contenido.
     */
    @Test
    public void testMensajeVacio() {
        Texto t = new Texto(p, a, null);
        assertNull(t.getSSM());
    }

    /**
     * Prueba para verificar que el mensaje de texto tiene contenido.
     */
    @Test
    public void testMensaje() {
        Texto t = new Texto(p, a, "Hola");
        assertNotNull(t.getSSM());
    }

    /**
     * Prueba para comparar dos instancias de Persona diferentes.
     */
    @Test
    public void compararPersonas1() {
        Persona b = new Persona(123333789, "pepe");
        Persona c = new Persona(123456789, "pepe");
        assertNotSame(b, c);
    }
}
