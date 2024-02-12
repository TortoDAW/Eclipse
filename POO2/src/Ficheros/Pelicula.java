package Ficheros;

public class Pelicula {
	private String titulo;
	private int duracion;
	private String sinopsis;
	private String genero;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String titulo, int duracion, String sinopsis, String genero) {
		this.setDuracion(duracion);
		this.setGenero(genero);
		this.setSinopsis(sinopsis);
		this.setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.trim().length() >= 1) {
			this.titulo = titulo;
		}
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		if(duracion >= 1) {
			this.duracion = duracion;
		}
		
	}

	public String getSinopsis() {
			return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		if(sinopsis.trim().length() > 3) {
			this.sinopsis = sinopsis;
		}
		
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
