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
        outerBox.setVisible(true);
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
      
      frame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
       outerBox = new javax.swing.JPanel();
        Option2 = new javax.swing.JButton();
        Option1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
       

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

      
      
        Option2.setText("Option 2");
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });

        Option1.setText("Option 2");
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               // jTextField1ActionPerformed(evt);
            }
        });

        BackButton.setText("Back");

       
        javax.swing.GroupLayout outerBoxLayout = new javax.swing.GroupLayout(outerBox);
        outerBox.setLayout(outerBoxLayout);
        outerBoxLayout.setHorizontalGroup(
            outerBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerBoxLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Option1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Option2)
                .addGap(28, 28, 28))
            .addGroup(outerBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addContainerGap())
        );
        outerBoxLayout.setVerticalGroup(
            outerBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outerBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextArea1)
                .addGap(18, 18, 18)
                .addGroup(outerBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option2)
                    .addComponent(Option1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(outerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frame.add(outerBox);
        frame.setVisible(true);
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
    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        // TODO add your handling code here:
        D.nextPage(1);
    }//GEN-LAST:event_Option1ActionPerformed

    /**
     * Turns the next page once user has made decision. 
     * Passes decision to page turning choosing method.
     * @param evt 
     * @return void
     */
    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
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
    private javax.swing.JFrame frame;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Option1;
    private javax.swing.JButton Option2;
    private javax.swing.JPanel outerBox;
    private javax.swing.JScrollPane jScrollPane1;
    private  static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
