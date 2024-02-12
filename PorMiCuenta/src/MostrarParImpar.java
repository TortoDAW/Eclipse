import java.util.Scanner;

public class MostrarParImpar {
	public static void main(String[] args) {
		
		int numero;
		
		do {
			numero = pedirInt("Introduce un entero positivo: ");
			
			if(numero<=0) {
				System.out.println("Intenta de nuevo");
			}
			
		}while(numero<=0);
		
		System.out.println("Numeros pares");
		
		for(int i=2; i<=numero; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nNumeros impares");
		
		for(int i=1; i<=numero; i=i+2) {
			System.out.print(i+" ");
		}
	}
	public static int pedirInt(String enunciado) {
		Scanner patata = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print(enunciado);
		
		try {
			numero = Integer.parseInt(patata.nextLine().trim());
		}catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		return numero;
	}
}
