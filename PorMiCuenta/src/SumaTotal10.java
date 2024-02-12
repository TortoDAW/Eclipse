//Pedir 10 numeros y escribir la suma total

import java.util.Scanner;
public class SumaTotal10 {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		int array[] = new int[11];
		int suma = 0;
		
		System.out.println("Inserte 10 numeros enteros");
		
		for(int i = 1; i < array.length; i++) {
			System.out.print(i+"º numero: ");
			array[i] = patata.nextInt();
			suma += i;
		}
		System.out.println("La suma de todos ellos es "+suma);
		 
	}
}
