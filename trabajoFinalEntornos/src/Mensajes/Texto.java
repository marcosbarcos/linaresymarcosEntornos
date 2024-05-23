package Mensajes;

/**
 * Representa un mensaje de texto en el sistema de mensajería.
 */
public class Texto extends Mensaje {
    private String SSM;

    /**
     * Construye un mensaje de Texto.
     * @param remitente el remitente del mensaje
     * @param destinatario el destinatario del mensaje
     * @param SSM el contenido del mensaje
     */
    public Texto(Persona remitente, Persona destinatario, String SSM) {
        super(remitente, destinatario);
        this.SSM = SSM;
    }

    /**
     * Obtiene el contenido del mensaje de texto.
     * @return el contenido del mensaje de texto
     */
    public String getSSM() {
        return SSM;
    }

    /**
     * Establece el contenido del mensaje de texto.
     * @param SSM el contenido del mensaje de texto
     */
    public void setSSM(String SSM) {
        this.SSM = SSM;
    }

    /**
     * Imprime el contenido del mensaje de texto.
     */
    public void imprimirContenido() {
        System.out.println(this.SSM);
    }
    @Override
    public String toString() {
        return "Texto{" +
                "remitente=" + remitente.personaToString() +
                ", destinatario=" + destinatario.personaToString() +
                ", SSM='" + SSM + '\'' +
                '}';
    }
}