package exercicios07;

/*Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
 *(considere que as idades dos homens serão sempre diferentes entre si,
  bem como as das mulheres). Calcule e escreva a soma das idades do homem
  mais velho com a mulher mais nova, e o produto das idades do homem mais
  novo com a mulher mais velha.*/

import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  try {
		System.out.println("Digite a idade do Primeiro homem: ");
		int idadeHomem1 = sc.nextInt();
		
		System.out.println("Digite a idade do Segundo homem: ");
		int idadeHomem2 = sc.nextInt();
		
		
		System.out.println("Digite a idade do Primeira mulher: ");
		int idadeMulher1 = sc.nextInt();
		
		  
		System.out.println("Digite a idade do Segunda mulher: ");
		int idadeMulher2 = sc.nextInt();
		
		int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
		
		int produtoIdade = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);
		
		System.out.println("A sooma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
		System.out.println("O produto das idades do homem mais novo com a mlher mais velha é: " + produtoIdade);  
	} catch (Exception e) {
		System.out.println("Digite uma informação valido.");
	}
	  
	  
	  sc.close();
}
	
}
