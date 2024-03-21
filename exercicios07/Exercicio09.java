package exercicios07;
/*Escreva um algoritmo que leia o número de litros vendidos
 *e o tipo de combustível (codificado da seguinte forma: A-álcool,
 *G-gasolina), calcule e imprima o valor a ser pago pelo cliente
 *sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/


import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		
	   try {
		   System.out.print("Informe o tipo de combustível (A para Álcool, G para Gasolina): ");
	        char tipoCombustivel = sc.next().charAt(0);

	        // Solicitar o número de litros vendidos
	        System.out.print("Informe o número de litros vendidos: ");
	        double litrosVendidos = sc.nextDouble();

	        // Definir os preços dos combustíveis
	        double precoGasolina = 3.30;
	        double precoAlcool = 2.90;

	        // Calcular o valor a ser pago pelo cliente
	        double valorTotal;
	        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
	            valorTotal = litrosVendidos * precoAlcool;
	        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
	            valorTotal = litrosVendidos * precoGasolina;
	        } else {
	            System.out.println("Tipo de combustível inválido.");
	            return;
	        }

	        // Imprimir o valor a ser pago pelo cliente
	        System.out.println("Valor a ser pago: R$" + valorTotal);
		   
		
	} catch (Exception e) {
		System.out.println("Digite uma informação valido"); 
	}
	   
	   
	   
	   sc.close();
	}
	
}
