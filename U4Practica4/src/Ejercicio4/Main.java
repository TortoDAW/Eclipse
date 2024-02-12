package Ejercicio4;

/*
Una vez definida la clase Punto representada por sus coordenadas x e y (números reales).
Una vez definido un constructor genérico que reciba las dos coordenadas.
Define un método que se llame cuadrante() que devuelva el nombre del cuadrante en el que se encuentra el punto. Debe controlar además si se encuentra entre dos cuadrantes o sobre el centro del eje (0, 0)
Crea varios puntos en main() de clase Principal.
Muestra por pantalla las coordenadas de cada uno de los puntos.
Muestra por pantalla los cuadrantes en los que se encuentra cada punto.
Modifica alguno de los puntos accediendo directamente a los atributos correspondientes y vuelve a comprobar su cuadrante.
Deben seguirse los principios y estilo del código limpio.
 */

public class Main {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(2,1);
		
		System.out.print("1º Punto: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.println(punto1.cuadrante());
		
		Punto punto2 = new Punto(0,3);
		
		System.out.print("2º Punto: ("+punto2.getX()+", "+punto2.getY()+"). ");
		System.out.println(punto2.cuadrante());
		
		Punto punto3 = new Punto(-1,4);
		
		System.out.print("3º Punto: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.println(punto3.cuadrante());
		
		Punto punto4 = new Punto(0,0);
		
		System.out.print("4º Punto: ("+punto4.getX()+", "+punto4.getY()+"). ");
		System.out.println(punto4.cuadrante());
		
		System.out.println();
		
		punto1.setX(-4);
		punto1.setY(-1);
		
		punto3.setX(-2);
		punto3.setY(0);
		
		System.out.print("1º Punto modificado: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.println(punto1.cuadrante());
		
		System.out.print("3º Punto modificado: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.println(punto3.cuadrante());
		
	}

}
