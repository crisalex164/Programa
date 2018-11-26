import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Inicio {
	
	public Inicio(){
		
		Conexion1 conexionBD = new Conexion1();
		conexionBD.conectar();

		// VENTANA
		JFrame inicioSesion = new JFrame();
		inicioSesion.setBounds(200, 100, 1000, 600);
		// inicioSesion.setUndecorated(false);
		inicioSesion.setLayout(null);

		// PANEL1
		JPanel colorFondo = new JPanel();
		colorFondo.setBounds(0, 0, 1000, 600);
		colorFondo.setBackground(Color.decode("#5E35B1"));
		colorFondo.setLayout(null);

		// LOGO
		JLabel logo = new JLabel();
		ImageIcon log = new ImageIcon("src/sol.png");
		logo.setBounds(450, 20, 100, 100);

		Icon imagen2;
		imagen2 = new ImageIcon(
				log.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_AREA_AVERAGING));
		logo.setIcon(imagen2);

		// TEXTO BIENVENIDA
		JLabel Bienvenida = new JLabel();
		String B = "Bienvenido de nuevo a HIGHLANDS ";
		Bienvenida.setBounds(200, 80, 650, 140);
		Bienvenida.setText(B);
		Bienvenida.setFont(new Font("Comic Sans MS", 30, 35));

		JLabel mensaje = new JLabel();
		String m = "¿Nuevo en HIGHLANDS? Registrate ahora";
		mensaje.setBounds(300, 120, 650, 140);
		mensaje.setText(m);
		mensaje.setFont(new Font("Comic Sans MS", 15, 20));
		// IMAGEN
		/*
		 * JLabel imagen ; ImageIcon ima; ima = new ImageIcon("src/usuario.png"); imagen
		 * = new JLabel(); imagen.setBounds(400, , 140, 120); Icon imagen1; imagen1 =
		 * new ImageIcon(ima.getImage().getScaledInstance(imagen.getWidth(),
		 * imagen.getHeight(), Image.SCALE_AREA_AVERAGING)); imagen.setIcon(imagen1);
		 */

		// USUARIO
		JLabel usuario = new JLabel();
		String t = "Usuario:";
		usuario.setBounds(500, 225, 65, 70);
		usuario.setText(t);
		usuario.setFont(new Font("Verdana", 10, 15));

		JTextField cajaUsuario = new JTextField();
		cajaUsuario.setBounds(500, 275, 300, 30);
		cajaUsuario.setBorder(new LineBorder(Color.BLACK));

		// CONTRASEÑA
		JLabel contraseña = new JLabel();
		String c = "Contraseña:";
		contraseña.setBounds(500, 325, 95, 70);
		contraseña.setText(c);
		contraseña.setFont(new Font("verdana", 10, 15));

		JTextField contra = new JTextField(); // aqui igual? SI, CREA UN NUEVO REGISTR
		contra.setBounds(500, 375, 300, 30);
		contra.setBackground(Color.WHITE);
		colorFondo.add(contra);
		contra.setBorder(new LineBorder(Color.BLACK));

		// BOTON
		JButton btnIniciarSesion = new JButton();
		btnIniciarSesion.setBounds(600, 430, 150, 40);
		btnIniciarSesion.setFont(new Font("Verdana", 10, 15));
		btnIniciarSesion.setText("Iniciar sesión>");
		btnIniciarSesion.setBackground(Color.pink);
		btnIniciarSesion.setIcon(null);
		
		 

		// AGREGADOS AL PANEL
		inicioSesion.add(colorFondo);
		// colorFondo.add(imagen);
		colorFondo.add(usuario);
		colorFondo.add(btnIniciarSesion);
		colorFondo.add(contraseña);
		colorFondo.add(cajaUsuario);
		colorFondo.add(logo);
		colorFondo.add(Bienvenida);
		colorFondo.add(mensaje);
		colorFondo.setVisible(true);
		inicioSesion.setVisible(true);

		// vamos a traer sólo el nombre

		btnIniciarSesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String queryBuscarUsuario = "SELECT Usuario FROM cuentas where Usuario='"
						+ cajaUsuario.getText().toString() + "';"; // puede que algo esté mal aquí

				//String queryBuscarPass = "SELECT Contraseña FROM Caridad1 Where Contraseña = '"
					//	+ contra.getText().toString() + "'; ";

				if (cajaUsuario.getText().toString().equals(conexionBD.buscarUsuario(queryBuscarUsuario))
						&& contra.getText().toString().equals(conexionBD.buscarContraseña(cajaUsuario.getText().toString()))) {
					JOptionPane.showMessageDialog(null, "USUARIO CORRECTO");
					inicioSesion.setVisible(false);
					Feed d = new Feed();
				} else {
					JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTOS");
				}

			}
		});


	
		
		/*
		 * 
		 * 
		 * String query =
		 * "SELECT Nombre, Apellido,Edad, Estado, Municipio, Cp, Correo, Contraseña, Celular FROM Caridad1;"
		 * ;
		 * 
		 * ArrayList<Usuario> listaUsuarios = new ArrayList<>();
		 * conexionBD.buscar(query, listaUsuarios);
		 * 
		 * for (int i = 0; i < listaUsuarios.size(); i++) {
		 * 
		 * 
		 * System.out.println(listaUsuarios.get(i).getNombre());
		 * 
		 * }
		 * 
		 * 
		 */

		// ES IMPORTANTE TENER UN TABLA CON EL NOMBRE DE USUARIOS, CARIDAD SE LLAMA TU
		// BASE DEDATOS, DENTRO DE ELLA IRÍAN LAS TABLAS, EN ESTE CASO
		// LOS USUARIOS, VENTAS O LO QUE SEA, AHOROTA SEGUIREMOS ASÍ COMO ESTÁ, PERO
		// LUEGO HAY QUE CORREGIR LOS NOMBRES AL IGUAL CON LAS VARIABLES =D
	}

}
