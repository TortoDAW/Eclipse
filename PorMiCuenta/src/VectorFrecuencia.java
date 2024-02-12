import java.util.Scanner;
public class VectorFrecuencia {

	public static void main(String[] args) {
		
		int[] array = {3,4,5,6,7,3,2,3,3,8};
		int numero;
		int contador = 0;
		
		numero = pedirInt("Introduce un numero: ");
		
		System.out.print("Frecuencia del numero "+numero+" en el array es: ");
		
		frecuenciaNumero(numero, array, contador);
		
	}
	
	public static void frecuenciaNumero(int numero, int[] array, int contador) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==numero) {
				contador++;
			}
		}
		
		System.out.print(contador);
		
	}
	
	public static int pedirInt(String enunciado) {
		Scanner patata = new Scanner(System.in);
		
		System.out.print(enunciado);
		
		int numero = 0;
		
		try {
			numero = Integer.parseInt(patata.nextLine().trim());
		}catch(Exception e) {
			System.out.print("Error: "+e.getMessage());
		}
		return numero;
	}
}
