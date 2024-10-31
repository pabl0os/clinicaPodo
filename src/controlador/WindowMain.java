package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowMain {
  JFrame jf_ventanaPrincipal = new JFrame();
  JLabel jl_titulo = new JLabel("Clinica Podologica Zane");
  JLabel jl_correo = new JLabel("Correo");
  JLabel jl_pass = new JLabel("Contraseña");
  JTextField jtf_correo = new JTextField(15);
  JPasswordField jpf_pass = new JPasswordField(15);
  ImageIcon logo = new ImageIcon("src/image/Sin título.png");
  JLabel jl_imagen = new JLabel(logo);
  JButton jb_entrar = new JButton("Entrar");

  JPanel jp_login = new JPanel();

  JMenuBar menuBar = new JMenuBar();

  JMenu menuPacientes = new JMenu("Gestionar Pacientes");
  JMenu menuUsuarios = new JMenu("Gestionar Usuarios");
  JMenu menuCitas = new JMenu("Gestionar Citas");
  JMenu menuOtros = new JMenu("Gestionar otros");

  JMenuItem itemEliminar = new JMenuItem("Eliminar");
  JMenuItem itemConsultar = new JMenuItem("Consultar");
  JMenuItem itemModificar = new JMenuItem("Modificar");
  JMenuItem itemAgregar = new JMenuItem("Agregar");

  JMenuItem itemEliminar2 = new JMenuItem("Eliminar");
  JMenuItem itemConsultar2 = new JMenuItem("Consultar");
  JMenuItem itemModificar2 = new JMenuItem("Modificar");
  JMenuItem itemAgregar2 = new JMenuItem("Agregar");

  JMenuItem itemAgendar3 = new JMenuItem("Agendar");
  JMenuItem itemCancelar3 = new JMenuItem("Cancelar");
  JMenuItem itemModificar3 = new JMenuItem("Modificar");
  JMenuItem itemConsultar3 = new JMenuItem("Consultar");
  JMenuItem itemRecordatorios3 = new JMenuItem("Recordatorios");
  
  JMenuItem impresiones = new JMenuItem("Impresiones");
  JMenuItem Salir = new JMenuItem("Salir");


  JPanel jp_panelprincipal = new JPanel();

  public WindowMain() {

    atributos();
    armado();
    escuchas();
    mostrar();

  }

  private void atributos() {
    jf_ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf_ventanaPrincipal.setSize(800, 600);
    jf_ventanaPrincipal.setLocationRelativeTo(null);

    jl_titulo.setFont(new Font("Arial", Font.BOLD, 24));

    jp_login.setBackground(new Color(173, 232, 244));
    jp_panelprincipal.setBackground(new Color(173, 232, 244));

    jtf_correo.setBounds(300, 150, 140, 20);
    jp_login.setLayout(null);

    jl_correo.setBounds(250, 150, 50, 20);
    jpf_pass.setBounds(300, 200, 140, 20);

    jl_pass.setBounds(230, 200, 70, 20);

    jl_titulo.setBounds(250, 50, 400, 40);

    jl_imagen.setBounds(500, -150, 400, 400);

    jb_entrar.setBounds(350, 300, 70, 30);

    menuBar.setBackground(new Color(0, 150, 199));
    menuCitas.setForeground(Color.white);
    menuOtros.setForeground(Color.white);
    menuPacientes.setForeground(Color.white);
    menuUsuarios.setForeground(Color.white);

    itemEliminar.setForeground(Color.WHITE);
    itemEliminar.setBackground(new Color(0, 150, 199));
    itemConsultar.setBackground(new Color(0, 150, 199));
    itemModificar.setBackground(new Color(0, 150, 199));
    itemAgregar.setBackground(new Color(0, 150, 199));
  }

  private void armado() {
    jf_ventanaPrincipal.add(jp_login);
    jp_login.add(jtf_correo);
    jp_login.add(jl_correo);
    jp_login.add(jpf_pass);
    jp_login.add(jl_pass);
    jp_login.add(jl_titulo);
    jp_login.add(jl_imagen);
    jp_login.add(jb_entrar);

  }

  private void escuchas() {
    jb_entrar.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        menuPacientes.add(itemEliminar);
        menuPacientes.add(itemConsultar);
        menuPacientes.add(itemModificar);
        menuPacientes.add(itemAgregar);

        menuUsuarios.add(itemAgregar2);
        menuUsuarios.add(itemEliminar2);
        menuUsuarios.add(itemModificar2);
        menuUsuarios.add(itemConsultar2);
        
        menuCitas.add(itemAgendar3);
        menuCitas.add(itemCancelar3);
        menuCitas.add(itemModificar3);
        menuCitas.add(itemConsultar3);
        menuCitas.add(itemRecordatorios3);

        menuOtros.add(impresiones);
        menuOtros.add(Salir);

        menuBar.add(menuPacientes);
        menuBar.add(menuUsuarios);
        menuBar.add(menuCitas);
        menuBar.add(menuOtros);

        jf_ventanaPrincipal.setJMenuBar(menuBar);
        jf_ventanaPrincipal.add(jp_panelprincipal);
        jf_ventanaPrincipal.remove(jp_login);
        jf_ventanaPrincipal.repaint();
        jf_ventanaPrincipal.revalidate();
      }

    });
  }

  private void mostrar() {
    jf_ventanaPrincipal.setVisible(true);
  }

}
