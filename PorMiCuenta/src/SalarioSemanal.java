import java.util.Scanner;
public class SalarioSemanal {
	public static Scanner patata = new Scanner(System.in);
	
	public static void main(String[] args) {
		int dinero = 0,horasLim = 35,salario = 15,salarioExtra = 22, horas;
		String seguir;
		
		do {
			do {
				horas = pedirInt("Inserte las horas que se trabaja: ");
				
				if(horas<=0) {
					System.out.println("No se ha trabajado");
					horas = 0;
				}
				
			}while(horas<0);
			
			int total = calcularSalario(dinero,horas,salario,horasLim,salarioExtra);
			System.out.println("Por "+horas+" trabajadas cobra "+total+"€");
			
			System.out.print("Desea seguir insertando horas?(S/N): ");
			seguir = patata.nextLine();
			continue;
			
		}while(seguir.trim().equalsIgnoreCase("S"));
	}
	public static int calcularSalario(int dinero, int horas, int salario, int horasLim, int salarioExtra) {
		
		if(horas<=35){
			dinero = salario*horas;
		}else if(horas>35) {
			int salarioNormal = salario*horasLim;
			int salarioPorEncima = (horas-horasLim)*salarioExtra;
			dinero = salarioNormal + salarioPorEncima;			
		}
		return dinero;
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
				System.out.print("ERROR: has insertado una letra.\nPrueba de nuevo: ");
			}
		}while(!check);
		return numero;
	}
}
