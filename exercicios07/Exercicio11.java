package exercicios07;

/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este 
total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos 
e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite o peso do morango em kilogramas: ");
			double quantidadeMorango = sc.nextDouble();
			System.out.println("Digite o peso da maçã em kilogramas: ");
			double quantidadeMaca = sc.nextDouble();
			
			
			double precoMorango;
			if(quantidadeMorango <= 5) {
				precoMorango = quantidadeMorango * 2.50;
			}else {
				precoMorango = quantidadeMorango * 2.20;
			}
			
			double precoMaca;
			if(quantidadeMaca <= 5 ) {
				precoMaca = quantidadeMaca * 1.80;
			}else {
				precoMaca = quantidadeMaca * 1.50;
			}
			
			double valorTotal = precoMorango + precoMaca;
			if(quantidadeMorango + quantidadeMaca > 8 || valorTotal > 25.00) {
				valorTotal *= 0.90;
			}
			System.out.println("Valor total a ser pago: R$ " + valorTotal);
			
		} catch (Exception e) {
			System.out.println("Digite ma informação valida.");
		}
		
		
		sc.close();
	}
	
	
}
