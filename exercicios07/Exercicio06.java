package exercicios07;
/*Ler o nome de 2 times e o número de gols marcados na partida 
 *(para cada time). Escrever o nome do vencedor. Caso não haja 
 *vencedor deverá ser impressa a palavra EMPATE.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Ler o nome dos times
	        System.out.println("Digite o nome do primeiro time:");
	        String time1 = sc.nextLine();
	        
	        System.out.println("Digite o nome do segundo time:");
	        String time2 = sc.nextLine();
	        
	        // Ler o número de gols marcados por cada time
	        System.out.println("Digite o número de gols marcados por " + time1 + ":");
	        int golsTime1 = sc.nextInt();
	        
	        System.out.println("Digite o número de gols marcados por " + time2 + ":");
	        int golsTime2 = sc.nextInt();
	        
	        // Determinar o vencedor ou se houve empate
	        if (golsTime1 > golsTime2) {
	            System.out.println("O vencedor é: " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("O vencedor é: " + time2);
	        } else {
	            System.out.println("EMPATE");
	        }
		} catch (Exception e) {
			System.out.println("Digite um valor valido");
		}
		sc.close();
	}
}
