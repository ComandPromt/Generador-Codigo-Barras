package principal;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojeru San
 */
public class RSButtom extends JButton implements MouseListener{

    private Color button_pressed = new Color(0,0,0);
    private Color button_released = new Color(227, 162, 26);
    /** Color para el texto */
    private Color texto_released = new Color(0,0,0);
    private Color texto_pressed = new Color(255,255,255);

    /**
     * Constructor de clase
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public RSButtom()
    {
        this.setText("RSButtom");
        this.setPreferredSize( new Dimension(140,32));
        this.setSize( new Dimension(140,32 ) );
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor( Cursor.HAND_CURSOR ));
        this.setBackground( this.button_released );
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
    }

     public void mouseClicked(MouseEvent e) {}

    /** Cuando se presiona el boton se cambian los colores de fondo y de texto */
    public void mousePressed(MouseEvent e) {
        //capturamos valores iniciales
        this.button_released = this.getBackground();
        this.texto_released = this.getForeground();
        //se colocan los nuevos colores
        this.setForeground( this.texto_pressed );
        this.setBackground( this.button_pressed );
    }

    /** Cuando se leventa el mouse del jbutton se retoman los colores originales */
    public void mouseReleased(MouseEvent e) {
        this.setBackground( this.button_released);
        this.setForeground( this.texto_released );
    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    

}
