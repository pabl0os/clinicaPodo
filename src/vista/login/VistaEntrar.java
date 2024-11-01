package vista.login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.WindowMain;

public class VistaEntrar {

  JLabel jl_titulo = new JLabel("Clinica Podologica Zane");
  JLabel jl_correo = new JLabel("Correo");
  JLabel jl_pass = new JLabel("Contraseña");
  JTextField jtf_correo = new JTextField(15);
  JPasswordField jpf_pass = new JPasswordField(15);
  ImageIcon logo = new ImageIcon("src/image/Sin título.png");
  JLabel jl_imagen = new JLabel(logo);
  JButton jb_entrar = new JButton("Entrar");

  JPanel jp_login;

  JPanel jp_panelprincipal = new JPanel();

  public JPanel getJp_login() {
    if (jp_login == null) {
      jp_login = new JPanel();

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

      jp_login.add(jtf_correo);
      jp_login.add(jl_correo);
      jp_login.add(jpf_pass);
      jp_login.add(jl_pass);
      jp_login.add(jl_titulo);
      jp_login.add(jl_imagen);
      jp_login.add(jb_entrar);

      JMenu menuPacientes = new JMenu("Gestionar Pacientes");
      JMenu menuUsuarios = new JMenu("Gestionar Usuarios");
      JMenu menuCitas = new JMenu("Gestionar Citas");
      JMenu menuOtros = new JMenu("Gestionar otros");

      JMenuItem itemConsultar = WindowMain.itemConsultar;
      JMenuItem itemEliminar = WindowMain.itemEliminar;
      JMenuItem itemModificar = WindowMain.itemModificar;
      JMenuItem itemAgregar = WindowMain.itemAgregar;

      JMenuItem itemEliminar2 = WindowMain.itemEliminar2;
      JMenuItem itemConsultar2 = WindowMain.itemConsultar2;
      JMenuItem itemModificar2 = WindowMain.itemModificar2;
      JMenuItem itemAgregar2 = WindowMain.itemAgregar2;

      JMenuItem itemAgendar3 = WindowMain.itemAgendar3;
      JMenuItem itemCancelar3 = WindowMain.itemCancelar3;
      JMenuItem itemModificar3 = WindowMain.itemModificar3;
      JMenuItem itemConsultar3 = WindowMain.itemConsultar3;
      JMenuItem itemRecordatorios3 = WindowMain.itemRecordatorios3;

      JMenuItem impresiones = WindowMain.impresiones;
      JMenuItem Salir = WindowMain.Salir;

      JMenuBar menuBar = WindowMain.menuBar;
      JFrame jf_ventanaPrincipal = WindowMain.jf_ventanaPrincipal;

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
    return jp_login;
  }

}
