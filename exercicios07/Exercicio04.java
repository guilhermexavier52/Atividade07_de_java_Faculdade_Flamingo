package exercicios07;
/*Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
  crescente.*/


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.println("Digite o primeiro valor:");
	        int valor1 = sc.nextInt();

	        System.out.println("Digite o segundo valor:");
	        int valor2 = sc.nextInt();

	        System.out.println("Digite o terceiro valor:");
	        int valor3 = sc.nextInt();

	        // Algoritmo de ordenação - Bubble Sort
	        int[] valores = {valor1, valor2, valor3};
	        int n = valores.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (valores[j] > valores[j + 1]) {
	                    // Troca os valores
	                    int temp = valores[j];
	                    valores[j] = valores[j + 1];
	                    valores[j + 1] = temp;
	                }
	            }
	        }

	        // Imprime os valores em ordem crescente
	        System.out.println("Valores em ordem crescente:");
	        for (int valor : valores) {
	            System.out.println(valor);
	        }
		} catch (Exception e) {
			System.out.println("Digite uma informação valida.");
		}
		
		sc.close();
	}
	
}
