package exercicios07;

import java.util.Scanner;

/*Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.

*/

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Digite o primeiro numero: ");
			int valor1 = sc.nextInt();
			
			System.out.println("Digite o segundo valor: ");
            int valor2 = sc.nextInt();
            
                     
            
            if(valor1 == valor2) {
            	System.out.println("Numeros iguais: ");
            }else if(valor1 > valor2) {
            	System.out.println("O Primeiro é mairo.");
            }else {
            	System.out.println("O Segundo é maior.");
            }
            
            
            
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}

		sc.close();
	}

}
