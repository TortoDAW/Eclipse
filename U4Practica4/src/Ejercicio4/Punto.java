package Ejercicio4;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String cuadrante() {
		String cuadrante = "";
		
		if(x == 0 && y == 0) {
			return "Eje O";
		}else if(x < 0 && y < 0) {
			return "Cuadrante III";
		}else if(x > 0 && y < 0) {
			return "Cuadrante IV";
		}else if(x < 0 && y > 0) {
			return "Cuadrante II";
		}else if(x > 0 && y > 0) {
			return "Cuadrante I";
		}else if(x == 0 && y < 0 ) {
			return "Entre cuadrante III y IV";
		}else if(x == 0 && y > 0 ) {
			return "Entre cuadrante I y II";
		}else if(y == 0 && x < 0 ) {
			return "Entre cuadrante I y III";
		}else if(y == 0 && x > 0 ) {
			return "Entre cuadrante II y IV";
		}
		
		return cuadrante;
	}
	
}
