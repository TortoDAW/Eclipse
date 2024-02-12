package Ejercicio3;
/*
Una vez definida la clase Punto representada por sus coordenadas x e y (números reales).
Define un constructor genérico que reciba las dos coordenadas.
Crea varios puntos en el método main() de la clase Principal.
Muestra por pantalla las coordenadas de cada uno de los puntos.
Modifica alguna de sus coordenadas accediendo directamente al atributo correspondiente y vuelve a mostrar los puntos.
Deben seguirse los principios y estilo del código limpio.
 */
public class Main {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(-5,1);
		Punto punto2 = new Punto(-9,2);
		Punto punto3 = new Punto(2,-4);
		
		System.out.println("Primera coordenada inicial es: "+punto1.getX()+", "+punto1.getY());
		System.out.println("Segunda coordenada inicial es: "+punto2.getX()+", "+punto2.getY());
		System.out.println("Tercera coordenada inicial es: "+punto3.getX()+", "+punto3.getY());
		
		punto1.setX(0);
		punto1.setY(4);
		
		punto2.setX(-3);
		punto2.setY(2);
		
		punto3.setX(19);
		punto3.setY(0);
		
		System.out.println("\nPrimera coordenada modificada es: "+punto1.getX()+", "+punto1.getY());
		System.out.println("Segunda coordenada modificada es: "+punto2.getX()+", "+punto2.getY());
		System.out.println("Tercera coordenada modificada es: "+punto3.getX()+", "+punto3.getY());
	}

}