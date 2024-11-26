
import java.io.Serializable;
import java.util.Vector;
import javax.swing.ButtonModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Venta implements Serializable{
    private String nombreCliente;
    private Object localidad;
    private String procesador;
    private String memoria;
    private String monitor;
    private String discoDuro;
    private Vector opciones;

public Venta(String nombreCliente, Object localidad, String procesador, String memoria, String monitor, String discoDuro, Vector opciones) {
this.nombreCliente = nombreCliente;
this.localidad = localidad;
this.procesador = procesador;
this.memoria = memoria;
this.monitor = monitor;
this.discoDuro = discoDuro;
this.opciones = opciones;
}

public String getNombre() {
    return this.nombreCliente;
}

public Object getLocalidad() {
    return this.localidad;
}

public String getProcesador() {
    return this.procesador;
}

public String getMonitor() {
    return this.monitor;
}

public String getMemoria() {
    return this.memoria;
}

public String getDiscoDuro() {
    return this.discoDuro;
}

public Vector getOpciones() {
    return this.opciones;
}

@Override
public String toString() {
    return "Venta {" +
           "Nombre del Cliente='" + nombreCliente + '\'' +
           ", Localidad=" + localidad +
           ", Procesador=" + procesador +
           ", Memoria=" + memoria +
           ", Monitor=" + monitor +
           ", Opciones=" + opciones.toString() +
           '}';
}
}

