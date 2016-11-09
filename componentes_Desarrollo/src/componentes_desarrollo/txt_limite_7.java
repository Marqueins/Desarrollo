/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_Desarrollo;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 *  
 * @author MARCOS
 */
public class txt_limite_7 extends JTextField {

    public txt_limite_7() {
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
        int maxCaracteres=7;
        if(this.getText().length()>maxCaracteres){
            evt.consume();
            JOptionPane.showMessageDialog(this, " INGRESO INCORRECTO DE LA PLACA ");
        }
       
    } 
}
