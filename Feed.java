import java.awt.Color;
import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Feed {
	
	public Feed() {
		
		
		JFrame ventana = new JFrame();
		ventana.setBounds(200, 100, 1000, 600);
		//ventana.setUndecorated(true);
		ventana.setVisible(true);
		ventana.setLayout(null);
		
		JPanel fondo = new JPanel();
		fondo.setBounds(0, 0, 1000, 600);
		ventana.add(fondo);
		fondo.setBackground(Color.CYAN);
		fondo.setLayout(null);
		
		
		JPanel barra = new JPanel();
		barra.setBounds(45, 0, 897, 45);
		barra.setBorder(new LineBorder (Color.BLUE));
		barra.setBackground(Color.PINK);
		fondo.add(barra);
		
		JLabel inicio = new JLabel();
		
		String i = "Inicio";
		inicio.setBounds(225, 0, 10, 15);
		barra.add(inicio);
		inicio.setText(i);
		inicio.setFont(new Font ("Verdana", 10, 15));
		inicio.setForeground(Color.BLACK);
		
		JLabel menu = new JLabel();
		ImageIcon menu2 = new ImageIcon("src/imagenes/menu (2).png");
		ventana.add(menu);
		
				
		JButton extras = new JButton();
		extras.setBounds(0, 0, 45, 45);
		fondo.add(extras);
		extras.setBorder(new LineBorder ( Color.BLACK));
		extras.setIcon(menu2);
		
		JLabel preguntas = new JLabel();
		ImageIcon preguntas2 = new ImageIcon("src/imagenes/charlar (1).png");
		ventana.add(preguntas);
		
		JButton preguntas3 = new JButton();
		preguntas3.setBounds(939, 0, 45, 45);
		fondo.add(preguntas3);
		preguntas3.setBorder(new LineBorder (Color.BLACK));
		preguntas3.setIcon(preguntas2);	
		
		
		
	}

	

}
