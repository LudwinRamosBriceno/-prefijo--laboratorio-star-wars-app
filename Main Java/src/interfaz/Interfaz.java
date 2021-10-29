package interfaz;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    private JButton btnLeer;
    private JPanel panel;
    private JTable tabla;
    private JLabel title;

    public Interfaz() throws HeadlessException {
        setTitle("Tabla");
        setResizable(false);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //components
        title = new JLabel("Registro");
        add(title);
        tabla = new JTable();
        btnLeer = new JButton("Mostrar");
        add(btnLeer);
        add(tabla);
        btnLeer.reshape(170,300,100,40);
    }
}
