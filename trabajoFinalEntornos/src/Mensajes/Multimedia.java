package Mensajes;

/**
 * Representa un mensaje multimedia en el sistema de mensajería.
 */
public class Multimedia extends Mensaje {
    private String nombreFichero;
    private int tamano;

    /**
     * Construye un mensaje Multimedia.
     * @param remitente el remitente del mensaje
     * @param destinatario el destinatario del mensaje
     * @param nombreFichero el nombre del fichero multimedia
     * @param tamano el tamaño del fichero multimedia
     */
    public Multimedia(Persona remitente, Persona destinatario, String nombreFichero, int tamano) {
        super(remitente, destinatario);
        this.nombreFichero = nombreFichero;
        this.tamano = tamano;
    }

    /**
     * Obtiene el nombre del fichero multimedia.
     * @return el nombre del fichero multimedia
     */
    public String getNombreFichero() {
        return nombreFichero;
    }

    /**
     * Obtiene el tamaño del fichero multimedia.
     * @return el tamaño del fichero multimedia
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Establece el nombre del fichero multimedia.
     * @param nombreFichero el nombre del fichero multimedia
     */
    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    /**
     * Establece el tamaño del fichero multimedia.
     * @param tamano el tamaño del fichero multimedia
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    /**
     * Imprime el contenido del mensaje multimedia.
     */
    public void imprimirContenido() {
        System.out.println("Nombre fichero: " + this.nombreFichero + " Tamano: " + this.tamano);
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "remitente=" + remitente.personaToString() +
                ", destinatario=" + destinatario.personaToString() +
                ", nombreFichero='" + nombreFichero + '\'' +
                ", tamaño=" + tamano +
                '}';
    }
}