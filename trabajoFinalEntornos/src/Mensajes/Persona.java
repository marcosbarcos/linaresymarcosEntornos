package Mensajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una persona en el sistema de mensajería.
 */
public class Persona {
    private int numeroTelefono;
    private String nombre;
    private List<Persona> contactos;
    private List<Mensaje> mensajesUsuario;

    /**
     * Construye una Persona con un número de teléfono y un nombre.
     * @param numeroTelefono el número de teléfono de la persona
     * @param nombre el nombre de la persona
     */
    public Persona(int numeroTelefono, String nombre) {
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.contactos = new ArrayList<>();
        this.mensajesUsuario = new ArrayList<>();
    }

    /**
     * Construye una Persona con un número de teléfono.
     * @param numeroTelefono el número de teléfono de la persona
     */
    public Persona(int numeroTelefono) {
        this(numeroTelefono, null);
    }

    /**
     * Añade un contacto a la lista de contactos de la persona.
     * @param persona la persona a añadir como contacto
     */
    public void anadirContacto(Persona persona) {
        this.contactos.add(persona);
    }

    /**
     * Convierte los detalles de la persona a una cadena.
     * @return una representación en cadena de la persona
     */
    public String personaToString() {
        return "Nombre: " + nombre + ", Teléfono: " + numeroTelefono;
    }

    /**
     * Recibe un mensaje y lo añade a la lista de mensajes del usuario.
     * @param mensaje el mensaje a recibir
     */
    public void recibirMensaje(Mensaje mensaje) {
        this.mensajesUsuario.add(mensaje);
    }

    /**
     * Añade múltiples mensajes a la lista de mensajes del usuario.
     * @param mensajes la lista de mensajes a añadir
     */
    public void añadirMensajesTodos(List<Mensaje> mensajes) {
        this.mensajesUsuario.addAll(mensajes);
    }

    /**
     * Convierte los mensajes del usuario a una cadena.
     * @return una representación en cadena de los mensajes del usuario
     */
    public String imprimirMensajesDeUsuario() {
        String estemensaje = "";
        for (Mensaje mensaje : mensajesUsuario) {
        	estemensaje += mensaje.toString() + "\n";
        }
        return estemensaje;
    }

    public int getNumPersona() {
        return numeroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Persona> getContactos() {
        return contactos;
    }

    public List<Mensaje> getMensajesUsuario() {
        return mensajesUsuario;
    }
}