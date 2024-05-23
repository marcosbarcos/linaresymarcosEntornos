package Mensajes;

/**
 * Representa a un usuario normal en el sistema de mensajería.
 */
public class Normal extends Persona {

    /**
     * Construye un usuario Normal con un número de teléfono y un nombre.
     * @param numeroTelefono el número de teléfono del usuario
     * @param nombre el nombre del usuario
     */
    public Normal(int numeroTelefono, String nombre) {
        super(numeroTelefono, nombre);
    }
}
