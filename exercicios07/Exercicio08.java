package exercicios07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o valor de X: ");
			int valor1 = sc.nextInt();
					
			System.out.println("Digite o valor fr Y: ");
			int valor2 = sc.nextInt();
			
			int z = (valor1*valor2)+5;
			
			char resposta;
			
			if(z <= 0) {
				resposta ='A';
			}else if(z <= 100) {
				resposta = 'B';
			}else {
				resposta = 'C';
			}
			System.out.println("Z " + z + ", Resposta " + resposta);
			
			
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		sc.close();
		
		
		
	}
	
	
}
