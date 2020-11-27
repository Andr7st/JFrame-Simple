package andr7st;
/**
 * @Pracrica Andrés Segura
 * Ventana Simple
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame();
        ventana.setTitle("Andr7st");
        ventana.setSize(420, 420);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        ventana.setVisible(true);
        // Icono que muestra en la ventana
        ImageIcon icono = new ImageIcon("img/icono.png");
        ventana.setIconImage(icono.getImage());
        // Color 
        //ventana.getContentPane().setBackground(Color.GREEN.darker().darker().darker());
        ventana.getContentPane().setBackground(new Color(75,54,97)); // Color RGB
    }
}