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
		System.out.print("Digite a opção desejada: ");
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
			System.out.println("Opção inválida");
			break;
		}

	}
	
	/*criando métodos*/
	/* o main só pode executar (chamar) métodos estáticos*/
	public static void windons() {
		System.out.println("Carregando o Windons ...............");
	}

	public static void linux() {
		System.out.println("Carregando o Linux ..................");
	}
	
}
