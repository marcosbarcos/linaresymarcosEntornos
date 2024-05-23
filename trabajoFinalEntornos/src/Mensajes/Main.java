package Mensajes;

import java.util.ArrayList;

public class Main {
	    public static void main(String[] args) {
	        // Crear usuarios
	    	ArrayList<Mensaje> todosLosMensajes = new ArrayList<Mensaje>();
	        Persona p = new Normal(123456789, "Marcos");
	        Persona a = new Normal(987654321, "Ana");
	        Admin admin = new Admin(111222333, "Admin");

	        // Añadir contactos
	        p.anadirContacto(a);

	        // Crear y enviar mensajes
	        Texto mensajeTexto = new Texto(p, a, "Hola, ¿cómo estás?");
	        Multimedia mensajeMultimedia = new Multimedia(p, a, "foto.jpg", 2048);

	        // Recibir mensajes
	        a.recibirMensaje(mensajeTexto);
	        a.recibirMensaje(mensajeMultimedia);

	        // Ver mensajes recibidos
	        System.out.println("Mensajes de Ana:");
	        System.out.println(a.imprimirMensajesDeUsuario());

	        // Imprimir contenido de mensajes
	        System.out.println("Contenido del mensaje de texto:");
	        mensajeTexto.imprimirContenido();
	        System.out.println("Contenido del mensaje multimedia:");
	        mensajeMultimedia.imprimirContenido();

	        // Ver todos los mensajes como admin
	        todosLosMensajes.add(mensajeTexto);
	        todosLosMensajes.add(mensajeMultimedia);
	        System.out.println("Todos los mensajes en el sistema (admin):");
	        System.out.println(admin.verMensajesTodos(todosLosMensajes));
	    }
	}

