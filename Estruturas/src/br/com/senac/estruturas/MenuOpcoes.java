package br.com.senac.estruturas;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuOpcoes {

	public static void main(String[] args) {
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Sistemas Operacionais: ");
		System.out.println("1. Linux");
		System.out.println("2. Windows");
		System.out.println("");
		System.out.print("Digite a op��o desejada: ");
		menu = teclado.nextInt();
		//exemplo de uso do Switch Case
		switch (menu) {
		case 1:
			linux();
			break;
		case 2:
			windons();
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}

	}
	
	/*criando m�todos*/
	/* o main s� pode executar (chamar) m�todos est�ticos*/
	public static void windons() {
		System.out.println("Carregando o Windons ...............");
	}

	public static void linux() {
		System.out.println("Carregando o Linux ..................");
	}
	
}
