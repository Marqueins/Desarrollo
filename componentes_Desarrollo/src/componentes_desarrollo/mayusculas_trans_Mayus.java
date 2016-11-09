/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_Desarrollo;

import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MARCOS
 */
public class mayusculas_trans_Mayus extends JTextField {

    public mayusculas_trans_Mayus() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        
        char c;
        c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad= (""+c).toUpperCase();
            c=cad.charAt(0);
            evt.setKeyChar(c);
        }
       
    } 
}
