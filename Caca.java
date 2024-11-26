/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;

/**
 *
 * @author alumno
 */
public class Caca extends javax.swing.JFrame {

    /**
     * Creates new form Caca
     */
    public Caca() {
        initComponents();
    }
    
    private Vector<Venta> historialVentas = new Vector<>();
    private Vector<String> nombresclientes = new Vector();
    private String nombreProcesador;
    private String nombreMemoria;
    private String nombreMonitor;
    private String nombreDD;
    
      public void comprobarLocalidad(Venta v) {
        for (int j = 0; j < this.opcioneslocalidad.getItemCount(); j++) {
            if(this.opcioneslocalidad.getItemAt(j).equals(v.getLocalidad())) {
            this.opcioneslocalidad.setSelectedItem(this.opcioneslocalidad.getItemAt(j));
            }
        }       
    }
    
    public void comprobarProcesador(Venta v) {
                if(v.getProcesador().equals(this.procesador1.getText())) {
                   this.procesador1.setSelected(true);
                }
                else if(v.getProcesador().equals(this.procesador2.getText())) {
                   this.procesador2.setSelected(true);
                }
                else if(v.getProcesador().equals(this.procesador3.getText())) {
                   this.procesador3.setSelected(true);
                }
                else if(v.getProcesador().equals(this.procesador4.getText())) {
                   this.procesador4.setSelected(true);
                }
    }
    
    public void comprobarMemoria(Venta v) {
                if(v.getMemoria().equals(this.memoria1.getText())) {
                   this.memoria1.setSelected(true);
                }
                else if(v.getMemoria().equals(this.memoria2.getText())) {
                   this.memoria2.setSelected(true);
                }
                else if(v.getMemoria().equals(this.memoria3.getText())) {
                   this.memoria3.setSelected(true);
                }
                else if(v.getMemoria().equals(this.memoria4.getText())) {
                   this.memoria4.setSelected(true);
                }
    }
    
    public void comprobarMonitor(Venta v) {
                if(v.getMonitor().equals(this.monitor1.getText())) {
                   this.monitor1.setSelected(true);
                }
                else if(v.getMonitor().equals(this.monitor2.getText())) {
                   this.monitor2.setSelected(true);
                }
                else if(v.getMonitor().equals(this.monitor3.getText())) {
                   this.monitor3.setSelected(true);
                }
                else if(v.getMonitor().equals(this.monitor4.getText())) {
                   this.monitor4.setSelected(true);
                }
    }
    
    public void comprobarDD(Venta v) {
                if(v.getDiscoDuro().equals(this.disco1.getText())) {
                   this.disco1.setSelected(true);
                }
                else if(v.getDiscoDuro().equals(this.disco2.getText())) {
                   this.disco2.setSelected(true);
                }
                else if(v.getDiscoDuro().equals(this.disco3.getText())) {
                   this.disco3.setSelected(true);
                }
                else if(v.getDiscoDuro().equals(this.disco4.getText())) {
                   this.disco4.setSelected(true);
                }
            
        
    }
    
      public void comprobarOpciones(Venta v) {
                if (v.getOpciones().contains(this.opciones1.getText())){
                    this.opciones1.setSelected(true);
                }
                else{
                    this.opciones1.setSelected(false);
                }
                if (v.getOpciones().contains(this.opciones2.getText())){
                    this.opciones2.setSelected(true);
                }  
                else{
                    this.opciones2.setSelected(false);
                }
                if (v.getOpciones().contains(this.opciones3.getText())) {
                    this.opciones3.setSelected(true);
                } 
                else{
                    this.opciones3.setSelected(false);
                }
                if (v.getOpciones().contains(this.opciones4.getText())) {
                    this.opciones4.setSelected(true);
                }  
                else{
                    this.opciones4.setSelected(false);
                }
    }
    
