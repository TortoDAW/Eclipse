/*
   Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado calcularMostrarTabla().
   El método calcularMostrarTabla() recibe el número del que calculará la tabla y la visualiza por pantalla con el formato adecuado.
   La tabla mostrará productos hasta el 15. 
 */
package Unidad3;

import java.util.Scanner;

public class Practica3_2 {

	public static void main(String[] args) {
		int num;
		
		num = pedirInt("Introduce el numero del que deseas saber su tabla de multiplicar hasta el 15: ");
		
		calcularMostrarTabla(num);
	}
	public static int pedirInt(String enunciado) {
		Scanner patata = new Scanner(System.in);
		System.out.print(enunciado);
		int numero = 0;
		boolean check = false;
		
		do {
			try {
				numero = Integer.parseInt(patata.nextLine().trim());
				check = true;
			}catch(Exception e) {
				System.out.println("ERROR: valor no valido. Vuelve a probar.");
			}
		}while(!check);
		return numero;
	}
	public static void calcularMostrarTabla(int num) {
		for(int i = 1;i<=num;i++) {
			System.out.println("Tabla del "+i);
			for(int j = 0; j<=15; j++) {
				System.out.println(i+" x "+j+" = "+(j*i));
			}
		}
	}
}
