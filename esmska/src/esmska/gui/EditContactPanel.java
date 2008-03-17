/*
 * EditContactPanel.java
 *
 * Created on 26. červenec 2007, 11:50
 */

package esmska.gui;

import esmska.data.FormChecker;
import esmska.operators.Operator;
import esmska.data.Contact;
import esmska.operators.OperatorUtil;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.border.Border;

/** Add new or edit current contact
 *
 * @author  ripper
 */
public class EditContactPanel extends javax.swing.JPanel {
    private static final Border fieldBorder = new JTextField().getBorder();
    private static final Border fieldRedBorder = BorderFactory.createLineBorder(Color.RED);
    
    /**
     * Creates new form EditContactPanel
     */
    public EditContactPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameTextField.requestFocusInWindow();
        numberTextField = new javax.swing.JTextField();
        operatorComboBox = new esmska.gui.OperatorComboBox();

        jLabel1.setText("Jméno");

        jLabel2.setText("Číslo");

        jLabel3.setText("Operátor");

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        numberTextField.setColumns(12);
        numberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusLost(evt);
            }
        });
        numberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(operatorComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(numberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(operatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /** Check if the form is valid */
    public boolean validateForm() {
        boolean valid = true;
        boolean focusTransfered = false;
        JComponent[] comps = new JComponent[] {nameTextField, numberTextField};
        for (JComponent c : comps) {
            valid = checkValid(c) && valid;
            if (!valid && !focusTransfered) {
                c.requestFocusInWindow();
                focusTransfered = true;
            }
        }
        return valid;
    }
    
    /** checks if component's content is valid */
    private boolean checkValid(JComponent c) {
        boolean valid = true;
        if (c == nameTextField) {
            valid = FormChecker.checkContactName(nameTextField.getText());
            updateBorder(c, valid);
        } else if (c == numberTextField) {
            valid = FormChecker.checkSMSNumber(numberTextField.getText());
            updateBorder(c, valid);
        }
        return valid;
    }
    
    /** sets highlighted border on non-valid components and regular border on valid ones */
    private void updateBorder(JComponent c, boolean valid) {
        if (valid)
            c.setBorder(fieldBorder);
        else
            c.setBorder(fieldRedBorder);
    }
    
    private void numberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberTextFieldKeyReleased
        //guess operator
//        Operator op = OperatorEnum.getOperator(numberTextField.getText());
//        if (op != null) {
//            for (int i=0; i<operatorComboBox.getItemCount(); i++) {
//                if (operatorComboBox.getItemAt(i).getClass().equals(op.getClass())) {
//                    operatorComboBox.setSelectedIndex(i);
//                    break;
//                }
//            }
//        }
    }//GEN-LAST:event_numberTextFieldKeyReleased

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        checkValid(nameTextField);
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void numberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusLost
        checkValid(numberTextField);
    }//GEN-LAST:event_numberTextFieldFocusLost
    
    /** Set contact to be edited or use null for new one */
    public void setContact(Contact contact) {
        if (contact == null) {
            nameTextField.setText(null);
            numberTextField.setText(null);
            if (operatorComboBox.getModel().getSize() > 0)
                operatorComboBox.setSelectedIndex(0);
            else
                operatorComboBox.setSelectedItem(null);
        } else {
            nameTextField.setText(contact.getName());
            numberTextField.setText(contact.getNumber());
            operatorComboBox.setSelectedOperator(OperatorUtil.getOperator(contact.getOperator()));
        }
    }
    
    /** Get currently edited contact */
    public Contact getContact() {
        Contact c = new Contact();
        c.setName(nameTextField.getText());
        c.setNumber(numberTextField.getText());
        Operator operator = operatorComboBox.getSelectedOperator();
        c.setOperator(operator != null ? operator.getName() : null);
        return c;
    }
    
    /** Improve focus etc. before displaying panel */
    public void prepareForShow() {
        nameTextField.requestFocusInWindow();
        nameTextField.selectAll();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    private esmska.gui.OperatorComboBox operatorComboBox;
    // End of variables declaration//GEN-END:variables
    
}