    public void cogerTexto() {
        //Procesador
        if(this.buttonGroup1.getSelection() == this.procesador1.getModel()) {
            this.nombreProcesador = this.procesador1.getText();
        }
        else if(this.buttonGroup1.getSelection() == this.procesador2.getModel()) {
            this.nombreProcesador = this.procesador2.getText();
        }
        else if(this.buttonGroup1.getSelection() == this.procesador3.getModel()) {
            this.nombreProcesador = this.procesador3.getText();
        }
        else if(this.buttonGroup1.getSelection() == this.procesador4.getModel()) {
            this.nombreProcesador = this.procesador4.getText();
        }
        //Memoria
         if(this.buttonGroup2.getSelection() == this.memoria1.getModel()) {
            this.nombreMemoria = this.memoria1.getText();
        }
        else if(this.buttonGroup2.getSelection() == this.memoria2.getModel()) {
            this.nombreMemoria = this.memoria2.getText();
        }
        else if(this.buttonGroup2.getSelection() == this.memoria3.getModel()) {
            this.nombreMemoria = this.memoria3.getText();
        }
        else if(this.buttonGroup2.getSelection() == this.memoria4.getModel()) {
            this.nombreMemoria = this.memoria4.getText();
        }
        //Monitor
         if(this.buttonGroup3.getSelection() == this.monitor1.getModel()) {
            this.nombreMonitor = this.monitor1.getText();
        }
        else if(this.buttonGroup3.getSelection() == this.monitor2.getModel()) {
            this.nombreMonitor = this.monitor2.getText();
        }
        else if(this.buttonGroup3.getSelection() == this.monitor3.getModel()) {
            this.nombreMonitor = this.monitor3.getText();
        }
        else if(this.buttonGroup3.getSelection() == this.monitor4.getModel()) {
            this.nombreMonitor = this.monitor4.getText();
        }
        //DiscoDuro
         if(this.buttonGroup4.getSelection() == this.disco1.getModel()) {
            this.nombreDD = this.disco1.getText();
        }
        else if(this.buttonGroup4.getSelection() == this.disco2.getModel()) {
            this.nombreDD = this.disco2.getText();
        }
        else if(this.buttonGroup4.getSelection() == this.disco3.getModel()) {
            this.nombreDD = this.disco3.getText();
        }
        else if(this.buttonGroup4.getSelection() == this.disco4.getModel()) {
            this.nombreDD = this.disco4.getText();
        }
    }  
      
    public void contarVentas() {
        Vector<Venta> ventasusuario = new Vector();
        for(int i = 0; i < this.historialVentas.size(); i++) {
            if(this.historialVentas.get(i).getNombre().equals(this.textname.getText())) {
                ventasusuario.add(this.historialVentas.get(i));
            }
        }
        //Siempre imprimimos la primera venta que coincida con el nombre, haya una o varias
        comprobarLocalidad(ventasusuario.get(0));
        comprobarProcesador(ventasusuario.get(0));
        comprobarMemoria(ventasusuario.get(0));
        comprobarMonitor(ventasusuario.get(0));
        comprobarDD(ventasusuario.get(0));
        comprobarOpciones(ventasusuario.get(0));
       //Si hay mas de una venta se ejecuta el for
        for(int i = 1; i < ventasusuario.size();) {
            bloquearTodo();
            Object[] options = {"Sí", "No"};
            int selection = JOptionPane.showOptionDialog(
            null,
            "Hemos encontrado más ventas relacionadas a este mismo nombre, ¿quieres ver la siguiente?",
            "Siguiente Venta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0] 
            );
            if(selection == 0) {
                comprobarLocalidad(ventasusuario.get(i));
                comprobarProcesador(ventasusuario.get(i));
                comprobarMemoria(ventasusuario.get(i));
                comprobarMonitor(ventasusuario.get(i));
                comprobarDD(ventasusuario.get(i));
                comprobarOpciones(ventasusuario.get(i));
                i++;
            }
            else {
                break;
            }
                
        }
    }
    
    public void bloquearTodo() {
         this.opcioneslocalidad.setEnabled(false);
         this.procesador1.setEnabled(false);
         this.procesador2.setEnabled(false);
         this.procesador3.setEnabled(false);
         this.procesador4.setEnabled(false);
         this.memoria1.setEnabled(false);
         this.memoria2.setEnabled(false);
         this.memoria3.setEnabled(false);
         this.memoria4.setEnabled(false);
         this.monitor1.setEnabled(false);
         this.monitor2.setEnabled(false);
         this.monitor3.setEnabled(false);
         this.monitor4.setEnabled(false);
         this.disco1.setEnabled(false);
         this.disco2.setEnabled(false);
         this.disco3.setEnabled(false);
         this.disco4.setEnabled(false);
         this.opciones1.setEnabled(false);
         this.opciones2.setEnabled(false);
         this.opciones3.setEnabled(false);
         this.opciones4.setEnabled(false);
         this.botonañadir.setEnabled(false);
         this.botonbuscar.setEnabled(false);
         this.botoneliminar.setEnabled(false);
         this.textname.grabFocus();
     }
     
