import java.awt.Color;

import javax.swing.*;

public class RegistroF {

	public RegistroF() {
	
		JFrame RegistroFundacion = new JFrame();
		RegistroFundacion.setBounds(200, 100, 1000, 600);
		RegistroFundacion.setLayout(null);
		
		JPanel Fondo = new JPanel();
		Fondo.setBounds(200, 100, 1000, 600);
		RegistroFundacion.add(Fondo);
		Fondo.setBackground(Color.decode("#26c6da"));
		
	}
}
