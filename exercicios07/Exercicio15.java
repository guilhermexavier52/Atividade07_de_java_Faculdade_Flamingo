package exercicios07;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicitar informações do empregado
	        System.out.print("Digite o número do empregado (código): ");
	        int codigoEmpregado = scanner.nextInt();

	        System.out.print("Digite o ano de nascimento do empregado: ");
	        int anoNascimento = scanner.nextInt();

	        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
	        int anoIngressoEmpresa = scanner.nextInt();

	        // Calcular idade e tempo de trabalho
	        int idade = calcularIdade(anoNascimento);
	        int tempoTrabalho = calcularTempoTrabalho(anoIngressoEmpresa);

	        // Verificar se o empregado atende aos requisitos de aposentadoria
	        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
	            System.out.println("Idade: " + idade + " anos");
	            System.out.println("Codigo do funcionario "+ codigoEmpregado +" Tempo de trabalho: " + tempoTrabalho + " anos");
	            System.out.println("Requerer aposentadoria");
	        } else {
	            System.out.println("Idade: " + idade + " anos");
	            System.out.println("Codigo do funcionario "+ codigoEmpregado +" Tempo de trabalho: " + tempoTrabalho + " anos");
	            System.out.println("Não requerer");
	        }

	        scanner.close();
	    }

	    // Método para calcular a idade com base no ano de nascimento
	    public static int calcularIdade(int anoNascimento) {
	        int anoAtual = 2024; // Você pode ajustar para o ano atual
	        return anoAtual - anoNascimento;
	    }

	    // Método para calcular o tempo de trabalho com base no ano de ingresso na empresa
	    public static int calcularTempoTrabalho(int anoIngressoEmpresa) {
	        int anoAtual = 2024; // Você pode ajustar para o ano atual
	        return anoAtual - anoIngressoEmpresa;
	    }
	}