     public void activarTodo() {
         this.opcioneslocalidad.setEnabled(true);
         this.procesador1.setEnabled(true);
         this.procesador2.setEnabled(true);
         this.procesador3.setEnabled(true);
         this.procesador4.setEnabled(true);
         this.memoria1.setEnabled(true);
         this.memoria2.setEnabled(true);
         this.memoria3.setEnabled(true);
         this.memoria4.setEnabled(true);
         this.monitor1.setEnabled(true);
         this.monitor2.setEnabled(true);
         this.monitor3.setEnabled(true);
         this.monitor4.setEnabled(true);
         this.disco1.setEnabled(true);
         this.disco2.setEnabled(true);
         this.disco3.setEnabled(true);
         this.disco4.setEnabled(true);
         this.opciones1.setEnabled(true);
         this.opciones2.setEnabled(true);
         this.opciones3.setEnabled(true);
         this.opciones4.setEnabled(true);
         this.botonañadir.setEnabled(true);
         this.botonbuscar.setEnabled(true);
         this.textolocalidad.grabFocus();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        disco1 = new javax.swing.JRadioButton();
        disco2 = new javax.swing.JRadioButton();
        disco3 = new javax.swing.JRadioButton();
        disco4 = new javax.swing.JRadioButton();
        textoclientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaclientes = new javax.swing.JList<>();
        textoopciones = new javax.swing.JLabel();
        opciones1 = new javax.swing.JCheckBox();
        opciones2 = new javax.swing.JCheckBox();
        procesador3 = new javax.swing.JRadioButton();
        opciones3 = new javax.swing.JCheckBox();
        procesador4 = new javax.swing.JRadioButton();
        opciones4 = new javax.swing.JCheckBox();
        memoria1 = new javax.swing.JRadioButton();
        botonañadir = new javax.swing.JButton();
        memoria2 = new javax.swing.JRadioButton();
        botonbuscar = new javax.swing.JButton();
        memoria3 = new javax.swing.JRadioButton();
        botoncancelar = new javax.swing.JButton();
        memoria4 = new javax.swing.JRadioButton();
        botonsalir = new javax.swing.JButton();
        textomonitor = new javax.swing.JLabel();
        botoneliminar = new javax.swing.JButton();
        monitor1 = new javax.swing.JRadioButton();
        monitor2 = new javax.swing.JRadioButton();
        monitor3 = new javax.swing.JRadioButton();
        labelnombre = new javax.swing.JLabel();
        textname = new javax.swing.JTextField();
        textolocalidad = new javax.swing.JLabel();
        opcioneslocalidad = new javax.swing.JComboBox<>();
        textoprocesador = new javax.swing.JLabel();
        textomedia = new javax.swing.JLabel();
        procesador1 = new javax.swing.JRadioButton();
        procesador2 = new javax.swing.JRadioButton();
        monitor4 = new javax.swing.JRadioButton();
        textidisco = new javax.swing.JLabel();
        botoncargar = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup4.add(disco1);
        disco1.setText("60 GB");
        disco1.setEnabled(false);
        disco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disco1ActionPerformed(evt);
            }
        });

        buttonGroup4.add(disco2);
        disco2.setText("80 GB");
        disco2.setEnabled(false);

        buttonGroup4.add(disco3);
        disco3.setText("120 GB");
        disco3.setEnabled(false);

        buttonGroup4.add(disco4);
        disco4.setText("200 GB");
        disco4.setEnabled(false);

        textoclientes.setText("Lista de clientes");

        listaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaclientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaclientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listaclientes);

        textoopciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoopciones.setText("Opciones");

        opciones1.setText("Grabadora DVD");
        opciones1.setEnabled(false);

        opciones2.setText("Wifi");
        opciones2.setEnabled(false);

        buttonGroup1.add(procesador3);
        procesador3.setText("P4 Celeron");
        procesador3.setToolTipText("");
        procesador3.setEnabled(false);

        opciones3.setText("Sintonizador TV");
        opciones3.setEnabled(false);

        buttonGroup1.add(procesador4);
        procesador4.setText("AMD 650");
        procesador4.setEnabled(false);

        opciones4.setText("Backup/Restore");
        opciones4.setEnabled(false);

        buttonGroup2.add(memoria1);
        memoria1.setText("128 MB");
        memoria1.setEnabled(false);

        botonañadir.setText("Añadir");
        botonañadir.setEnabled(false);
        botonañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonañadirActionPerformed(evt);
            }
        });

        buttonGroup2.add(memoria2);
        memoria2.setText("256 MB");
        memoria2.setEnabled(false);

        botonbuscar.setText("Buscar");
        botonbuscar.setEnabled(false);
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        buttonGroup2.add(memoria3);
        memoria3.setText("512 MB");
        memoria3.setToolTipText("");
        memoria3.setEnabled(false);
        memoria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoria3ActionPerformed(evt);
            }
        });

        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        buttonGroup2.add(memoria4);
        memoria4.setText("1024 MB");
        memoria4.setEnabled(false);

        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        textomonitor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textomonitor.setText("Monitor");

        botoneliminar.setText("Eliminar");
        botoneliminar.setEnabled(false);
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        buttonGroup3.add(monitor1);
        monitor1.setText("15''");
        monitor1.setEnabled(false);

        buttonGroup3.add(monitor2);
        monitor2.setText("17''");
        monitor2.setEnabled(false);

        buttonGroup3.add(monitor3);
        monitor3.setText("TFT 15''");
        monitor3.setEnabled(false);

        labelnombre.setText("Nombre del cliente");

        textname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textnameCaretUpdate(evt);
            }
        });
        textname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textnameFocusLost(evt);
            }
        });
        textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnameActionPerformed(evt);
            }
        });
        textname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textnameKeyTyped(evt);
            }
        });

        textolocalidad.setText("Localidad");

        opcioneslocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Villalba", "Los Molinos", "Guadarrama", "Collado Mediano", "Alpedrete", "Moralzarzal" }));
        opcioneslocalidad.setEnabled(false);
        opcioneslocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioneslocalidadActionPerformed(evt);
            }
        });

        textoprocesador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoprocesador.setText("Procesador");

        textomedia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textomedia.setText("Memoria");

        buttonGroup1.add(procesador1);
        procesador1.setText("P4 3.0 GB");
        procesador1.setEnabled(false);
        procesador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesador1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(procesador2);
        procesador2.setText("P4 3.2 GB");
        procesador2.setEnabled(false);

        buttonGroup3.add(monitor4);
        monitor4.setText("TFT 17''");
        monitor4.setEnabled(false);

        textidisco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textidisco.setText("Disco Duro");

        botoncargar.setText("Cargar");
        botoncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncargarActionPerformed(evt);
            }
        });

        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addComponent(botonguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botoncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(483, 483, 483)
                                .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelnombre)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(138, 138, 138)
                                                .addComponent(textoclientes))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(textolocalidad)
                                                .addGap(28, 28, 28)
                                                .addComponent(opcioneslocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(procesador1)
                                            .addComponent(procesador2)
                                            .addComponent(procesador3)
                                            .addComponent(procesador4)
                                            .addComponent(textoprocesador)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(botonañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(memoria4)
                                            .addComponent(memoria3)
                                            .addComponent(memoria2)
                                            .addComponent(memoria1)
                                            .addComponent(textomedia))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(monitor4)
                                            .addComponent(monitor1)
                                            .addComponent(monitor2)
                                            .addComponent(monitor3)
                                            .addComponent(textomonitor))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(disco4)
                                            .addComponent(disco3)
                                            .addComponent(disco2)
                                            .addComponent(disco1)
                                            .addComponent(textidisco))
                                        .addGap(103, 103, 103)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opciones2)
                                            .addComponent(opciones1)
                                            .addComponent(opciones3)
                                            .addComponent(opciones4)
                                            .addComponent(textoopciones))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botoneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botoncancelar)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelnombre)
                            .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoclientes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textolocalidad)
                            .addComponent(opcioneslocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoprocesador)
                    .addComponent(textomedia)
                    .addComponent(textomonitor)
                    .addComponent(textidisco)
                    .addComponent(textoopciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procesador1)
                    .addComponent(memoria1)
                    .addComponent(monitor1)
                    .addComponent(disco1)
                    .addComponent(opciones1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procesador2)
                    .addComponent(memoria2)
                    .addComponent(monitor2)
                    .addComponent(disco2)
                    .addComponent(opciones2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procesador3)
                    .addComponent(memoria3)
                    .addComponent(monitor3)
                    .addComponent(disco3)
                    .addComponent(opciones3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procesador4)
                    .addComponent(memoria4)
                    .addComponent(monitor4)
                    .addComponent(disco4)
                    .addComponent(opciones4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonañadir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botoneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botoncargar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(8, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botoncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memoria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoria3ActionPerformed

    private void procesador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesador1ActionPerformed

    private void botonañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonañadirActionPerformed
        //Para que no se puedan añadir ventas sin nombre
        if(this.textname.getText().isEmpty()){
            JOptionPane.showConfirmDialog(this,"DEBES RELLENAR ESTE CAMPO", "ERROR", JOptionPane.CLOSED_OPTION);
            this.textname.grabFocus();
        } else {
        Vector opcionesElegidas = new Vector();
        if(this.opciones1.isSelected()) {
            opcionesElegidas.addElement(this.opciones1.getText());
        }
        if(this.opciones2.isSelected()) {
            opcionesElegidas.addElement(this.opciones2.getText());
        }
        if(this.opciones3.isSelected()) {
            opcionesElegidas.addElement(this.opciones3.getText());
        }
        if(this.opciones4.isSelected()) {
            opcionesElegidas.addElement(this.opciones4.getText());
        }
      
        cogerTexto();
        
        this.historialVentas.addElement(new Venta(this.textname.getText(), this.opcioneslocalidad.getSelectedItem(), 
                this.nombreProcesador, 
                this.nombreMemoria, 
                this.nombreMonitor, 
                this.nombreDD, 
                opcionesElegidas));
        
        nombresclientes.addElement(this.textname.getText());
        listaclientes.setListData(nombresclientes);
        bloquearTodo();
        this.textname.setText("");
        if(this.historialVentas.size() >= 1) {
            this.botonguardar.setEnabled(true);
        }
        }
    }//GEN-LAST:event_botonañadirActionPerformed

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        contarVentas();
        bloquearTodo();
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed
        int seguro = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres borrar esta venta?", "ELIMINAR VENTA", JOptionPane.YES_NO_OPTION);
        if (seguro == JOptionPane.YES_OPTION) {

        this.historialVentas.remove(listaclientes.getSelectedIndex());
        this.nombresclientes.remove(this.textname.getText());
         
        this.listaclientes.setListData(nombresclientes);
        bloquearTodo();
        if(!this.textname.getText().isEmpty()) {
            this.textname.setText("");
        }   
        }
        this.botoneliminar.setEnabled(false);
    }//GEN-LAST:event_botoneliminarActionPerformed

    private void textnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnameActionPerformed
       if (!this.textname.getText().isEmpty() && this.textname.getText().matches("^[A-Za-z]{1,15}$")){
           activarTodo();
           this.procesador2.setSelected(true);
           this.memoria4.setSelected(true);
           this.monitor4.setSelected(true);
           this.disco4.setSelected(true);
           this.opciones1.setSelected(true);
           this.opciones2.setSelected(true);
           this.opciones3.setSelected(false);
           this.opciones4.setSelected(false);
           this.opcioneslocalidad.setSelectedItem("Villalba");
           this.textolocalidad.grabFocus();
       }
       else {
           JOptionPane.showConfirmDialog(this,"DEBES RELLENAR ESTE CAMPO SIN NUMEROS Y MENOS DE 15 CARACTERES", "ERROR", JOptionPane.CLOSED_OPTION);
           this.textname.grabFocus();
       }
    }//GEN-LAST:event_textnameActionPerformed

    private void textnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textnameKeyTyped

    private void opcioneslocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioneslocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcioneslocalidadActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        try {
        FileInputStream fis = new FileInputStream(new File("ventas.bin"));
        ObjectInputStream cargarbin = new ObjectInputStream(fis);
            while(fis.available() > 0) {
                Venta caca = (Venta) cargarbin.readObject();
                    if(this.historialVentas.contains(caca)) { 
                    System.exit(0);
                    }
                JOptionPane.showConfirmDialog(this,"No has guardado las ventas", "ERROR", JOptionPane.CLOSED_OPTION);  
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            ex.printStackTrace();
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
    }//GEN-LAST:event_botonsalirActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        this.textname.setText("");
        this.opcioneslocalidad.setSelectedItem("Villalba");
        this.opcioneslocalidad.setEnabled(false);
        
        if(this.procesador1.isEnabled()) {
            this.procesador1.setEnabled(false);
            this.procesador1.setSelected(false);
        }
        if(this.procesador2.isEnabled()) {
            this.procesador2.setEnabled(false);
            this.procesador2.setSelected(true);
        }
        if(this.procesador3.isEnabled()) {
            this.procesador3.setEnabled(false);
            this.procesador3.setSelected(false);
        }
        if(this.procesador4.isEnabled()) {
            this.procesador4.setEnabled(false);
            this.procesador4.setSelected(false);
        }
        
        if(this.memoria1.isEnabled()) {
            this.memoria1.setEnabled(false);
            this.memoria1.setSelected(false);
        }
        if(this.memoria2.isEnabled()) {
            this.memoria2.setEnabled(false);
            this.memoria2.setSelected(false);
        }
        if(this.memoria3.isEnabled()) {
            this.memoria3.setEnabled(false);
            this.memoria3.setSelected(false);
        }
        if(this.memoria4.isEnabled()) {
            this.memoria4.setEnabled(false);
            this.memoria4.setSelected(true);
        }
        
        if(this.monitor1.isEnabled()) {
            this.monitor1.setEnabled(false);
            this.monitor1.setSelected(false);
        }
        if(this.monitor2.isEnabled()) {
            this.monitor2.setEnabled(false);
            this.monitor2.setSelected(false);
        }
        if(this.monitor3.isEnabled()) {
            this.monitor3.setEnabled(false);
            this.monitor3.setSelected(false);
        }
        if(this.monitor4.isEnabled()) {
            this.monitor4.setEnabled(false);
            this.monitor4.setSelected(true);
        }
        
        if(this.disco1.isEnabled()) {
            this.disco1.setEnabled(false);
            this.disco1.setSelected(false);
        }
        if(this.disco2.isEnabled()) {
            this.disco2.setEnabled(false);
            this.disco2.setSelected(false);
        }
        if(this.disco3.isEnabled()) {
            this.disco3.setEnabled(false);
            this.disco3.setSelected(false);
        }
        if(this.disco4.isEnabled()) {
            this.disco4.setEnabled(false);
            this.disco4.setSelected(true);
        }
        
        if(this.opciones1.isEnabled()) {
            this.opciones1.setEnabled(false);
            this.opciones1.setSelected(true);
        }
        if(this.opciones2.isEnabled()) {
            this.opciones2.setEnabled(false);
            this.opciones2.setSelected(true);
        }
        if(this.opciones3.isEnabled()) {
            this.opciones3.setEnabled(false);
            this.opciones3.setSelected(false);
        }
        if(this.opciones4.isEnabled()) {
            this.opciones4.setEnabled(false);
            this.opciones4.setSelected(false);
        }
    }//GEN-LAST:event_botoncancelarActionPerformed

    private void disco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disco1ActionPerformed

    private void listaclientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaclientesMousePressed
        //Elegir la venta sobre la que se haga click para operar con ella
        Venta elegida = this.historialVentas.get(this.listaclientes.getSelectedIndex());
        this.textname.setText(elegida.getNombre());
        comprobarLocalidad(elegida);
        comprobarProcesador(elegida);
        comprobarMemoria(elegida);
        comprobarMonitor(elegida);
        comprobarDD(elegida);
        comprobarOpciones(elegida);
        botonbuscar.setEnabled(false);
        botonañadir.setEnabled(false);
        //Esta hara que solo se active el eliminar 
        this.botoneliminar.setEnabled(true);
    }//GEN-LAST:event_listaclientesMousePressed

    private void listaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaclientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaclientesMouseClicked

    private void textnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textnameCaretUpdate
               // TODO add your handling code here:
        this.botoneliminar.setEnabled(false);
    }//GEN-LAST:event_textnameCaretUpdate

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        // TODO add your handling code here:
        try {
            PrintWriter ficheroTexto = new PrintWriter(new FileWriter(new File("ventas.txt")));
            
            for(Venta v: this.historialVentas) {
                ficheroTexto.println(v.toString());
            }
            
            ficheroTexto.close();
            
            ObjectOutputStream ficheroBin = new ObjectOutputStream(new FileOutputStream(new File("ventas.bin")));
            
              for(Venta v: this.historialVentas) {
                ficheroBin.writeObject(v);
                ficheroBin.flush();
            }
                ficheroBin.close();
                this.historialVentas.clear();
                this.nombresclientes.clear();
                this.listaclientes.setListData(this.nombresclientes);
        } catch (IOException ex) {
            Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      
    }//GEN-LAST:event_botonguardarActionPerformed

    private void botoncargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncargarActionPerformed
        try {
            FileInputStream fis = new FileInputStream(new File("ventas.bin"));
            ObjectInputStream cargarbin = new ObjectInputStream(fis);
            Vector<Venta> nuevaLista = new Vector<>(); 
            while(fis.available() > 0) {
                Venta caca = (Venta) cargarbin.readObject();
                nuevaLista.add(caca);
            }
            if(!nuevaLista.isEmpty()) {
                this.textname.setText(nuevaLista.get(0).getNombre());
                comprobarLocalidad(nuevaLista.get(0));
                comprobarProcesador(nuevaLista.get(0));
                comprobarMemoria(nuevaLista.get(0));
                comprobarMonitor(nuevaLista.get(0));
                comprobarDD(nuevaLista.get(0));
                comprobarOpciones(nuevaLista.get(0));
                    if (nuevaLista.size() > 1) {
                        int i = 1;
                        int seguro;
                        seguro = JOptionPane.showConfirmDialog(this, "Hay mas ventas, ¿quieres ver la siguiente?", "MAS VENTAS", JOptionPane.YES_NO_OPTION); 
                        do {
                        this.textname.setText(nuevaLista.get(i).getNombre());
                            comprobarLocalidad(nuevaLista.get(i));
                            comprobarProcesador(nuevaLista.get(i));
                            comprobarMemoria(nuevaLista.get(i));
                            comprobarMonitor(nuevaLista.get(i));
                            comprobarDD(nuevaLista.get(i));
                            comprobarOpciones(nuevaLista.get(i));
                            i++;
                            seguro = JOptionPane.showConfirmDialog(this, "Hay mas ventas, ¿quieres ver la siguiente?", "MAS VENTAS", JOptionPane.YES_NO_OPTION);    
                        }
                        while(i < nuevaLista.size() && seguro == JOptionPane.YES_OPTION);
                    } 
            }
            else {
              JOptionPane.showMessageDialog(this, "No hay mas ventas.", "MAS VENTAS", JOptionPane.INFORMATION_MESSAGE);;
            }
           
            
            fis.close();
            cargarbin.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(Caca.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_botoncargarActionPerformed

    private void textnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textnameFocusLost

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caca().setVisible(true);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonañadir;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botoncargar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton disco1;
    private javax.swing.JRadioButton disco2;
    private javax.swing.JRadioButton disco3;
    private javax.swing.JRadioButton disco4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JList<String> listaclientes;
    private javax.swing.JRadioButton memoria1;
    private javax.swing.JRadioButton memoria2;
    private javax.swing.JRadioButton memoria3;
    private javax.swing.JRadioButton memoria4;
    private javax.swing.JRadioButton monitor1;
    private javax.swing.JRadioButton monitor2;
    private javax.swing.JRadioButton monitor3;
    private javax.swing.JRadioButton monitor4;
    private javax.swing.JCheckBox opciones1;
    private javax.swing.JCheckBox opciones2;
    private javax.swing.JCheckBox opciones3;
    private javax.swing.JCheckBox opciones4;
    private javax.swing.JComboBox<String> opcioneslocalidad;
    private javax.swing.JRadioButton procesador1;
    private javax.swing.JRadioButton procesador2;
    private javax.swing.JRadioButton procesador3;
    private javax.swing.JRadioButton procesador4;
    private javax.swing.JLabel textidisco;
    private javax.swing.JTextField textname;
    private javax.swing.JLabel textoclientes;
    private javax.swing.JLabel textolocalidad;
    private javax.swing.JLabel textomedia;
    private javax.swing.JLabel textomonitor;
    private javax.swing.JLabel textoopciones;
    private javax.swing.JLabel textoprocesador;
    // End of variables declaration//GEN-END:variables
}
