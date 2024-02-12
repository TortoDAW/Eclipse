package Ejercicio7;

public class Main {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto(2,1);
		
		System.out.print("1º Punto: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.print(punto1.cuadrante());
		System.out.println(" Distancia desde el Origen (0, 0) hasta el Punto: "+ punto1.distancia());
		
		Punto punto2 = new Punto(0,3);
		
		System.out.print("2º Punto: ("+punto2.getX()+", "+punto2.getY()+"). ");
		System.out.print(punto2.cuadrante());
		System.out.println(" Distancia desde el Origen (0, 0) hasta el Punto: "+ punto2.distancia());
		
		Punto punto3 = new Punto(-1,4);
		
		System.out.print("3º Punto: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.print(punto3.cuadrante());
		System.out.println(" Distancia desde el Origen (0, 0) hasta el Punto: "+ punto3.distancia());
		
		Punto punto4 = new Punto(0,0);
		
		System.out.print("4º Punto: ("+punto4.getX()+", "+punto4.getY()+"). ");
		System.out.print(punto4.cuadrante());
		System.out.println(" Distancia desde el Origen (0, 0) hasta el Punto: "+ punto4.distancia());
		
		System.out.println();
		
		punto1.setX(-4);
		punto1.setY(-1);
		
		punto3.setX(-2);
		punto3.setY(0);
		
		System.out.print("1º Punto modificado: ("+punto1.getX()+", "+punto1.getY()+"). ");
		System.out.println(punto1.cuadrante());
		System.out.println(" Distancia modificada desde el Origen (0, 0) hasta el Punto: "+ punto1.distancia());
		
		System.out.print("3º Punto modificado: ("+punto3.getX()+", "+punto3.getY()+"). ");
		System.out.println(punto3.cuadrante());
		System.out.println(" Distancia modificada desde el Origen (0, 0) hasta el Punto: "+ punto3.distancia());
		
	}

}
