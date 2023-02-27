package analizar;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.nio.file.FileSystems;
import static java.nio.file.StandardWatchEventKinds.*;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Date;
import java.util.List;
import java.nio.file.Path;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author TEC
 */
public class ventana extends javax.swing.JFrame {

    String Archivo;
    Path Ruta;
    Path rutacarpeta, fijo;

    public ventana() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        this.setTitle("WatchService Program");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        caja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("El directorio de la carpeta a observar sera el siguiente: ");

        boton.setBackground(new java.awt.Color(255, 0, 0));
        boton.setText("Start");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Selecciona la carpeta a observar");

        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        caja.setFont(new java.awt.Font("Yu Gothic UI", 3, 14)); // NOI18N
        caja.setForeground(new java.awt.Color(255, 255, 255));
        caja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caja.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seleccionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(boton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        System.out.println(Archivo);
        WatchServiceThread watchServiceThread = new WatchServiceThread(Ruta);
        Thread thread = new Thread(watchServiceThread);
        thread.start();

        WatchServiceThread1 watchServiceThread1 = new WatchServiceThread1(rutacarpeta);
        Thread thread1 = new Thread(watchServiceThread1);
        thread1.start();
    }//GEN-LAST:event_botonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                Archivo = selectedFile.getCanonicalPath();
                Ruta = selectedFile.toPath();
                rutacarpeta = Ruta.getParent();
                System.out.println("La ruta padre es: " + rutacarpeta);
            } catch (IOException ex) {
                Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
            }

            caja.setText(Archivo);

        }
    }//GEN-LAST:event_seleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel caja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables

    class WatchServiceThread implements Runnable {

        static File archivo;
        private final Path path;
        private WatchService watchService;

        public WatchServiceThread(Path path) {
            this.path = path;
        }

        @Override
        public void run() {

            try {
                watchService = FileSystems.getDefault().newWatchService();
                path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
                System.out.println("Iniciando observacion para " + path.getFileName());
                fijo = path;

                creararchivo();

                while (true) {

                    WatchKey key;

                    //Accionar el observador
                    key = watchService.take();

                    sleep(100);

                    //Recuperar el listado de eventos si es que sucede 
                    List<WatchEvent<?>> listaEventos = key.pollEvents();

                    //Recorrer el listado
                    for (WatchEvent<?> evento : listaEventos) {

                        //Capturar tipo de evento
                        Kind<?> tipoEvento = evento.kind();

                        //Obteniendo nombre del archivo
                        Path fileName = (Path) evento.context();

                        //Mostrar el tipo de evento junto el nombre del archivo
                        //System.out.println(tipoEvento.name() + ": "+ fileName);
                        if (tipoEvento == OVERFLOW) {
                            // continue;
                            JOptionPane.showMessageDialog(null, "<html><font color='red'>ERROR!</font></html>");
                        } else if (tipoEvento == ENTRY_DELETE) {

                          

                            Date date = new Date();

                            //Path sus = fileName.getFileName();
                            System.out.println("El archivo " + fileName + " a sido eliminado");

                            try {
                                FileWriter escritura = new FileWriter(archivo, true);
                                escritura.write("El archivo " + fileName + " a sido eliminado, HORA: " + date + "\n");
                                escritura.close();
                                System.out.println("El evento se agrego a la lista");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>NO SE PUEDE ESCRIBIR EN EL ARCHIVO!</font></html>");
                            }

                        } else if (tipoEvento == ENTRY_MODIFY) {

                            Date date = new Date();

                            System.out.println("El archivo " + fileName + " a sido modificado");

                            try {
                                FileWriter escritura = new FileWriter(archivo, true);
                                escritura.write("El archivo " + fileName + " a sido modificado, HORA: " + date + "\n");
                                escritura.close();
                                System.out.println("El evento se agrego a la lista");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>NO SE PUEDE ESCRIBIR EN EL ARCHIVO!</font></html>");
                            }

                        } else if (tipoEvento == ENTRY_CREATE) {

                            Date date = new Date();

                            System.out.println("El archivo " + fileName + " a sido Creado");

                            try {
                                FileWriter escritura = new FileWriter(archivo, true);
                                escritura.write("El archivo " + fileName + " a sido creado, HORA: " + date + "\n");
                                escritura.close();
                                System.out.println("El evento se agrego a la lista ");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>NO SE PUEDE ESCRIBIR EN EL ARCHIVO!</font></html>");
                            }

                        }
                    }

                    boolean valid = key.reset();
                    if (!valid) {
                        break;
                    }
                }
            } catch (IOException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, "<html><font color='red'>ERROR FATAL, VUELVA A SELECCIONAR UNA CARPETA!</font></html>");
            }
        }

        private static void creararchivo() {
            archivo = new File("log.txt");
            try {
                if (archivo.createNewFile()) {
                    System.out.println("archivo creado");
                } else {
                    System.out.println("el archivo existe y he sobreescrito sobre el");
                    String rutaCompleta = archivo.getAbsolutePath();
                    System.out.println(rutaCompleta);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "<html><font color='red'>EL ARCHIVO NO SE PUDO CREAR!</font></html>");
            }
        }

    }

    class WatchServiceThread1 implements Runnable {

        static File archivo;
        private final Path path;
        private WatchService watchService;

        public WatchServiceThread1(Path path) {
            this.path = path;
        }

        @Override
        public void run() {

            try {
                watchService = FileSystems.getDefault().newWatchService();
                path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
                System.out.println("Iniciando observacion para " + path.getFileName());

                creararchivo();

                while (true) {

                    WatchKey key;

                    //Accionar el observador
                    key = watchService.take();

                    sleep(100);

                    //Recuperar el listado de eventos si es que sucede 
                    List<WatchEvent<?>> listaEventos = key.pollEvents();

                    //Recorrer el listado
                    for (WatchEvent<?> evento : listaEventos) {

                        //Capturar tipo de evento
                        Kind<?> tipoEvento = evento.kind();

                        //Obteniendo nombre del archivo
                        Path fileName = (Path) evento.context();

                        //Mostrar el tipo de evento junto el nombre del archivo
                        //System.out.println(tipoEvento.name() + ": "+ fileName);
                        if (tipoEvento == OVERFLOW) {
                            // continue;
                            JOptionPane.showMessageDialog(null, "<html><font color='red'>ERROR!</font></html>");
                        } else if (tipoEvento == ENTRY_DELETE) {
                            
                             Path deletedPath = (Path) evento.context();

                            if (deletedPath.toString().equals(fijo.getFileName().toString())) {
                                System.out.println("La carpeta ha sido eliminada");
                                // Puedes hacer aquí lo que necesites en caso de que se borre la carpeta
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>LA CARPETA A SIDO ELIMINADA! POR FAVOR REINICIE EL PROGRAMA!</font></html>");
                            }

                            Date date = new Date();

                            //Path sus = fileName.getFileName();
                            System.out.println("La carpeta " + fileName + " a sido eliminado");

                            try {
                                FileWriter escritura = new FileWriter(archivo, true);
                                escritura.write("La carpeta " + fileName + " a sido eliminado, HORA: " + date + "\n");
                                escritura.close();
                                System.out.println("El evento se agrego a la lista");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>NO SE PUEDE ESCRIBIR EN EL ARCHIVO!</font></html>");
                            }

                        } else if (tipoEvento == ENTRY_CREATE) {
                            
                            Path deletedPath1 = (Path) evento.context();

                            if (deletedPath1.toString().equals(fijo.getFileName().toString())) {
                                System.out.println("La carpeta ha sido creada de nuevo");
                                // Puedes hacer aquí lo que necesites en caso de que se borre la carpeta
                                JOptionPane.showMessageDialog(null, "<html><font color='green'>LA CARPETA A SIDO CREADA!</font></html>");
                            }

                            Date date = new Date();

                            System.out.println("La carpeta " + fileName + " a sido Creado");

                            try {
                                FileWriter escritura = new FileWriter(archivo, true);
                                escritura.write("La carpeta " + fileName + " a sido creado, HORA: " + date + "\n");
                                escritura.close();
                                System.out.println("El evento se agrego a la lista ");
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "<html><font color='red'>NO SE PUEDE ESCRIBIR EN EL ARCHIVO!</font></html>");
                            }

                        }
                    }

                    boolean valid = key.reset();
                    if (!valid) {
                        break;
                    }
                }
            } catch (IOException | InterruptedException e) {
                JOptionPane.showMessageDialog(null, "<html><font color='red'>ERROR FATAL, REINICE EL PREGRAMA!</font></html>");
            }
        }

        private static void creararchivo() {
            archivo = new File("log.txt");
            try {
                if (archivo.createNewFile()) {
                    System.out.println("archivo creado");
                } else {
                    System.out.println("el archivo existe y he sobreescrito sobre el");
                    String rutaCompleta = archivo.getAbsolutePath();
                    System.out.println(rutaCompleta);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "<html><font color='red'>EL ARCHIVO NO SE PUDO CREAR!</font></html>");
            }
        }

    }

}