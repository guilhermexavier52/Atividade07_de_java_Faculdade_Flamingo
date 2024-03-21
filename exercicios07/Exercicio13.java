package exercicios07;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite a descrição do produto:");
	        String descricao = sc.nextLine();

	        System.out.println("Digite a quantidade adquirida:");
	        int quantidade = sc.nextInt();

	        System.out.println("Digite o preço unitário:");
	        double precoUnitario = sc.nextDouble();

	        // Cálculo do total
	        double total = quantidade * precoUnitario;

	        // Cálculo do desconto
	        double desconto;
	        if (quantidade <= 5) {
	            desconto = total * 0.02; // 2% de desconto
	        } else if (quantidade <= 10) {
	            desconto = total * 0.03; // 3% de desconto
	        } else {
	            desconto = total * 0.05; // 5% de desconto
	        }

	        // Cálculo do total a pagar
	        double totalPagar = total - desconto;

	        // Saída dos resultados
	        System.out.println("Descrição do produto: " + descricao);
	        System.out.println("Quantidade adquirida: " + quantidade);
	        System.out.println("Preço unitário: R$ " + precoUnitario);
	        System.out.println("Total: R$ " + total);
	        System.out.println("Desconto: R$ " + desconto);
	        System.out.println("Total a pagar: R$ " + totalPagar);

		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
		
		
		sc.close();
	}
	
}
