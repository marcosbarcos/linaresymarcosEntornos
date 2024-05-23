package Mensajes;

/**
 * Representa un mensaje multimedia en el sistema de mensajería.
 */
public class Multimedia extends Mensaje {
    private String nombreFichero;
    private int tamaño;

    /**
     * Construye un mensaje Multimedia.
     * @param remitente el remitente del mensaje
     * @param destinatario el destinatario del mensaje
     * @param nombreFichero el nombre del fichero multimedia
     * @param tamaño el tamaño del fichero multimedia
     */
    public Multimedia(Persona remitente, Persona destinatario, String nombreFichero, int tamaño) {
        super(remitente, destinatario);
        this.nombreFichero = nombreFichero;
        this.tamaño = tamaño;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void imprimirContenido() {
        System.out.println("Nombre fichero: " + this.nombreFichero + " Tamaño: " + this.tamaño);
    }
    
    @Override
    public String toString() {
        return "Multimedia{" +
                "remitente=" + remitente.personaToString() +
                ", destinatario=" + destinatario.personaToString() +
                ", nombreFichero='" + nombreFichero + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}