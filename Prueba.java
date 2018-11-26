import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame();
		ventana.setBounds(500, 300, 500, 400);
		ventana.setLayout(null);
		ventana.setVisible(true);

		JPanel panelUno = new JPanel();

		panelUno.setBounds(0, 0, 2000, 1000);
		panelUno.setLayout(null);
		panelUno.setForeground(Color.PINK);
		panelUno.setBackground(Color.GREEN);

		ventana.add(panelUno);
		ventana.setTitle("Highlands");

		JLabel textoOpcionesdelusuario = new JLabel();
		String tO = "Opciones del Usuario:";
		textoOpcionesdelusuario.setText(tO);
		textoOpcionesdelusuario.setBackground(Color.PINK);
		textoOpcionesdelusuario.setFont(new Font("Decker", 2, 20));

		textoOpcionesdelusuario.setBounds(600, 0, 200, 200);
		textoOpcionesdelusuario.setLayout(null);
		panelUno.add(textoOpcionesdelusuario);

		JLabel textoFormasdeayudar = new JLabel();
		String tF = "Formas de Ayudar:";
		textoFormasdeayudar.setText(tF);
		textoFormasdeayudar.setBackground(Color.PINK);
		textoFormasdeayudar.setFont(new Font("Decker", 2, 20));

		textoFormasdeayudar.setBounds(150, 0, 200, 100);
		textoFormasdeayudar.setLayout(null);
		panelUno.add(textoFormasdeayudar);

		JButton btnExit = new JButton();
		panelUno.add(btnExit);
		btnExit.setText("Salir");
		btnExit.setBorder(new LineBorder(Color.blue));
		btnExit.setBounds(1200, 600, 90, 30);
		btnExit.setFont(new Font("Decker", 1, 10));
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Exit");

			}
		});

		/*JButton btnCompartir = new JButton();
		panelUno.add(btnCompartir);
		btnCompartir.setBounds(200, 200, 100, 500);
		btnCompartir.setBorder(null);
		btnCompartir.setBorderPainted(false);
		btnCompartir.setContentAreaFilled(false);
		btnCompartir.setIcon(new ImageIcon("src/Imagenes/dedito.png"));
		btnCompartir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Compartir en redes sociales");

			}
		});
*/
		JButton btnDonativo = new JButton();
		panelUno.add(btnDonativo);
		btnDonativo.setBounds(600, 100, 100, 500);
		btnDonativo.setBorder(null);
		btnDonativo.setBorderPainted(false);
		btnDonativo.setContentAreaFilled(false);
		btnDonativo.setIcon(new ImageIcon("src/Imagenes/regalito.png"));
		btnDonativo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Donar");

			}
		});

		JButton btnAyudafisica = new JButton();
		panelUno.add(btnAyudafisica);
		btnAyudafisica.setBounds(1000, 200, 300, 500);
		btnAyudafisica.setBorder(null);
		btnAyudafisica.setBorderPainted(false);
		btnAyudafisica.setContentAreaFilled(false);
		btnAyudafisica.setIcon(new ImageIcon("src/Imagenes/easyto.png"));
		btnAyudafisica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Agendar Cita");

			}
		});

		/*JLabel textoCompartir = new JLabel();
		String tC = "Compartir en Redes Sociales:";
		textoCompartir.setText(tC);
		textoCompartir.setBackground(Color.PINK);
		textoCompartir.setFont(new Font("Decker", 2, 20));

		textoCompartir.setBounds(150, 150, 300, 400);
		textoCompartir.setLayout(null);
		panelUno.add(textoCompartir);

        */
		JLabel textoDonativo = new JLabel();
		String tD = "¿Quieres donar?";
		textoDonativo.setText(tD);
		textoDonativo.setBackground(Color.PINK);
		textoDonativo.setFont(new Font("Decker", 2, 20));

		textoDonativo.setBounds(580, 80, 300, 400);
		textoDonativo.setLayout(null);
		panelUno.add(textoDonativo);

		JLabel textoAyudafisica = new JLabel();
		String tA = "¿Quieres Agendar una cita para contribuir con ayuda física?";
		textoAyudafisica.setText(tA);
		textoAyudafisica.setBackground(Color.PINK);
		textoAyudafisica.setFont(new Font("Decker", 2, 20));

		textoAyudafisica.setBounds(800, 195, 600, 300);
		textoAyudafisica.setLayout(null);
		panelUno.add(textoAyudafisica);

	}

}
