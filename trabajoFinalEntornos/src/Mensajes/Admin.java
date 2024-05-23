package Mensajes;

import java.util.List;

/**
 * Representa a un usuario administrador en el sistema de mensajería.
 */
public class Admin extends Persona {

    /**
     * Construye un Admin con un número de teléfono y un nombre.
     * @param numeroTelefono el número de teléfono del admin
     * @param nombre el nombre del admin
     */
    public Admin(int numeroTelefono, String nombre) {
        super(numeroTelefono, nombre);
    }

    /**
     * Ve todos los mensajes en el sistema.
     * @param mensajes la lista de mensajes a ver
     * @return una representación en cadena de todos los mensajes
     */
    public String verMensajesTodos(List<Mensaje> mensajes) {
        String result = "";
        for (Mensaje mensaje : mensajes) {
            result += mensaje.toString() + "\n";
        }
        return result;
    }
}