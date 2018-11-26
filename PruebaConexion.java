import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class PruebaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Conexion1 cn = new Conexion1();
		    cn.conectar();
		    
		   /* int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
		    if ( numero < 10) {
			int reg =    cn.insertarActualizarEliminar("INSERT INTO Caridad(id, Nombre, Apellido_Paterno, Apellido_Materno, Edad, Estado, Municipio, Colonia, Cp, Correo, Contraseña, Repetir_Contraseña) VALUES('7', 'Vania', 'Méndez', 'Morales', '18', 'Tabasco', 'Centro', 'atasta', '86100', 'vaniali0518@gmail.com', 'Vania0518', 'Vania0518' )");
			System.out.println("registros insertados: " + reg);
				}else {
			int reg1 = cn.insertarActualizarEliminar("UPDATE Caridad SET Nombre = 'Juan Gerardo' , Apellido_Paterno = 'Peralta', Apellido_Materno = 'Gonzales' WHERE id = 9  ");
			System.out.println("registros actualizados: " + reg1);
				}
			
			
		int reg2 = cn.insertarActualizarEliminar("DELETE From caridad ;");
		System.out.print("registros eliminados: " + reg2);
		
			
		

	/*public static void main(String[] args) {
		Conexion1 c = new Conexion1();
		
		c.conectar();
		
		
		String reg1= "INSERT INTO caridad (id,nombre, apellido_paterno, apellido_materno, edad, estado, municipio, colonia, cp, correo, contraseña)  VALUES('1','Vania', 'Méndez', 'Morales', '18', 'Tabasco', 'Centro', 'atasta', '86100', 'vaniali0518@gmail.com', 'Vania0518');";

	c.insertarActualizarEliminar(reg1);

	}
	*/
	
		    
		    
		  /*  
		  //CONEXION
			 Conexion1 cn = new Conexion1();
			 cn.conectar();
			bSiguiente.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
				
					//int reg = cn.insertarActualizarEliminar("INSERT INTO Caridad1 ( Nombre(s), Apellido(s), Edad, Estado, Municipio, Cp, Correo, Contraseña, Repite_Contraseña)  VALUES( '"+CajaTN.getText()+"', '"+CajaTA.getText()+"', '"+CajaE.getText()+"', '"+CajaEs.getText()+"', '"+CajaM.getText()+"', '"+CajaCP.getText()+"', '"+CajaCor.getText()+"', '"+CajaContra.getText()+"')");
					//System.out.print("registros insertados: " + reg);
					Registro.setVisible(false);
					acceso.setVisible(true);
				}
			});
			*/
	}

}
