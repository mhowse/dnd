/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/**
 *
 * @author cleddyf
 */
public class gui extends javax.swing.JPanel {
    private JTextField pageNumber;

    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
    }
    
    public static void main (String [] args){
       gui g = new gui();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        option1 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        pageNumber = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        option1.setText("Option One.");
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });

        option2.setText("Option 2");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

       pageNumber.setText("Current Page");
        pageNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(pageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(option1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(option2)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(option1)
                    .addComponent(option2)
                    .addComponent(pageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pageNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    
    
     /**
     * Turns back pages once user has made decision. 
     * Passes decision to back page turning method.
     * i.e. if a book, then flips pages in opposite direction. 
     * @param evt 
     * @return void
     */
     private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {   
         D.backPage();
        // TODO add your handling code here:
    }                                       

 /**
     * Turns the next page once user has made decision. 
     * Passes decision to page turning choosing method.
     * @param evt 
     * @return void
     */
    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
        D.nextPage(1);
    }//GEN-LAST:event_Option1ActionPerformed

    /**
     * Turns the next page once user has made decision. 
     * Passes decision to page turning choosing method.
     * @param evt 
     * @return void
     */
    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        D.nextPage(2); // TODO add your handling code here:
    }//GEN-LAST:event_Option2ActionPerformed

    protected static void displayString(String s ){
        String b, c;
        System.out.println("test");
        jTextArea1.getAccessibleContext();
        c=  String.valueOf( jTextArea1.getRows());
        b= String.valueOf(jTextArea1.getColumns());
        System.out.println(c +b );
        jTextArea1.insert(s, 1);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton option1;
    private javax.swing.JButton option2;
    private javax.swing.JScrollPane jScrollPane1;
    private  static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField buttonNumber;
    // End of variables declaration//GEN-END:variables
}
