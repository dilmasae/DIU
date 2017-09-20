/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jswingpractica1;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Edilma Alvaraado Espinoza y Levi Ma
 */
public class JFramePractica1 extends javax.swing.JFrame {

    /**
     * Creates new form JFramePractica1
     */
    public JFramePractica1() {
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

        jPanel1 = new javax.swing.JPanel();
        valorTextField = new javax.swing.JTextField();
        divisa1 = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        divisa1Label = new javax.swing.JLabel();
        btnDivisa2 = new javax.swing.JButton();
        btnDivisa1 = new javax.swing.JButton();
        divisa2 = new javax.swing.JTextField();
        divisaLabel = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        autoresLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor De Divisas");
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(450, 250));
        setSize(new java.awt.Dimension(50, 50));

        valorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTextFieldActionPerformed(evt);
            }
        });

        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });

        valorLabel.setText("Tipo de valor");

        divisa1Label.setText("Importe");

        btnDivisa2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDivisa2.setText("<");
        btnDivisa2.setActionCommand("btnDivisa2");
        btnDivisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisa2ActionPerformed(evt);
            }
        });

        btnDivisa1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDivisa1.setText(">");
        btnDivisa1.setActionCommand("btnDivisa1");
        btnDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisa1ActionPerformed(evt);
            }
        });

        divisaLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        divisaLabel.setText("dolar > euro");

        mensajeLabel.setForeground(new java.awt.Color(255, 51, 0));

        jLabel1.setText("Importe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(valorLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(divisa1Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDivisa2)
                                    .addComponent(btnDivisa1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(divisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(divisaLabel)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDivisa1)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(divisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(divisa1Label))
                            .addComponent(btnDivisa2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(divisaLabel)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        autoresLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        autoresLabel.setText("Edilma Alvarado Espinoza y Levi Malest Villareal - Practica1");
        autoresLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autoresLabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(autoresLabel)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTextFieldActionPerformed
    
    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisa1ActionPerformed

    private String changeToTwoDigits(Double number){
        return new DecimalFormat("#.00").format(number).toString();
    }

    private boolean numberNotEmpty(String text){
        return !text.isEmpty();
    }

    private Double isPositiveNumber(Double number){
        if(number >= 0) return number;
        else return number*-1.00;
    }

  
    private void btnDivisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisa1ActionPerformed
 
        try{
            if(!numberNotEmpty(valorTextField.getText())&& !numberNotEmpty(divisa1.getText())){
                mensajeLabel.setText("Campos vacíos.");
            }
            else{
                valorTextField.setText(isPositiveNumber(Double.parseDouble(valorTextField.getText())) + "");
                divisa1.setText(isPositiveNumber(Double.parseDouble(divisa1.getText())) + "");
                divisa2.setText(changeToTwoDigits(isPositiveNumber(Double.parseDouble(valorTextField.getText())) * isPositiveNumber(Double.parseDouble(divisa1.getText()))));
                mensajeLabel.setText("");
                divisaLabel.setText("dolar > euro");
            }
        }catch(Exception e){
            mensajeLabel.setText("valores invalidos");
        }   
    }//GEN-LAST:event_btnDivisa1ActionPerformed

    private void btnDivisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisa2ActionPerformed
        // TODO add your handling code here:
        try{
            if(!numberNotEmpty(valorTextField.getText())&& !numberNotEmpty(divisa2.getText())){
                mensajeLabel.setText("Campos vacíos.");
            }
            else{
                valorTextField.setText(isPositiveNumber(Double.parseDouble(valorTextField.getText())) + "");
                divisa2.setText(isPositiveNumber(Double.parseDouble(divisa2.getText())) + "");
                divisa1.setText(changeToTwoDigits(isPositiveNumber(Double.parseDouble(valorTextField.getText())) * isPositiveNumber(Double.parseDouble(divisa2.getText()))));
                mensajeLabel.setText("");
                divisaLabel.setText("dolar < euro");
            }
        }catch(Exception e){
            mensajeLabel.setText("valores invalidos");
        }
    }//GEN-LAST:event_btnDivisa2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePractica1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoresLabel;
    private javax.swing.JButton btnDivisa1;
    private javax.swing.JButton btnDivisa2;
    private javax.swing.JTextField divisa1;
    private javax.swing.JLabel divisa1Label;
    private javax.swing.JTextField divisa2;
    private javax.swing.JLabel divisaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorTextField;
    // End of variables declaration//GEN-END:variables
}
