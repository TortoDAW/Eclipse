package P00;
public class Alumno {
	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion){
		this.getNombre();
		this.getApellidos();
		this.getNre();
		this.getEmail();
		this.getDireccion();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() >= 1) {
			this.nombre = nombre;
		}
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if(apellidos.length() >= 1) {
			this.apellidos = apellidos;
		}
	}
	
	public String getNre() {
		return nre;
	}
	public void setNre(String nre) {
		if(nre.length() >= 3) {
			this.nre = nre;
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() >= 2) {
			this.email = email;
		}
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		if(direccion.length() >= 3) {
			this.direccion = direccion;
		}
	}
	public void info() {
		System.out.println("Nombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nNRE: " + this.nre + "\nEmail: " + this.email +"\nDireccion: " + this.direccion);
	}
}
