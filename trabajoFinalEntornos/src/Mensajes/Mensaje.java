package Mensajes;

/**
 * Clase abstracta que representa un mensaje en el sistema de mensajería.
 */
public abstract class Mensaje {
    protected Persona remitente;
    protected Persona destinatario;

    /**
     * Construye un Mensaje con un remitente y un destinatario.
     * @param remitente el remitente del mensaje
     * @param destinatario el destinatario del mensaje
     */
    public Mensaje(Persona remitente, Persona destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    /**
     * Obtiene el remitente del mensaje.
     * @return el remitente del mensaje
     */
    public Persona getRemitente() {
        return remitente;
    }

    /**
     * Obtiene el destinatario del mensaje.
     * @return el destinatario del mensaje
     */
    public Persona getDestinatario() {
        return destinatario;
    }

    /**
     * Establece el remitente del mensaje.
     * @param remitente el remitente del mensaje
     */
    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    /**
     * Establece el destinatario del mensaje.
     * @param destinatario el destinatario del mensaje
     */
    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * Devuelve una representación en cadena del mensaje.
     * Este método debe ser implementado por las subclases.
     * @return una cadena que representa el mensaje
     */
    @Override
    public abstract String toString();
}