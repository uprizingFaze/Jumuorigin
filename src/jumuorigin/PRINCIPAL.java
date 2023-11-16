/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jumuorigin;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class PRINCIPAL extends javax.swing.JFrame {

    // Declarar el mapa como una variable de instancia
    private Map<String, String> abreviaturas;
    
        datosVuelo datosVueloInstance = new datosVuelo();

    /**
     * Creates new form PRINCIPAL
     */
    public PRINCIPAL() {
        initComponents();

        // Inicializar el mapa en el constructor
        abreviaturas = new HashMap<>();
        abreviaturas.put("BOGOTA", "BOG");
        abreviaturas.put("MEDELLIN", "MED");
        abreviaturas.put("SANTA MARTA", "STM");
        abreviaturas.put("CALI", "CAL");
        abreviaturas.put("CARTAGENA", "CRG");
        // ...añadir más ciudades y abreviaturas aquí...
    }

    public PRINCIPAL(String nombreUsuario) {
        initComponents();
        jLabel7.setText(nombreUsuario);
    }
    private String puntoPartida;
    private String destino;
    private String claseVuelo;
    private Date fecha;

    public class datosVuelo {

        private String puntoPartida;
        private String destino;
        private String claseVuelo;
        private Date fecha;
        private String horaDespegue;
        private String aterrizaje;
        private String precio;

        // Agrega aquí cualquier otro dato que necesites almacenar
        // Métodos getter y setter para cada variable
        public String getPuntoPartida() {
            return puntoPartida;
        }

        public void setPuntoPartida(String puntoPartida) {
            this.puntoPartida = puntoPartida;
        }

        public String getDestino() {
            return destino;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public String getClaseVuelo() {
            return claseVuelo;
        }

        public void setClaseVuelo(String claseVuelo) {
            this.claseVuelo = claseVuelo;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHoraDespegue() {
            return horaDespegue;
        }

        public void setHoraDespegue(String horaDespegue) {
            this.horaDespegue = horaDespegue;
        }

        public String getAterrizaje() {
            return aterrizaje;
        }

        public void setAterrizaje(String aterrizaje) {
            this.aterrizaje = aterrizaje;
        }

        public String getPrecio() {
            return precio;
        }

        public void setPrecio(String precio) {
            this.precio = precio;
        }

    }

    public datosVuelo crearDatosVuelo() {
        return new datosVuelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 53, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/home (1).png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 56, 50));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setText("INICIAR SESION");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 6, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setText("CREAR CUENTA");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 35, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/logo (2).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 6, 150, 40));

        jLabel5.setText("HACIA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 126, -1, -1));

        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 65));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setText("RESERVAR");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, 103, 41));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setText("CHECK IN");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 103, 41));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("MIS VIAJES");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 103, 41));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR...", "BOGOTA", "MEDELLIN", "SANTA MARTA", "CALI", "CARTAGENA" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.setName("PUNTOINICIAL"); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 77, 339, -1));

        jComboBox2.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR...", "BOGOTA", "MEDELLIN", "SANTA MARTA", "CALI", "CARTAGENA" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox2.setName("DESTINOINICIAL"); // NOI18N
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 121, 339, -1));

        jLabel4.setText("CLASE");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 170, 62, -1));

        jLabel2.setText("DESDE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 82, -1, -1));

        jComboBox3.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR...", "Basic Economy", "Main Cabin", "JUMU Comfort", "First Class", " " }));
        jComboBox3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox3.setName("CLASEVUELO"); // NOI18N
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 165, 121, -1));

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setText("BUSCAR ");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 200, -1));
        jPanel3.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel8.setText("HACIA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 126, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 510, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jumuorigin/imagen/Maldivas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 830, 301));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 360, 826, 367));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        CHECKIN newframe = new CHECKIN();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PRINCIPAL newframe = new PRINCIPAL();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        INICIARSESION newframe = new INICIARSESION();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CREARCUENTA newframe = new CREARCUENTA();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RESERVAS newframe = new RESERVAS();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HISTORIAL newframe = new HISTORIAL();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        puntoPartida = jComboBox1.getSelectedItem().toString();
        destino = jComboBox2.getSelectedItem().toString();
        claseVuelo = jComboBox3.getSelectedItem().toString();
        fecha = jDateChooser2.getDate();

        // Establecer los valores en datosVueloInstance
        datosVueloInstance.setPuntoPartida(puntoPartida);
        datosVueloInstance.setDestino(destino);
        datosVueloInstance.setClaseVuelo(claseVuelo);
        datosVueloInstance.setFecha(fecha);

        SELECCION newframe = new SELECCION(puntoPartida, destino, abreviaturas, datosVueloInstance);
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedItem = (String) evt.getItem();
            for (int i = 0; i < jComboBox2.getItemCount(); i++) {
                if (jComboBox2.getItemAt(i).equals(selectedItem)) {
                    jComboBox2.removeItemAt(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedItem = (String) evt.getItem();
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                if (jComboBox1.getItemAt(i).equals(selectedItem)) {
                    jComboBox1.removeItemAt(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
