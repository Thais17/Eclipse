package br.com.senac.estruturas;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {

		// a linha abaixo cria uma vari�vel que aceita um �nico caractere da tabela
		// ASCII;
		// para atribuir um caractere a vari�vel do tipo char usamos 'aspas simples'
		char opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("__________ Jogo do Dado ___________");
		System.out.println("");
		// exemplo de uso da estrutura (do while)
		do {
			// Random � uma classe que gera n�meros aleat�rios
			Random sorteio = new Random();
			int dado = sorteio.nextInt(6) + 1; // (gera n�meros entre 0 e 5)
			System.out.println("Face sorteada: " + dado);
			System.out.print("Deseja jogar novamente (s/n) ");
			//charAt(0) - obtem apenas o 1� caractere digitado (ex: sim)
			opcao = teclado.next().charAt(0);
		} while (opcao == 's');

	}

}
