package exercicios07;

import java.util.Scanner;

public class Exericicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primeiro valor: ");
			double n1 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor: ");
			double n2 = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor: ");
			double n3 = sc.nextDouble();
			
			System.out.println("Iforme a media dos exercicio: ");
			double mediaExercicios = sc.nextDouble();
			
			double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios);
			
			char conceito;
			
			if(mediaAproveitamento >= 9.0) {
				conceito = 'A';			
			}	else if (mediaAproveitamento >=7.5) {
				conceito = 'B';
			}   else if (mediaAproveitamento >= 6.0) {
				conceito = 'C';
			}   else {
				conceito  = 'D';
			}
 			System.out.println("Conceito do aluno é: " + conceito);
			
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		
		sc.close();
	}
}
