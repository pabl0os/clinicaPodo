package controlador;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class chatgpt {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Mi Primera Ventana");

        // Configurar la operación de cierre y tamaño
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLocationRelativeTo(null); // Centrar la ventana

        // Crear un panel y configurar su diseño
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear etiqueta y campo de texto
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField campoTexto = new JTextField(20);

        // Agregar la etiqueta y el campo de texto al panel
        panel.add(etiqueta);
        panel.add(campoTexto);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Hacer la ventana visible
        ventana.setVisible(true);
    }
}

