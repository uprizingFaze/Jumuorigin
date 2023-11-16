/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumuorigin;

import java.awt.BorderLayout;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.Group;

import javax.swing.*;

/**
 *
 * @author julia
 */
public class DETALLADO extends javax.swing.JFrame {

    PRINCIPAL.datosVuelo datosVueloInstance;
    Map<Vuelo, String> videosPorVuelo;

    public DETALLADO(PRINCIPAL.datosVuelo datosVuelo) {
        initComponents();

        // Almacenar la instancia de datosVuelo
        this.datosVueloInstance = datosVuelo;

        // Establecer el texto de los jLabel
        jLabel12.setText(datosVuelo.getPuntoPartida());
        jLabel14.setText(datosVuelo.getDestino());
        jLabel13.setText(datosVuelo.getHoraDespegue());
        jLabel15.setText(datosVuelo.getAterrizaje());

        // Establecer el texto del jButton
        jButton2.setText("Precio: " + datosVuelo.getPrecio());
        System.out.println("Price");
        // Inicializar el mapa de videos
        videosPorVuelo = new HashMap<>();
        
        System.out.println("Vuelos 1");

        // Aquí debes agregar todos los videos correspondientes a cada combinación de vuelo
        videosPorVuelo.put(new Vuelo("CARTAGENA", "SANTA MARTA"), "jumuorigin/videos/CARTAGENA-SANTAMARTA.mp4");
        videosPorVuelo.put(new Vuelo("CARTAGENA", "CALI"), "/jumuorigin/videos/CARTAGENA - CALI.mp4");
        videosPorVuelo.put(new Vuelo("Punto", "MEDELLIN"), "/jumuorigin/videos/CARTAGENA - MEDELLIN.mp4");
        videosPorVuelo.put(new Vuelo("CARTAGENA", "BOGOTA"), "/jumuorigin/videos/CARTAGENA - BOGOTA.mp4");
        videosPorVuelo.put(new Vuelo("CALI", "CARTAGENA"), "/jumuorigin/videos/CALI - CARTAGENA.mp4");
        videosPorVuelo.put(new Vuelo("CALI", "SANTA MARTA"), "/jumuorigin/videos/CALI - SANTAMARTA.mp4");
        videosPorVuelo.put(new Vuelo("CALI", "MEDELLIN"), "/jumuorigin/videos/CALI - MEDELLIN.mp4");
        videosPorVuelo.put(new Vuelo("CALI", "BOGOTA"), "/jumuorigin/videos/CALI - BOGOTA.mp4");
        videosPorVuelo.put(new Vuelo("SANTA MARTA", "CARTAGENA"), "/jumuorigin/videos/SANTAMARTA - CARTAGENA.mp4");
        videosPorVuelo.put(new Vuelo("SANTA MARTA", "CALI"), "/jumuorigin/videos/SANTAMARTA - CALI.mp4");
        videosPorVuelo.put(new Vuelo("SANTA MARTA", "MEDELLIN"), "/jumuorigin/videos/SANTAMARTA - MEDELLIN.mp4");
        videosPorVuelo.put(new Vuelo("SANTA MARTA", "BOGOTA"), "/jumuorigin/videos/SANTAMARTA - BOGOTA.mp4");
        videosPorVuelo.put(new Vuelo("MEDELLIN", "CARTAGENA"), "/jumuorigin/videos/MEDELLIN - CARTAGENA.mp4");
        videosPorVuelo.put(new Vuelo("MEDELLIN", "CALI"), "/jumuorigin/videos/MEDELLIN - CALI.mp4");
        videosPorVuelo.put(new Vuelo("MEDELLIN", "SANTA MARTA"), "/jumuorigin/videos/MEDELLIN - SANTAMARTA.mp4");
        videosPorVuelo.put(new Vuelo("MEDELLIN", "BOGOTA"), "/jumuorigin/videos/MEDELLIN - BOGOTA.mp4");
        videosPorVuelo.put(new Vuelo("BOGOTA", "CARTAGENA"), "/jumuorigin/videos/BOGOTA - CARTAGENA.mp4");
        videosPorVuelo.put(new Vuelo("BOGOTA", "CALI"), "/jumuorigin/videos/BOGOTA - CALI.mp4");
        videosPorVuelo.put(new Vuelo("BOGOTA", "SANTA MARTA"), "/jumuorigin/videos/BOGOTA - SANTAMARTA.mp4");
        videosPorVuelo.put(new Vuelo("BOGOTA", "MEDELLIN"), "/jumuorigin/videos/BOGOTA - MEDELLIN.mp4");

        // etc.
        System.out.println("Vuelos 2");
        
        System.out.println("Vuelos 3");

    }

