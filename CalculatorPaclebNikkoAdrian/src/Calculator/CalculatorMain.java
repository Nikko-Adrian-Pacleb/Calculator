/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author nikko
 */
public class CalculatorMain extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorMain
     */
    public CalculatorMain() {
        initComponents();
    }
    
    DecimalFrame decimalFrame = new DecimalFrame();
    BinaryFrame binaryFrame = new BinaryFrame();
    OctalFrame octalFrame = new OctalFrame();
    HexFrame hexFrame = new HexFrame();
    CreditsFrame creditsFrame = new CreditsFrame();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuLabel = new javax.swing.JLabel();
        ToBinaryForm = new javax.swing.JButton();
        ToOctalForm = new javax.swing.JButton();
        ToHexaForm = new javax.swing.JButton();
        ToCreditsForm = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        ToDecimalForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(450, 600));
        setPreferredSize(new java.awt.Dimension(450, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuLabel.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 55)); // NOI18N
        MenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuLabel.setText("CALCULATOR");
        getContentPane().add(MenuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 90));

        ToBinaryForm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ToBinaryForm.setText("Binary");
        ToBinaryForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToBinaryFormActionPerformed(evt);
            }
        });
        getContentPane().add(ToBinaryForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 330, 60));

        ToOctalForm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ToOctalForm.setText("Octal");
        ToOctalForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToOctalFormActionPerformed(evt);
            }
        });
        getContentPane().add(ToOctalForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 330, 60));

        ToHexaForm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ToHexaForm.setText("Hexadecimal");
        ToHexaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToHexaFormActionPerformed(evt);
            }
        });
        getContentPane().add(ToHexaForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 60));

        ToCreditsForm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ToCreditsForm.setText("Credits");
        ToCreditsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToCreditsFormActionPerformed(evt);
            }
        });
        getContentPane().add(ToCreditsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 150, 60));

        Exit.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 150, 60));

        ToDecimalForm.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        ToDecimalForm.setText("Decimal");
        ToDecimalForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToDecimalFormActionPerformed(evt);
            }
        });
        getContentPane().add(ToDecimalForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToDecimalFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToDecimalFormActionPerformed
        decimalFrame.setVisible(true);
    }//GEN-LAST:event_ToDecimalFormActionPerformed

    private void ToBinaryFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToBinaryFormActionPerformed
        binaryFrame.setVisible(true);
    }//GEN-LAST:event_ToBinaryFormActionPerformed

    private void ToOctalFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToOctalFormActionPerformed
        octalFrame.setVisible(true);
    }//GEN-LAST:event_ToOctalFormActionPerformed

    private void ToHexaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToHexaFormActionPerformed
        hexFrame.setVisible(true);
    }//GEN-LAST:event_ToHexaFormActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ToCreditsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToCreditsFormActionPerformed
        creditsFrame.setVisible(true);
    }//GEN-LAST:event_ToCreditsFormActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel MenuLabel;
    private javax.swing.JButton ToBinaryForm;
    private javax.swing.JButton ToCreditsForm;
    private javax.swing.JButton ToDecimalForm;
    private javax.swing.JButton ToHexaForm;
    private javax.swing.JButton ToOctalForm;
    // End of variables declaration//GEN-END:variables
}