package componentes_Desarrollo;


import javax.swing.JTextField;

public class mayusculas extends JTextField {

    public mayusculas() {
        this.addKeyListener(new java.awt.event.KeyAdapter() {
            
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

    }

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {
        char c;
        c = evt.getKeyChar();
        if (c < 'A' || c > 'Z') {
            evt.consume();
        }
    }
}
