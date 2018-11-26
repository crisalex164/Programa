import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Conexion1 {

	Connection con;
	Statement st;
	ResultSet rs;

	boolean conectar() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\ChristianAlejandro\\Documents\\base de datos\\Caridad1.accdb");

			//JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSA");

			return true;
		} catch (ClassNotFoundException ex) {

			System.out.println("ERROR DE CONEXIÓN");

		} catch (SQLException ex) {
			System.out.println("ERROR DE CONEXIÓN");
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// BIEN, VOY A CREAR EL MÉTODO QUE VA HACER UNA CONSULTA DE TU TABLA USUARIOS,
		// ABRE EL ARCHIVO DE ACCESS DEO
		// ES EL QUE ACABO DE ABRIR VALE
		return false;

	}

	int insertarActualizarEliminar(String sql) {
		try {
			st = con.createStatement();
			return st.executeUpdate(sql);
		} catch (SQLException ex) {

			System.err.println(ex);

		}
		return 0;
	}

	public String buscarUsuario(String query) {
		String reNombre = "";
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);

			boolean r = rs.next();
			if (r) {

				reNombre = rs.getString(1);

				r = rs.next();
			} else {

				reNombre = "No existe el usuario";
			}

		} catch (SQLException e) {
			reNombre = "No existe el usuario";
			System.out.println(e);

		}

		return reNombre;
	}

	public void buscar(String query, ArrayList<Usuario> usuarios) {
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);

			boolean r = rs.next();
			while (r) {
				Usuario u = new Usuario();
				// USAR LOS SETS Y EN LAS COMILLAS PON EXACTAMETE LOS NOMBRES DE LOS CAMPOS
				u.setNombre(rs.getString("Nombre"));
				u.setApellido(rs.getString("Apellido"));
				u.setEdad(rs.getString("Edad"));
				u.setEstado(rs.getString("Estado"));
				u.setMunicipio(rs.getString("Municipio"));
				u.setCp(rs.getString("Cp"));
				u.setCorreo(rs.getString("Correo"));
				u.setContraseña(rs.getString("Contraseña"));
				u.setCelular(rs.getString("Celular"));
				usuarios.add(u);
				// PERFECTO, AQUÍ LO QUE HAREMOS ES BUSCAR TODA LA INFO DE LOS USUARIOS
				r = rs.next();
			}

		} catch (SQLException e) {
			System.out.println(e);

		}
	}

	
	public String buscarContraseña(String nombre) {
		String sentencia= "SELECT Contraseña FROM cuentas WHERE Usuario = '"+nombre+"'";
		String reContraseña = "";
		try {
			st = con.createStatement();
			rs = st.executeQuery(sentencia);

			boolean r = rs.next();
			if (r) {

				reContraseña = rs.getString(1);

				r = rs.next();
			} else {

				reContraseña = "No existe el usuario";
			}

		} catch (SQLException e) {
			reContraseña = "No existe el usuario";
			System.out.println(e);

		}

		return reContraseña;
		
	
	}
	
	public boolean buscarUsuarioRpetido(String usuarioBuscar) {
		boolean respuesta;
		
		String sentencia= "SELECT Usuario FROM cuentas WHERE Usuario = '"+usuarioBuscar+"'";
		
		try {
			st = con.createStatement();
			rs = st.executeQuery(sentencia);

			boolean r = rs.next();
			if (r) {

				respuesta = true;
				
				r = rs.next();
				return true;

				
			} else {

				respuesta = false;
			}

		} catch (SQLException e) {
			respuesta =  false;
			System.out.println(e);

		}

		
		return respuesta;
		
	}

}
