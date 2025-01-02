package exercicios.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaAnualSalario;
		double rendaAnualServico;
		double rendaAnualCaptal;
		double gastoMedicos;
		double gastosEducacionais;
		
		
		double abatimento;
		double impostoBruto;
		double impostoDedutivel;
		double impostoDevido = 0;
		
		double gastoDebutivel;
		double impostoSalario;
		double impostoServico;
		double impostoCapital;
		
		System.out.print("Renda anual com salário: ");
		rendaAnualSalario = sc.nextDouble();
		
		System.out.print("Renda anual com prestação de serviço: ");
		rendaAnualServico = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital: ");
		rendaAnualCaptal = sc.nextDouble();
		
		System.out.print("Gastos médicos: " );
		gastoMedicos = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		if(rendaAnualSalario/12 < 3000) {
			
			impostoSalario = 0.00;
			
		}else if(rendaAnualSalario/12 >= 3000 && rendaAnualSalario/12 <= 5000) {
			impostoSalario = rendaAnualSalario*0.1;
		}else {
			impostoSalario = rendaAnualSalario*0.2;
		}
		
		impostoServico = 0;
		if(rendaAnualServico/12 > 0) {
			impostoServico = rendaAnualServico *0.15;
		}
		
		impostoCapital = 0;
		if(rendaAnualCaptal > 0) {
			impostoCapital = rendaAnualCaptal*0.20;
		}
		
		impostoBruto = impostoSalario + impostoServico +impostoCapital;
		
		impostoDedutivel = impostoBruto*0.3;
		
		gastoDebutivel = gastoMedicos + gastosEducacionais;
		
		if(gastoDebutivel > impostoDedutivel) {
			abatimento = impostoDedutivel;
			impostoDevido = impostoBruto - abatimento;
		}else {
			abatimento =  gastoDebutivel;
			impostoDevido = impostoBruto - abatimento;
		}
		
		
		System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA \n");
		
		System.out.println("\nCONSOLIDADO DE RENDA: \n");
		
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario );
		System.out.printf("Renda anual com prestação de serviço: %.2f\n", impostoServico );
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital );
		
		System.out.println("\nDEDUÇÕES: \n");
		
		System.out.printf("Máximo dedutível: %.2f\n", impostoDedutivel);
		System.out.printf("Gastos dedutíveis:: %.2f\n", gastoDebutivel);
		
		System.out.println("\nRESUMO: \n");
		System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impostoBruto -  abatimento);
	}
}
