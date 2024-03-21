package exercicios07;

/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
  maiores.*/

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o primero valor: ");
			int valor1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
			int valor2 = sc.nextInt();
			
			System.out.println("Digite o terceiro valor: ");
			int valor3 = sc.nextInt();
			
			int maior;
			int segundoMaior;
			
			if(valor1 > valor2 && valor2 >valor3) {
				maior = valor1;
				segundoMaior = Math.max(valor2, valor3);
			}else if(valor2 > valor1 && valor2 > valor3) {
			 maior = valor2;
			 segundoMaior = Math.max(valor1, valor3);
			}else {
				maior = valor3;
				segundoMaior = Math.max(valor1, valor2);
			}
			
			float somaDosMaiores = maior + segundoMaior;
			
			System.out.println("A soma dos maiores valores é: "+ somaDosMaiores);
			
		} catch (Exception e) {
			System.out.println("Digite m valor valido");
		}
		
		
		sc.close();
	}
	
}
