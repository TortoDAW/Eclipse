/*
Define la clase Punto representada por sus coordenadas x e y (números reales).
Prueba la creación de objetos de la clase instanciando un nuevo punto en la clase Principal, que contiene el método main().
Asigna valores a las coordenadas de los puntos creados.
Muestra por pantalla las coordenadas de cada punto.
Modificar alguna de sus coordenadas accediendo directamente al atributo correspondiente y vuelve a mostrar los puntos por pantalla.
Deben seguirse los principios y estilo del código limpio.
 */

public class Main {

	public static void main(String[] args) {
		
		Punto punto = new Punto();
		
		System.out.println("Coordenada inicial es: "+punto.getX()+", "+punto.getY());
		
		punto.setX(1);
		punto.setY(4);
		
		System.out.println("Coordenada inicial es: "+punto.getX()+", "+punto.getY());
	}

}
