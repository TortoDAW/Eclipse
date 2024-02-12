package Ejercicio10;

public class Fichero {
	private String texto;
	
	public Fichero() {
		
	}
	
	public Fichero(String texto) {
		this.setTitulo(texto);
	}

	public String getTitulo() {
		return texto;
	}

	public void setTitulo(String texto) {
		if(texto.trim().length() >= 1) {
			this.texto = texto;
		}
	}
}
