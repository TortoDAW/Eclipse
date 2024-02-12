// Pedir 10 numeros y mostrar si se ha introducido uno negativo
import java.util.Scanner;
public class NumNegativo {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		
		int numero;	
		int contadorNeg = 0;
		
		System.out.println("Introduce 10 numeros");
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+"º numero: ");
			numero = patata.nextInt();
			if(numero<0) {
				contadorNeg++;
			}
		}
	System.out.print(contadorNeg+" numeros negativos introducidos");
	}
}
