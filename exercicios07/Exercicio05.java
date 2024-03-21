package exercicios07;
/*Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo
 *e escrever se formam ou não um triângulo. OBS: para formar um triângulo, o 
 *valor de cada lado deve ser menor que a soma dos outros 2 lados.*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Digite o valor do lado A:");
	        double ladoA = sc.nextDouble();

	        System.out.println("Digite o valor do lado B:");
	        double ladoB = sc.nextDouble();

	        System.out.println("Digite o valor do lado C:");
	        double ladoC = sc.nextDouble();

	        // Verificar se os valores formam um triângulo
	        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
	            System.out.println("Os valores formam um triângulo.");
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }
			
		} catch (Exception e) {
			System.out.println("Digite um valor valido.");
		}
		
		sc.close();
	}
}
