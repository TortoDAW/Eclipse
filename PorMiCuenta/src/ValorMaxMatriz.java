import java.util.Scanner;
public class ValorMaxMatriz {
	
	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int f,c;
		
		do {
			f = pedirInt("Inserte cuanto medirá la matriz (filas): ");
			
			if(f<=1) {
				System.out.println("La matriz tiene que ser minimo 2x2");
			}
		}while(f<=1);
		
		do {
			c = pedirInt("Inserte cuanto medirá la matriz (columnas): ");
			
			if(c<=1) {
				System.out.println("La matriz tiene que ser minimo 2x2");
			}
		}while(c<=1);
			
		int[][] matriz = new int[f][c];
		
		for(int i = 0; i<f; i++) {
			for(int j = 0; j<c; j++) {
				matriz[i][j] = pedirInt("["+i+"]["+j+"]: ");
			}
		}
		
		for(int i = 0; i<f; i++) {
			for(int j = 0; j<c; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void
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
