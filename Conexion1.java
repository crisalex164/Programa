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

			//JOptionPane.showMessageDialog(null, "CONEXI�N EXITOSA");

			return true;
		} catch (ClassNotFoundException ex) {

			System.out.println("ERROR DE CONEXI�N");

		} catch (SQLException ex) {
			System.out.println("ERROR DE CONEXI�N");
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		// BIEN, VOY A CREAR EL M�TODO QUE VA HACER UNA CONSULTA DE TU TABLA USUARIOS,
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
				u.setContrase�a(rs.getString("Contrase�a"));
				u.setCelular(rs.getString("Celular"));
				usuarios.add(u);
				// PERFECTO, AQU� LO QUE HAREMOS ES BUSCAR TODA LA INFO DE LOS USUARIOS
				r = rs.next();
			}

		} catch (SQLException e) {
			System.out.println(e);

		}
	}

	
	public String buscarContrase�a(String nombre) {
		String sentencia= "SELECT Contrase�a FROM cuentas WHERE Usuario = '"+nombre+"'";
		String reContrase�a = "";
		try {
			st = con.createStatement();
			rs = st.executeQuery(sentencia);

			boolean r = rs.next();
			if (r) {

				reContrase�a = rs.getString(1);

				r = rs.next();
			} else {

				reContrase�a = "No existe el usuario";
			}

		} catch (SQLException e) {
			reContrase�a = "No existe el usuario";
			System.out.println(e);

		}

		return reContrase�a;
		
	
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
