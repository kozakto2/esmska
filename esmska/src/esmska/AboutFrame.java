/*
 * AboutFrame.java
 *
 * Created on 8. červenec 2007, 13:18
 */

package esmska;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/** About form
 *
 * @author  ripper
 */
public class AboutFrame extends javax.swing.JFrame {
    
    /** Creates new form AboutFrame */
    public AboutFrame() {
        initComponents();
        closeButton.requestFocusInWindow();
        linkButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        creditsButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        licenseButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        linkButton = new javax.swing.JButton();

        setTitle("O Esmska");
        setIconImage(new ImageIcon(getClass().getResource("resources/esmska.png")).getImage());
        setLocationByPlatform(true);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/esmska/resources/esmska.png")));
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Esmska 0.3.0");
        jLabel2.setFocusable(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pos\u00edl\u00e1n\u00ed SMS p\u0159es Internet.");
        jLabel3.setFocusable(false);

        creditsButton.setMnemonic('p');
        creditsButton.setText("Pod\u011bkov\u00e1n\u00ed");
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        closeButton.setMnemonic('z');
        closeButton.setText("Zav\u0159\u00edt");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        licenseButton.setMnemonic('l');
        licenseButton.setText("Licence");
        licenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseButtonActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("\u00a9 2007 Kamil P\u00e1ral");
        jLabel5.setFocusable(false);

        linkButton.setText("<html><a href=\"http://esmska.googlecode.com/\">http://esmska.googlecode.com/</a></html>");
        linkButton.setBorderPainted(false);
        linkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creditsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(licenseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(linkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(linkButton)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditsButton)
                    .addComponent(closeButton)
                    .addComponent(licenseButton))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void linkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkButtonActionPerformed
        if (!Desktop.isDesktopSupported())
            return;
        //start browser
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URL("http://esmska.googlecode.com/").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_linkButtonActionPerformed
        
    private void licenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseButtonActionPerformed
        //show licence
        try {
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            URL url = getClass().getResource("resources/license.txt");
            JTextPane tp = new JTextPane();
            tp.setPage(url);
            tp.setEditable(false);
            tp.setPreferredSize(new Dimension((int)d.getWidth()/2,(int)d.getHeight()/2)); //reasonable size
            JOptionPane op = new JOptionPane(new JScrollPane(tp),JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.DEFAULT_OPTION);
            JDialog dialog = op.createDialog(this,"Licence");
            dialog.setResizable(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_licenseButtonActionPerformed
    
    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        //show credits
        try {
            URL url = getClass().getResource("resources/credits.txt");
            JTextPane tp = new JTextPane();
            tp.setContentType("text/plain; charset=utf-8");
            tp.setPage(url);
            tp.setEditable(false);
            JOptionPane op = new JOptionPane(new JScrollPane(tp),JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.DEFAULT_OPTION);
            JDialog dialog = op.createDialog(this,"Poděkování");
            dialog.setResizable(true);
            dialog.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_creditsButtonActionPerformed
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        //close form
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton creditsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton licenseButton;
    private javax.swing.JButton linkButton;
    // End of variables declaration//GEN-END:variables
    
}
