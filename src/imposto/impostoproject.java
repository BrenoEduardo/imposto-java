package imposto;

import java.util.Locale;
import java.util.Scanner;

public class impostoproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ras, raps, ragc, gn, ge;
		
		System.out.printf("Renda anual com sal�rio: ");
		ras = sc.nextDouble();
		System.out.printf("Renda anual com presta��o de servi�o: ");
		raps = sc.nextDouble();
		System.out.printf("Renda anual com ganho de capital: ");
		ragc = sc.nextDouble();
		System.out.printf("Gastos m�dicos: ");
		gn = sc.nextDouble();
		System.out.printf("Gastos educacionais: ");
		ge = sc.nextDouble();
		
		
		
		sc.close();

	}

}
