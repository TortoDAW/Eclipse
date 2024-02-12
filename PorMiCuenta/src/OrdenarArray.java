import java.util.Scanner;
public class OrdenarArray {
	
	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int array[] = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = pedirInt((i+1)+". Numero: ");
		}
		
		int resultado = contarIntConsecutivos(array);
		System.out.print(resultado);

	}
	public static int contarIntConsecutivos(int[] array) {
		int consecutivos = 1 ;
		int contadorMax = 1;
		boolean hayConsec = false;
		
		for(int i=1; i<array.length; i++) {
			if(array[i]==array[i-1]+1) {
				consecutivos++;
				hayConsec = true;
			}else {
				consecutivos = 1;
			}
			
			if(consecutivos>contadorMax) {
				contadorMax=consecutivos;
			}
		}
		return hayConsec ? contadorMax : 0; /*condicion ? valorSiTrue : valorSiFalse;
		Si hayConsec es true, entonces la expresión devuelve contadorMax.
		Si hayConsec es false, entonces la expresión devuelve 0.*/
	}
	public static int pedirInt(String enunciado) {
		int numero = 0;
		boolean check = false;
		
		System.out.print(enunciado);
		
		do {
			try {
				numero = Integer.parseInt(patata.nextLine().trim());
				check = true;
			}catch(Exception e) {
				System.out.print("ERROR: has insertado una letra.\nVuelve a intentarlo:");
			}
		}while(!check);
		return numero;
	}

}
