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

    public String getSSM() {
        return SSM;
    }

    public void setSSM(String SSM) {
        this.SSM = SSM;
    }
    
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