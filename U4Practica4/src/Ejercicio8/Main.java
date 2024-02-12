package Ejercicio8;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------- Original -----------------------------------");
		
		Punto punto1 = new Punto(-2, 1);
		
		System.out.print("1º Punto: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.print(punto1.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto1.distancia());
		
		Punto punto2 = new Punto(-10, 2.5);
		
		System.out.print("2º Punto: ("+punto2.getX()+", "+punto2.getY()+"). ");
		System.out.print(punto2.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto2.distancia());
		
		Punto punto3 = new Punto(5.2, -1);
		
		System.out.print("3º Punto: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.print(punto3.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto3.distancia());
		
		Punto punto4 = new Punto(-1550.025, -4E-2);
		
		System.out.print("4º Punto: ("+punto4.getX()+", "+punto4.getY()+"). ");
		System.out.print(punto4.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto4.distancia());
		
		System.out.println();
		System.out.println("---------------------------------------- Modificado -----------------------------------");
		
		punto1.moverA1();
		System.out.print("1º Punto: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.print(punto1.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto1.distancia());
		
		punto2.moverA1();
		System.out.print("2º Punto: ("+punto2.getX()+", "+punto2.getY()+"). ");
		System.out.print(punto2.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto2.distancia());
		
		punto3.moverA1();
		System.out.print("3º Punto: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.print(punto3.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto3.distancia());
		
		punto4.moverA1();
		System.out.print("4º Punto: ("+punto4.getX()+", "+punto4.getY()+"). ");
		System.out.print(punto4.cuadrante());
		System.out.println(" Desde el Origen (0, 0) hasta el Punto: "+ punto4.distancia());
		
	}

}
