/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WordCounterApplication;

/**
 *
 * @author NM Jakaria
 */
public class WordCounterApplication extends javax.swing.JFrame {

    /**
     * Creates new form WordCounterApplication
     */
    public WordCounterApplication() {
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
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jText = new javax.swing.JTextArea();
        jbtnClear = new javax.swing.JButton();
        jbtnCount = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResult = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jbtnClear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Word Counter Application with JAVA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 102, 102));
        panel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        panel1.setForeground(new java.awt.Color(0, 153, 153));
        panel1.setLayout(new java.awt.BorderLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 255, 255));
        label1.setText("Word Count Application");
        panel1.add(label1, java.awt.BorderLayout.CENTER);

        jPanel1.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jText.setColumns(20);
        jText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jText.setRows(5);
        jText.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true), "Write something in this box", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jScrollPane1.setViewportView(jText);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 760, 280));

        jbtnClear.setBackground(new java.awt.Color(255, 0, 102));
        jbtnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnClear.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClear.setText("Clear");
        jbtnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 120, -1));

        jbtnCount.setBackground(new java.awt.Color(0, 153, 51));
        jbtnCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCount.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCount.setText("Count");
        jbtnCount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCountActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 120, -1));

        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jTextResult.setBackground(new java.awt.Color(0, 51, 51));
        jTextResult.setColumns(20);
        jTextResult.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextResult.setRows(5);
        jTextResult.setBorder(null);
        jTextResult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextResult);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 750, 110));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 204, 204));
        label2.setText("Depertment of CSE, BGC Trust University Bangladesh");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 255, 153));
        label3.setText("Desinged by Naimullah Md Jakaria (64) and Mohammad Faisal (100)");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 820, 60));

        jbtnClear1.setBackground(new java.awt.Color(255, 0, 0));
        jbtnClear1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnClear1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnClear1.setText("Exit");
        jbtnClear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCountActionPerformed
        // TODO add your handling code here:
        String str = jText.getText();
        String str1[] = str.split("\\s");
        int l = str.length();
        int len = str1.length;
        jTextResult.setText("Total Words:\t\t"+len+"\n\nTotal Letters:\t\t"+l);
    }//GEN-LAST:event_jbtnCountActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
        // TODO add your handling code here:
        jText.setText("");
        jTextResult.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

    private void jbtnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClear1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbtnClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(WordCounterApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordCounterApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordCounterApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordCounterApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordCounterApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jText;
    private javax.swing.JTextArea jTextResult;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnClear1;
    private javax.swing.JButton jbtnCount;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables

    private void printComponent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
