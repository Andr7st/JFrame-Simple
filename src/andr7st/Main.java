package andr7st;
/**
 * @Pracrica Andrés Segura
 * Ventana Simple
 */
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        SeleccionarVentana VentanaSeleccionada = new SeleccionarVentana();

        // Ontendrá el numero de la ventana con un OptionPane.
        int numVentana = VentanaSeleccionada.ObtenerVentana();

        if (numVentana == 0){

            JFrame ventana = new JFrame();
            ventana.setTitle("Andr7st - Ventana 0");
            ventana.setSize(420, 420);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
            ventana.setVisible(true);
            // Icono que muestra en la ventana
            ImageIcon icono = new ImageIcon("img/icono.png");
            ventana.setIconImage(icono.getImage());
            // Color 
            ventana.getContentPane().setBackground(Color.GREEN.darker().darker().darker());
        }
        if (numVentana == 1){
            // Ventana 1
            new Frame1();
        }

    }
}

class SeleccionarVentana {

    SeleccionarVentana(){
        
        int ventanaSeleccionada = -1;
        boolean correcto = false;
        int intentos = 0;
        do{

        String ingreso = JOptionPane.showInputDialog("Seleccionar numero ventana\nAcepta numeros de 0 a 1", "1");

            System.out.println("Falso");
            try {
                ventanaSeleccionada = Integer.parseInt(ingreso);
            } catch (Exception e) {}
    
            if(ventanaSeleccionada < 2){
                correcto = true;
            }
            intentos++;

            /// Después de 5 intentos cerrar: corrección al ciclo infinito.
            if (intentos == 5){ break; }

        } while (!correcto);

        this.numVentana = ventanaSeleccionada;
    }

    private int numVentana = 0;

    public int ObtenerVentana(){
        return numVentana;
    }
}