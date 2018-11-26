
public class Usuario {
	String nombre, apellido, edad, estado, municipio, cp,  correo, contraseña, celular;
	//o todos los datos?todos

	
	public Usuario() {}
	public String getNombre() {
		return nombre;
	}

	public Usuario(String nombre, String apellido, String edad, String estado, String municipio, String cp,
			String correo, String contraseña, String celular) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.estado = estado;
		this.municipio = municipio;
		this.cp = cp;
		this.correo = correo;
		this.contraseña = contraseña;
		this.celular = celular;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	

}
