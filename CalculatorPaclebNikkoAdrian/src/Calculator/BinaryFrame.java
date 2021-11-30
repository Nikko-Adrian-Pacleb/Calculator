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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChangeSign = new javax.swing.JButton();
        BackSpace = new javax.swing.JButton();
        ClearEntry = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        Equal = new javax.swing.JButton();
        Period = new javax.swing.JButton();
        Number1 = new javax.swing.JButton();
        Number0 = new javax.swing.JButton();
        DecimalView = new javax.swing.JTextField();
        ViewField = new javax.swing.JTextField();
        DecimalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 550));
        setPreferredSize(new java.awt.Dimension(440, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChangeSign.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ChangeSign.setText("±");
        ChangeSign.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(ChangeSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        BackSpace.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackSpace.setText("←");
        BackSpace.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(BackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        ClearEntry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ClearEntry.setText("CE");
        ClearEntry.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(ClearEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        Clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Clear.setText("C");
        Clear.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        Plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Plus.setText("+");
        Plus.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        Minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Minus.setText("-");
        Minus.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        Multiply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Multiply.setText("*");
        Multiply.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        Divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Divide.setText("/");
        Divide.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        Equal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Equal.setText("=");
        Equal.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        Period.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Period.setText(".");
        Period.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Period, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Number1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number1.setText("1");
        Number1.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        Number0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Number0.setText("0");
        Number0.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(Number0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        DecimalView.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DecimalView.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        DecimalView.setText("18");
        getContentPane().add(DecimalView, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, 58));

        ViewField.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ViewField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ViewField.setText("10010");
        getContentPane().add(ViewField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 58));

        DecimalLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        DecimalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DecimalLabel.setText("Decimal");
        getContentPane().add(DecimalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton ChangeSign;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearEntry;
    private javax.swing.JLabel DecimalLabel;
    private javax.swing.JTextField DecimalView;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Equal;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Number0;
    private javax.swing.JButton Number1;
    private javax.swing.JButton Period;
    private javax.swing.JButton Plus;
    private javax.swing.JTextField ViewField;
    // End of variables declaration//GEN-END:variables
}