/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes_Desarrollo;

import javax.swing.JTextField;

/**
 *
 * @author Marcos Altamirano
 */
public class numero extends JTextField
{
    public numero (){
             this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
    }
    
    
    
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        char c;
        c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }

}
    