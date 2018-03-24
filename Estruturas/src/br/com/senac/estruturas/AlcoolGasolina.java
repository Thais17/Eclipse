package br.com.senac.estruturas;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		double gasolina, alcool;
				
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Calculadora FLEX");
		System.out.println("Valor do Etanol: R$ ");
		alcool = teclado.nextDouble();
		System.out.println("Valor da Gasolina: R$ ");
		gasolina = teclado.nextDouble();
		
		if (alcool <= gasolina *0.70)  {
			System.out.println("Abasteça com Etanol");
		}else {
			System.out.println("Abasteça com Gasolina");
		}
		

	}

}
