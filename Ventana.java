import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ventana principal
		JFrame aplicacion = new JFrame();
		aplicacion.setBounds(250, 150, 550, 500);
		aplicacion.setUndecorated(false);
		aplicacion.setVisible(true);
		aplicacion.setTitle("PROS CORP.net");
		//aplicacion.setForeground(Color.decode("#444b54"));
		aplicacion.setLayout(null);		
		
		//color de fondo
		JPanel colorFondo2 = new JPanel();
		colorFondo2.setBounds(0, 0, 550, 500);
		colorFondo2.setBackground(Color.decode("#ee498b"));
		colorFondo2.setLayout(null);
		aplicacion.add(colorFondo2);
		
		//inicio de sesion
		JButton boton1 = new JButton();
		colorFondo2.add(boton1);
		boton1.setBounds(400, 350, 90, 25);
		boton1.setText("Iniciar sesion");		
		boton1.setFont(new Font ("Verdana", 15, 13));
		boton1.setForeground(Color.BLACK);
		boton1.setBorder(new LineBorder (Color.BLACK));
		
		
		//registrarse 
		JButton boton2 = new JButton();
		colorFondo2.add(boton2);
		boton2.setBounds(45, 350, 90, 25);
		boton2.setText("Registrarse");
		boton2.setFont(new Font ("Verdana", 15, 13));
		boton2.setForeground(Color.BLACK);
		boton2.setBorder(new LineBorder(Color.BLACK));
		boton2.setIcon(null);
		
		//fondo del boton de informacion.
		JLabel imagen = new JLabel();
		ImageIcon ima = new ImageIcon("src/imagenes/Capa 1.png");
		imagen.setBounds(165, 100, 200, 200);
		colorFondo2.add(imagen);
		
		Icon imagen1 = new ImageIcon (ima.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_AREA_AVERAGING)); 
		imagen.setIcon(imagen1);
		
		//boton de informacion
		JButton boton3 = new JButton();
		colorFondo2.add(boton3);
		boton3.setBounds(165, 100, 200, 200);
		boton3.setIcon(imagen1);
		

		aplicacion.setVisible(true);
		
		colorFondo2.setVisible(true);		
		
		boton1.addActionListener(new  ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aplicacion.setVisible(false);
				Inicio j = new Inicio();
				
			}
		});
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				aplicacion.setVisible(false);
				V01 L = new V01();
				
				
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
