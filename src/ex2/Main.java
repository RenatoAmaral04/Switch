
package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		int x = ff.nextInt();
		String dia;
		
		switch (x) {
		
		case 1:
			dia = "Bom dia";
			break;
			
		case 2:
			dia = "Boa tarde";
			break;
			
		case 3:
			dia = "Boa noite";
			break;
			
			
		default:
			dia = "Inválido";
			break;
		}
		
		ff.close();
		System.out.println(dia);

	}

}
 /* Scanner ff = new Scanner(System.in);
 * 
 * int a = 0; int g = 0; int d = 0;
 * 
 * int x = ff.nextInt();
 * 
 * while (x != 4) {
 * 
 * if (x == 1) { a += 1;
 * 
 * } else if (x == 2) { g += 1;
 * 
 * } else if (x == 3) { d += 1; }
 * 
 * x = ff.nextInt();
 * 
 * }
 * 
 * System.out.println("Muito Obrigado!!"); System.out.println("Alcool " + a);
 * System.out.println("Gasolina " + g); System.out.println("Diesel " + d);
 * ff.close();
 * 
 * } }
*/





