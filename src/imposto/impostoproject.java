package imposto;

import java.util.Locale;
import java.util.Scanner;

public class impostoproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ras, raps, ragc, gn, ge, isalario = 0, iservicos = 0, icapital = 0, md, gd;
		
		//LEITURA DE DADOS
		
		System.out.printf("Renda anual com salário: ");
		ras = sc.nextDouble();
		System.out.printf("Renda anual com prestação de serviço: ");
		raps = sc.nextDouble();
		System.out.printf("Renda anual com ganho de capital: ");
		ragc = sc.nextDouble();
		System.out.printf("Gastos médicos: ");
		gn = sc.nextDouble();
		System.out.printf("Gastos educacionais: ");
		ge = sc.nextDouble();
		// CONSOLIDAÇÃO DE RENDA
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		
		if( ras < 36000.00) {
			System.out.println("Imposto sobre o salário: 0.00");
		}
		else if( ras > 36000.00 && ras < 60000.00) {
			isalario = ras * 10 /100;
			System.out.println("Imposto sobre o salário: " + isalario);
		}
		else {
			isalario = ras * 20 /100;
			System.out.println("Imposto sobre o salário: " + isalario);
		}
		if (raps > 0.00 ) {
			iservicos = raps * 15 /100;
			System.out.println("Imposto sobre serviços: " + iservicos);
		}
		else {
			System.out.println("Imposto sobre serviços: 0.00");
		}
		if ( ragc > 0) {
			icapital = ragc * 20 /100;
			System.out.println("Imposto sobre ganho de capital:" + icapital);
		}
		else {
			System.out.println("Imposto sobre ganho de capital: 0.00");
		}
		// DEDUCOES
		
		System.out.println();
		
		System.out.println("DEDUÇÕES:");
		
		md = (isalario * 30/100) + (iservicos * 30/100) + (icapital *30/100);
		
		System.out.println("Máximo dedutível:" + md);
		
		gd = gn + ge;
		
		System.out.println("Gastos dedutíveis:" + gd);
		
		
		
		
		
		
		
		sc.close();

	}

}
