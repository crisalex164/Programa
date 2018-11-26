import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

public class V01 {
	
	public V01() {

		JFrame Registro = new JFrame ();
		Registro.setBounds(200, 100, 1000, 600);
		Registro.setTitle("Registro");
		Registro.setLayout(null);
		
		//PANEL
		JPanel panel = new JPanel ();
		panel.setBounds(0, 0, 1000, 600);
		panel.setBackground(Color.decode("#E1BEE7"));
		panel.setLayout(null);
		
		//LOGO
		JLabel logo = new JLabel();
		ImageIcon log = new ImageIcon("src/sol.png");	
		logo.setBounds(450, 20, 100, 100  );
		
		Icon imagen2;	
		imagen2 = new ImageIcon(log.getImage().getScaledInstance(logo.getWidth(), 
				logo.getHeight(), Image.SCALE_AREA_AVERAGING));
		logo.setIcon(imagen2);
		
	
		
		//TEXTO BIENVENIDA
		JLabel Bienvenida = new JLabel ();
		String B = "Bienvenido  a HOPELANDS ";
		Bienvenida.setBounds(300, 80, 650, 140);
		Bienvenida.setText(B);
		Bienvenida.setFont(new Font ("Comic Sans MS", 30, 35));
		
		JLabel mensaje = new JLabel();
		String m = "¿Ya tienes una cuenta? Inicia sesión";
		mensaje.setBounds(350, 120, 650, 140);
		mensaje.setText(m);
		mensaje.setFont(new Font("Comic Sans MS", 15, 20));
		
		//NOMBRE
		JLabel textoA = new JLabel ();
		String tA = "Nombre(s):";
		textoA.setText(tA);
		textoA.setBackground(Color.WHITE);
		textoA.setFont(new Font ("Comic Sans MS", 10, 15 ));
		textoA.setBounds(200, 215, 83, 55);
		
		JTextField CajaTN = new JTextField ();
		CajaTN.setBounds(280, 230, 150, 30);
		CajaTN.setForeground(Color.BLACK);
		CajaTN.setBorder(new LineBorder (Color.BLACK));
		
		//APELLIDOS 
		JLabel textoB = new JLabel ();
		String tB = "Apellido:";
		textoB.setText(tB);
		textoB.setBackground(Color.WHITE);
		textoB.setFont(new Font("Comic Sans MS", 10, 15));
		textoB.setBounds(450, 215, 122, 55);
		
		
		//BARRA APELLIDOS
		JTextField CajaTA = new JTextField ();
		CajaTA.setBounds(515, 230, 150, 30 );
		CajaTA.setForeground(Color.BLACK);
		CajaTA.setBorder(new LineBorder(Color.BLACK));
		
		
		//EDAD 
	    JLabel Edad = new JLabel ();	
	    String E = "Edad:";
	    Edad.setText(E);
		Edad.setBackground(Color.BLACK);
		Edad.setFont(new Font("Comic Sans MS", 10, 15));
		Edad.setBounds(690,  215, 130,55);
		
		JTextField CajaE = new JTextField ();
		CajaE.setBounds(730, 230, 30, 30);
		CajaE.setForeground(Color.BLACK);
		CajaE.setBorder(new LineBorder (Color.BLACK));
		
		//SEXO
		JLabel Sexo = new JLabel ();
		String S = "Sexo:";
		Sexo.setText(S);
		Sexo.setBackground(Color.BLACK);
		Sexo.setFont(new Font ("Comic Sans MS", 10, 15));
		Sexo.setBounds(140, 260, 122, 55);
		
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Femenino");
		combo.addItem("Masculino");
		combo.addItem("Sin Definir");
		combo.setBounds(180, 270, 100, 30);
		
		//ESTADO
		JLabel Estado = new JLabel ();
		String Es = "Estado:";
		Estado.setText(Es);
		Estado.setBackground(Color.BLACK);
		Estado.setFont(new Font("Comic Sans MS", 10, 15));
        
		Estado.setBounds(300, 260, 122, 55);
		
        JTextField CajaEs = new JTextField ();
        CajaEs.setBounds(355, 270, 120, 30);
        CajaEs.setForeground(Color.BLACK);
        CajaEs.setBorder(new LineBorder (Color.BLACK));
        
		//MUNICIPIO
		JLabel Municipio = new JLabel ();
		String M = "Municipio:";
		Municipio.setText(M);
		Municipio.setBackground(Color.BLACK);
		Municipio.setFont(new Font ("Comic Sans MS", 10, 15 ));
		Municipio.setBounds(490, 260, 140, 55);
		
		JTextField CajaM = new JTextField();
		CajaM.setBounds(560, 270, 190, 30);
		CajaM.setForeground(Color.BLACK);
		CajaM.setBorder(new LineBorder(Color.BLACK));
		
		//CODIGO POSTAL
		JLabel Postal = new JLabel();
		String CP = "C.P.:";
		Postal.setText(CP);
		Postal.setBackground(Color.BLACK);
		Postal.setFont(new Font ("Comic Sans MS", 10, 15));
		Postal.setBounds(760, 260, 122, 55);
		
		JTextField CajaCP= new JTextField();
		CajaCP.setBounds(790, 270, 100, 30);
		CajaCP.setForeground(Color.BLACK);
		CajaCP.setBorder(new LineBorder(Color.BLACK));
		
		//TELEFONO
		JLabel Celular = new JLabel ();
		String RCelular = "Celular:";
		Celular.setText(RCelular);
		Celular.setBackground(Color.BLACK);
		Celular.setFont(new Font ("Comic Sans MS", 10, 15));
		Celular.setBounds(80, 300, 140, 55 );
		
		
		JTextField CajaCelular = new JTextField ();
		CajaCelular.setBounds(140, 310, 120, 30);
		CajaCelular.setForeground(Color.BLACK);
		CajaCelular.setBorder(new LineBorder (Color.BLACK));
		
		//USUARIO
		JLabel Usuario = new JLabel();
		String Us = "Usuario:";
		Usuario.setText(Us);
		Usuario.setFont(new Font ("Comic Sans MS", 10, 15));
		Usuario.setBackground(Color.BLACK);
	    Usuario.setBounds(267, 310, 200, 30);
	    
	    JTextField CUs = new JTextField();
		CUs.setBounds(325, 310, 150, 30);
		CUs.setForeground(Color.BLACK);
		CUs.setBorder(new LineBorder(Color.BLACK));

		//CORREO
		JLabel Correo = new JLabel ();
		String Cor = "Correo:";
		Correo.setText(Cor);
		Correo.setBackground(Color.BLACK);
		Correo.setFont(new Font("Comic Sans MS",10, 15));
		Correo.setBounds(485, 300, 122, 55);
		
		JTextField CajaCor = new JTextField();
		CajaCor.setBounds(540, 310, 200, 30);
		CajaCor.setForeground(Color.BLACK);
		CajaCor.setBorder(new LineBorder(Color.BLACK));
		
		//CONTRASEÑA
		JLabel Contrasena = new JLabel();
		String Contra = "Contraseña:";		
		Contrasena.setText(Contra);
		Contrasena.setBackground(Color.BLACK);
		Contrasena.setFont(new Font("Comic Sans MS",10, 15));
		Contrasena.setBounds(745, 300, 140, 55);

		JTextField CajaContra = new JTextField();
		CajaContra.setBounds(830, 310, 120, 30);
		CajaContra.setForeground(Color.BLACK);
		CajaContra.setBorder(new LineBorder(Color.BLACK));
		
		//BOTONES 
		JButton bAnterior = new JButton ();
		bAnterior.setText("Regresar");
		bAnterior.setBorder(new LineBorder(Color.BLACK));
		bAnterior.setBounds(250, 500, 120, 30);
		
		JButton bSiguiente = new JButton ();
		bSiguiente.setText("Siguiente");
		bSiguiente.setBorder(new LineBorder(Color.BLACK));
		bSiguiente.setBounds(680, 500, 120, 30);
			
		
		//CUENTA CREADA
		JDialog registrado = new JDialog();
		registrado.setBounds(500, 250, 270, 150);
		registrado.setLayout(null);
						
		JPanel fondo = new JPanel();
		fondo.setBackground(Color.decode("#e040fb"));
		fondo.setBounds(0, 0, 300, 200);
		fondo.setLayout(null);
		registrado.add(fondo);
		
		JLabel texto = new JLabel();
		String text = "cuenta creada existosamente";
		texto.setText(text);
		texto.setBackground(Color.BLACK);
		texto.setFont(new Font("Verdana", 15, 15));
		texto.setBounds(20, 10, 300, 70);
		fondo.add(texto);
		
		//BOTON PARA REGRESAR
		JButton regreso = new JButton();
		
		
		//BOTON
		JButton aceptar = new JButton();
		aceptar.setBounds(85, 55, 75, 25);	
		fondo.add(aceptar);
		aceptar.setFont(new Font ("Verdana", 10, 10));
		aceptar.setText("Aceptar");
		
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				registrado.setVisible(false);
				Inicio k = new Inicio();
				
			}
		});
				
		
		 //AGREGADOS A LA VENTANA
		Registro.add(panel);
		panel.add(logo);
		panel.add(textoA);
		panel.add(Bienvenida);
		panel.add(mensaje);
		panel.add(CajaTN);
		panel.add(textoB);
		panel.add(CajaTA);
		panel.add(Edad);
		panel.add(CajaE);
		panel.add(Sexo);
		panel.add(combo);
		panel.add(Estado);
		panel.add(CajaEs);
		panel.add(Municipio);
		panel.add(CajaM);
		panel.add(Postal);
		panel.add(CajaCP);
		panel.add(Usuario);
		panel.add(CUs);
		panel.add(Correo);
		panel.add(CajaCor);
		panel.add(Contrasena);
		panel.add(CajaContra);
		panel.add(Celular);
		panel.add(CajaCelular);
		panel.add(bAnterior);
		panel.add(bSiguiente);
		
		Registro.setVisible(true);
		
		 //CONEXION
		 Conexion1 cn = new Conexion1();
		 cn.conectar();
		bSiguiente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			
				
				
				if(cn.buscarUsuarioRpetido(CUs.getText().toString())==true){
					JOptionPane.showMessageDialog(null, "EL USUARIO EXISTE");					
					
				}else {
					
					int reg = cn.insertarActualizarEliminar(("INSERT INTO Caridad1 ( Nombre, Apellido, Edad, Estado, Municipio, Cp, Correo,  Celular)  VALUES ( '"+CajaTN.getText()+"', '"+CajaTA.getText()+"', '"+CajaE.getText()+"', '"+CajaEs.getText()+"', '"+CajaM.getText()+"', '"+CajaCP.getText()+"', '"+CajaCor.getText()+"', '"+CajaCelular.getText()+"' )"));
					int reg1 = cn.insertarActualizarEliminar("INSERT INTO cuentas(Usuario, Contraseña) Values ('"+CUs.getText()+"', '"+CajaContra.getText()+"')");
					registrado.setVisible(true);
					Registro.setVisible(false);
					System.out.println("registros insertados: " + reg);   //VERIFICA
					System.out.println("registros insertados: " + reg1);  
				}
				 
			}
		});
		
		
	

		
		//NO ESTABA EL CODIGO PARA INGRESAR JAJAJAJAJ QUE PASÓ :0 NO SE, SI HABIA ESTADO FUNCIONANDO HACE RATO D:
		 
		 
	}

}
