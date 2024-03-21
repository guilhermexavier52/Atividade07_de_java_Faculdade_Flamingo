package exercicios07;

//Ler um valor e escrever se é positivo, negativo ou zero.


import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			
			if(numero > 0) {
				
				System.out.println(numero + " É positivo.");
			
			}else if (numero < 0) {
				
				System.out.println(numero + "  É negativo");
			}else {
				
				System.out.println("O numero e zero");
				
			}
			
		} catch (Exception e) {
			System.out.println("Digite uma informação valida");
		}
			
		sc.close();
	}
	
}
