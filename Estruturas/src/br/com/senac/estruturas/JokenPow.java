package br.com.senac.estruturas;

import java.util.Random;
import java.util.Scanner;

public class JokenPow {

	public static void main(String[] args) {
		int dedosJogador1;
		int dedosJogador2;
		int pontosJogador1 = 0;
		int pontosJogador2 = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("Joken Pow ");
			System.out.println("");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.println("");
			System.out.print("Digite a opção desejada: ");
			dedosJogador1 = teclado.nextInt();

			Random sorteio = new Random();
			dedosJogador2 = sorteio.nextInt(3) + 1;
			System.out.println("Jogada Computador: " + dedosJogador2);
			
			switch (dedosJogador1) {
			case 1:
				System.out.println("Jogador jogou Pedra!");
				break;
			case 2:
				System.out.println("Jogador jogou Papel!");
				break;
			case 3:
				System.out.println("Jogador jogou Tesoura!");
				break;
			default:
				System.out.println("Jogada inválida. Digite números de 1 a 3.");
				break;
			}
			
			switch (dedosJogador2) {
			case 1:
				System.out.println("Computador jogou Pedra!");
				break;
			case 2:
				System.out.println("Computador jogou Papel!");
				break;
			case 3:
				System.out.println("Computador jogou Tesoura!");
				break;
			default:
				System.out.println("Jogada inválida. Digite números de 1 a 3.");
				break;
			}

			if (dedosJogador1 == dedosJogador2) {
				System.out.println("EMPATE!");
			} else if (dedosJogador1 == 1 && dedosJogador2 == 2) {
				// jogador1 pedra e jog2 papel
				System.out.println("Computador Venceu!");
				//pontosJogador2 = dedosJogador2 + 1;
				pontosJogador2++;
			} else if (dedosJogador1 == 1 && dedosJogador2 == 3) {
				System.out.println("Jogador Venceu!");
				pontosJogador1++;
			} else if (dedosJogador1 == 2 && dedosJogador2 == 1) {
				System.out.println("Jogador Venceu!");
				pontosJogador1++;
			} else if (dedosJogador1 == 2 && dedosJogador2 == 3) {
				System.out.println("Computador Venceu!");
				pontosJogador2++;
			} else if (dedosJogador1 == 3 && dedosJogador2 == 1) {
				System.out.println("Computador Venceu!");
				pontosJogador2++;
			} else if (dedosJogador1 == 3 && dedosJogador2 == 2){
				System.out.println("Jogador Venceu!");
				pontosJogador1++;
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Placar");			
			System.out.println("Jogador: " + pontosJogador1 + " X " + "Computador: " + pontosJogador2);
			System.out.println("---------------------------------------------------------------------");
			
		}

	}

}
