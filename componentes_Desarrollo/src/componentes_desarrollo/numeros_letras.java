
package componentes_Desarrollo;

/**
 *
 * @author MARCOS
 */import javax.swing.JTextField;

/**
 *
 * @author Marcos Altamirano
 */
public class numeros_letras extends JTextField
{
    public numeros_letras (){
             this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
    }
    
    
    
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        char c;
       
        c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    
    }

}
    