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

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public abstract String toString();
}