   public void mostrarVideo() {
    System.out.println("D11");

    // Obtener el video correspondiente al vuelo
    String video = videosPorVuelo.get(new Vuelo(datosVueloInstance.getPuntoPartida(), datosVueloInstance.getDestino()));
    File videoFile = new File(video);
    URI videoUri = videoFile.toURI();
    System.out.println("Video: " + video);
    System.out.println("URI: " + videoUri);

    JFXPanel jfxPanel = new JFXPanel();
    Platform.runLater(() -> {
        Media media = new Media(videoUri.toString());
        MediaPlayer player = new MediaPlayer(media);
        MediaView viewer = new MediaView(player);

        viewer.fitWidthProperty().bind(Bindings.selectDouble(viewer.sceneProperty(), "width"));
        viewer.fitHeightProperty().bind(Bindings.selectDouble(viewer.sceneProperty(), "height"));
        viewer.setPreserveRatio(true);

        player.play();
        System.out.println("D22");
        Scene scene = new Scene(new Group(viewer));
        jfxPanel.setScene(scene);
    });

    // Agregar el reproductor de video al JPanel
    videoPanel.setLayout(new BorderLayout());
    videoPanel.add(jfxPanel, BorderLayout.CENTER);

    // Revalidar y repintar el JPanel para asegurarte de que el reproductor de video se muestre correctamente
    videoPanel.revalidate();
    videoPanel.repaint();
}

    public DETALLADO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        videoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/home (1).png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/logo (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout videoPanelLayout = new javax.swing.GroupLayout(videoPanel);
        videoPanel.setLayout(videoPanelLayout);
        videoPanelLayout.setHorizontalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        videoPanelLayout.setVerticalGroup(
            videoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/billete-de-avion (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("REVISA LOS DETALLES DE TU VUELO!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/ruta-de-vuelo (1) (1) (1).png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/despegar (1) (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("CIUDAD ORIGEN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("CIUDAD DESTINO");

        jLabel8.setText("HORA");

        jLabel9.setText("HORA");

        jButton2.setText("AQUI DIRIA PARA COMPRAR EL BOLETO O IMPRIMIRLO");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel14)))
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel4)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(videoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PRINCIPAL newframe = new PRINCIPAL();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.out.println("Punto de partida: " + datosVueloInstance.getPuntoPartida());
        System.out.println("Destino: " + datosVueloInstance.getDestino());
        System.out.println("Hora de despegue: " + datosVueloInstance.getHoraDespegue());
        System.out.println("Hora de aterrizaje: " + datosVueloInstance.getAterrizaje());
        System.out.println("Precio: " + datosVueloInstance.getPrecio());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DETALLADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DETALLADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DETALLADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DETALLADO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DETALLADO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel videoPanel;
    // End of variables declaration//GEN-END:variables
public class Vuelo {

        private String partida;
        private String destino;

        public Vuelo(String partida, String destino) {
            this.partida = partida;
            this.destino = destino;
        }

        // getters y setters
        public String getPartida() {
            return partida;
        }

        public void setPartida(String partida) {
            this.partida = partida;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Vuelo vuelo = (Vuelo) o;
            return Objects.equals(partida, vuelo.partida)
                    && Objects.equals(destino, vuelo.destino);
        }

        @Override
        public int hashCode() {
            return Objects.hash(partida, destino);
        }
    }

}
