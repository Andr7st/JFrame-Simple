package andr7st;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame1 extends JFrame{

    Frame1(){
        //  JFrame ventana = new JFrame();
        this.setTitle("Andr7st - Ventana 1");
        this.setSize(420, 360);
        this.setLocationRelativeTo(null); // Poner la ventana en el centro del monitor.
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        this.setVisible(true);
        // Icono que muestra en la ventana
        ImageIcon icono = new ImageIcon("img/icono.png");
        this.setIconImage(icono.getImage());
        // Color 
        this.getContentPane().setBackground(new Color(86,81,95)); // Color RGB
    }
    
}
