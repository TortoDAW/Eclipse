import java.util.Scanner
public class SecuenciaVectores {
	
	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] array1 = new int[7];
		int[] array2 = new int[4];
		
		System.out.println("VECTOR DE 7 ENTEROS");
		rellenarArray(array1);
		System.out.println("VECTOR DE 4 ENTEROS");
		rellenarArray(array2);
		
		int resultado = buscarSecuenciaInt(array1,array2);
		System.out.print("Consecutivos: "+resultado);

	}
	public static int buscarSecuenciaInt(int[] array1, int[] array2) {
		int consecutivos = 0;
		
		for(int i = 0; i <= array1.length - array2.length; i++) {
			if(coincidenArrays(array1, i, array2)) {
				consecutivos ++;
			}
		}
		return consecutivos;
	}
	public static void rellenarArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			array[i] = pedirInt((i+1)+".Numero: ");
		}
	}
	public static boolean coincidenArrays(int[] array1, int indiceInicio, int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			if (array1[indiceInicio + i] != array2[i]) {
				return false;
			}
		}
		return true;
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
