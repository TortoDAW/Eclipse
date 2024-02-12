package Ejercicio12;

public class Archivo {
	private String marca;
	private int kilometraje;
	private String color;
	private String modelo;
	
	public Archivo() {
		
	}
	
	public Archivo(String marca, int kilometraje, String color, String modelo) {
		this.setMarca(marca);
		this.setKilometraje(kilometraje);
		this.setColor(color);
		this.setModelo(modelo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
