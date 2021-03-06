/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.serialcomunication;

import app.serialcomunication.Arduino;
import java.awt.Color;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import panamahitek.Arduino.PanamaHitek_Arduino;



/**
 *
 * @author pedro
 */
public class Window extends javax.swing.JFrame {

    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();


public void ArduinoConnection() {
 
}
        public Window() {
        initComponents();
        try{
            arduino.arduinoTX("COM3",9600);
        }catch(Exception ex){
             Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        Apagar = new javax.swing.JButton();
        Encender = new javax.swing.JButton();
        Apagar3 = new javax.swing.JButton();
        Apagar4 = new javax.swing.JButton();
        Apagar5 = new javax.swing.JButton();
        ejemplo = new javax.swing.JButton();
        Apagar6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Apagar.setText("Servo 1 (cerrar)");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Encender.setText("Servo 1 (abrir)");
        Encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncenderActionPerformed(evt);
            }
        });

        Apagar3.setText("Servo 3 (cerrar)");
        Apagar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apagar3ActionPerformed(evt);
            }
        });

        Apagar4.setText("Servo 2 (cerrar)");
        Apagar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apagar4ActionPerformed(evt);
            }
        });

        Apagar5.setText("Servo 2 (abrir)");
        Apagar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apagar5ActionPerformed(evt);
            }
        });

        ejemplo.setText("Servo 3 (abrir)");
        ejemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejemploActionPerformed(evt);
            }
        });

        Apagar6.setText("Motor a pasos");
        Apagar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apagar6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Brazo Robotico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Apagar5)
                                .addGap(22, 22, 22)
                                .addComponent(Apagar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Encender)
                                .addGap(18, 18, 18)
                                .addComponent(Apagar)))
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ejemplo)
                        .addGap(18, 18, 18)
                        .addComponent(Apagar3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Apagar6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1)))
                .addGap(0, 182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encender)
                    .addComponent(Apagar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apagar5)
                    .addComponent(Apagar4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejemplo)
                    .addComponent(Apagar3))
                .addGap(46, 46, 46)
                .addComponent(Apagar6)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        try {
       arduino.sendData("1");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       } // TODO add your handling code here:
    }//GEN-LAST:event_ApagarActionPerformed

    private void EncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncenderActionPerformed
       try {
       arduino.sendData("2");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }
          // TODO add your handling code here:
    }//GEN-LAST:event_EncenderActionPerformed

    private void Apagar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apagar3ActionPerformed
         try {
       arduino.sendData("3");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }// TODO add your handling code here:
    }//GEN-LAST:event_Apagar3ActionPerformed

    private void Apagar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apagar4ActionPerformed
         try {
       arduino.sendData("4");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }
    }//GEN-LAST:event_Apagar4ActionPerformed

    private void Apagar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apagar5ActionPerformed
          try {
       arduino.sendData("5");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }
    }//GEN-LAST:event_Apagar5ActionPerformed

    private void ejemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejemploActionPerformed
         try {
       arduino.sendData("6");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }
    }//GEN-LAST:event_ejemploActionPerformed

    private void Apagar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apagar6ActionPerformed
    try {
       arduino.sendData("7");
       }catch(Exception ex){
           Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex); 
       }        // TODO add your handling code here:
    }//GEN-LAST:event_Apagar6ActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    public void correr(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Apagar3;
    private javax.swing.JButton Apagar4;
    private javax.swing.JButton Apagar5;
    private javax.swing.JButton Apagar6;
    private javax.swing.JButton Encender;
    private javax.swing.JButton ejemplo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
