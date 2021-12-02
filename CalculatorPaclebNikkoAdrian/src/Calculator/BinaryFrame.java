/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author nikko
 */
public class BinaryFrame extends javax.swing.JFrame {

    /**
     * Creates new form BinaryFrame
     */
    public BinaryFrame() {
        initComponents();
    }
    
    final int base = 2;
    CalculatorFunctions cFunction = new CalculatorFunctions();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackSpace = new javax.swing.JButton();
        ClearEntry = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Number1 = new javax.swing.JButton();
        Number0 = new javax.swing.JButton();
        ViewField = new javax.swing.JTextField();
        FNLabel = new javax.swing.JLabel();
        FNB2 = new javax.swing.JLabel();
        SNLabel = new javax.swing.JLabel();
        SNB2 = new javax.swing.JLabel();
        ResultLabel = new javax.swing.JLabel();
        RB2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FNB10 = new javax.swing.JLabel();
        SNB10 = new javax.swing.JLabel();
        RB10 = new javax.swing.JLabel();
        OperationLabel = new javax.swing.JLabel();
        OperationText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Binary");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackSpace.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackSpace.setText("←");
        BackSpace.setPreferredSize(new java.awt.Dimension(70, 70));
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(BackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        ClearEntry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ClearEntry.setText("CE");
        ClearEntry.setPreferredSize(new java.awt.Dimension(70, 70));
        ClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearEntryActionPerformed(evt);
            }
        });
        getContentPane().add(ClearEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        Clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Clear.setText("C");
        Clear.setPreferredSize(new java.awt.Dimension(70, 70));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        Plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Plus.setText("+");
        Plus.setPreferredSize(new java.awt.Dimension(70, 70));
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });
        getContentPane().add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        Minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Minus.setText("-");
        Minus.setPreferredSize(new java.awt.Dimension(70, 70));
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });
        getContentPane().add(Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        Multiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Multiply.setText("*");
        Multiply.setPreferredSize(new java.awt.Dimension(70, 70));
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(Multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        Divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Divide.setText("/");
        Divide.setPreferredSize(new java.awt.Dimension(70, 70));
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });
        getContentPane().add(Divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        Equal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Equal.setText("=");
        Equal.setPreferredSize(new java.awt.Dimension(70, 70));
        Equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualActionPerformed(evt);
            }
        });
        getContentPane().add(Equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 70, -1));

        Number1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number1.setText("1");
        Number1.setPreferredSize(new java.awt.Dimension(70, 70));
        Number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number1ActionPerformed(evt);
            }
        });
        getContentPane().add(Number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 160, -1));

        Number0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number0.setText("0");
        Number0.setPreferredSize(new java.awt.Dimension(70, 70));
        Number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number0ActionPerformed(evt);
            }
        });
        getContentPane().add(Number0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, -1));

        ViewField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ViewField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ViewField.setText("10010");
        ViewField.setFocusable(false);
        getContentPane().add(ViewField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 58));

        FNLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FNLabel.setText("First Number: ");
        getContentPane().add(FNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        FNB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FNB2.setText("None");
        getContentPane().add(FNB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        SNLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SNLabel.setText("Second Number: ");
        getContentPane().add(SNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        SNB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SNB2.setText("None");
        getContentPane().add(SNB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        ResultLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ResultLabel.setText("Result:");
        getContentPane().add(ResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        RB2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB2.setText("None");
        getContentPane().add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Base2:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Base2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Base10:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Base10:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Base2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Base10:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        FNB10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FNB10.setText("None");
        getContentPane().add(FNB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        SNB10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SNB10.setText("None");
        getContentPane().add(SNB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        RB10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RB10.setText("None");
        getContentPane().add(RB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        OperationLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OperationLabel.setText("Operation:");
        getContentPane().add(OperationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        OperationText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OperationText.setText("None");
        getContentPane().add(OperationText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number0ActionPerformed
        if(cFunction.isResultInitiated()){
            return;
        }
        enterNumber("0");
    }//GEN-LAST:event_Number0ActionPerformed

    private void Number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number1ActionPerformed
        if(cFunction.isResultInitiated()){
            return;
        }
        enterNumber("1");
    }//GEN-LAST:event_Number1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ViewField.setText("");
        cFunction.defaultVariables();
        OperationText.setText("None");
        FNB2.setText("None");
        SNB2.setText("None");
        RB2.setText("None");
        FNB10.setText("None");
        SNB10.setText("None");
        RB10.setText("None");
    }//GEN-LAST:event_formWindowActivated

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        cFunction.setOperation('+');
        OperationText.setText("+");
        if(cFunction.artithetic(ViewField.getText(), base)){
            FNB2.setText(ViewField.getText());
            FNB10.setText(String.valueOf(cFunction.getFirstNumber()));
            ViewField.setText("");
        }
    }//GEN-LAST:event_PlusActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        cFunction.setOperation('-');
        OperationText.setText("-");
        if(cFunction.artithetic(ViewField.getText(), base)){
            FNB2.setText(ViewField.getText());
            FNB10.setText(String.valueOf(cFunction.getFirstNumber()));
            ViewField.setText("");
        }
    }//GEN-LAST:event_MinusActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        cFunction.setOperation('*');
        OperationText.setText("*");
        if(cFunction.artithetic(ViewField.getText(), base)){
            FNB2.setText(ViewField.getText());
            FNB10.setText(String.valueOf(cFunction.getFirstNumber()));
            ViewField.setText("");
        }
    }//GEN-LAST:event_MultiplyActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        cFunction.setOperation('/');
        OperationText.setText("/");
        if(cFunction.artithetic(ViewField.getText(), base)){
            FNB2.setText(ViewField.getText());
            FNB10.setText(String.valueOf(cFunction.getFirstNumber()));
            ViewField.setText("");
        }
    }//GEN-LAST:event_DivideActionPerformed

    private void EqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualActionPerformed
        cFunction.computeResult(ViewField.getText(), base);
        ViewField.setText(String.format("%.2f", cFunction.getResult()));
        SNB10.setText(String.valueOf(cFunction.getSecondNumber()));
        RB10.setText(String.format("%.2f", cFunction.getResult()));
        SNB2.setText(Integer.toBinaryString((int)cFunction.getSecondNumber()));
        RB2.setText(Integer.toBinaryString((int)cFunction.getResult()));
    }//GEN-LAST:event_EqualActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ViewField.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void ClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearEntryActionPerformed
        cFunction.defaultVariables();
        ViewField.setText("");
        OperationText.setText("None");
        FNB2.setText("None");
        SNB2.setText("None");
        RB2.setText("None");
        FNB10.setText("None");
        SNB10.setText("None");
        RB10.setText("None");
    }//GEN-LAST:event_ClearEntryActionPerformed

    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSpaceActionPerformed
        String index = null;
        if(ViewField.getText().length() > 0){
            StringBuilder sb = new StringBuilder(ViewField.getText());
            sb.deleteCharAt(ViewField.getText().length() - 1);
            index = sb.toString();
            ViewField.setText(index);
        }
    }//GEN-LAST:event_BackSpaceActionPerformed

    private void enterNumber(String input){
        ViewField.setText(ViewField.getText() + input);
    }
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
            java.util.logging.Logger.getLogger(BinaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSpace;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearEntry;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Equal;
    private javax.swing.JLabel FNB10;
    private javax.swing.JLabel FNB2;
    private javax.swing.JLabel FNLabel;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Number0;
    private javax.swing.JButton Number1;
    private javax.swing.JLabel OperationLabel;
    private javax.swing.JLabel OperationText;
    private javax.swing.JButton Plus;
    private javax.swing.JLabel RB10;
    private javax.swing.JLabel RB2;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel SNB10;
    private javax.swing.JLabel SNB2;
    private javax.swing.JLabel SNLabel;
    private javax.swing.JTextField ViewField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
